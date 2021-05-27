package com.myinfosysprogram.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.adapter.ListDataAdapter
import com.myinfosysprogram.utils.SwipeToDeleteCallback
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.PhotoRows
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.utils.showShackBarMsg
import com.myinfosysprogram.utils.verifyAvailableNetwork
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import com.myinfosysprogram.viewModel.ListViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
class HomeFragment : BaseFragment() {

    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private val listViewModel: ListViewModel by viewModel()

    private lateinit var listObserver: Observer<Resource<List<PhotoRows>>>
    private lateinit var updateListObserver: Observer<List<PhotoRows>>

    private lateinit var mAdapter: ListDataAdapter
    private var listRes: ArrayList<PhotoRows> = arrayListOf()

    private fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        communicatorViewModel =
            ViewModelProvider(requireActivity()).get(HomeCommunicatorViewModel::class.java)

        homeSwipeRefreshView.setOnRefreshListener {
            homeSwipeRefreshView.isRefreshing = false
            if (verifyAvailableNetwork(requireContext(), homeParentLyt))
                getList()
            else {
                getRowsFromDB()
            }
        }

        userListCta.setOnClickListener {
            // move to user list screen
            Navigation.findNavController(it).navigate(R.id.action_photoFragment_to_userFragment)
        }

        progressBar.visibility = View.GONE
        noDataMsgTv.visibility = View.GONE

        initObserver()
        initAdapter()
    }

    /* method to communicate with view model to fetch the list from server */
    private fun getList() {
        progressBar.visibility = View.VISIBLE
        homeSwipeRefreshView.isRefreshing = false
        val request = GeneralRequest()
        listViewModel.getGeneralMutableRequest(request)
        listViewModel.getListResponse().observe(viewLifecycleOwner, listObserver)

    }

    /* adapter is initialise to show data using RV*/
    private fun initAdapter() {
        mAdapter = ListDataAdapter(listRes, requireContext())
        homeRv.adapter = mAdapter

        val swipeHandler = object : SwipeToDeleteCallback(requireContext()) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter = homeRv.adapter as ListDataAdapter
                listRes.removeAt(viewHolder.adapterPosition)
                adapter.notifyDataSetChanged()
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(homeRv)

        CoroutineScope(Dispatchers.Main).launch {
            delay(500)
            if (verifyAvailableNetwork(requireContext(), homeParentLyt))
                getList()
            else
                getRowsFromDB()
        }
    }

    /* this fun defines the observer of the current view model used in fragment */
    private fun initObserver() {
        listObserver = Observer {
            if (it.success && it.data != null) {
                val listResponse: List<PhotoRows>? = it.data as? List<PhotoRows>

                if (listRes.isNotEmpty())
                    listRes.clear()

                if (listResponse.isNullOrEmpty()) {
                    showShackBarMsg(
                        homeParentLyt,
                        requireActivity().resources.getString(R.string.msg_no_data)
                    )
                    noDataMsgTv.visibility = View.VISIBLE
                } else {
                    listRes.addAll(listResponse)
                    noDataMsgTv.visibility = View.GONE
                }
                mAdapter.notifyDataSetChanged()

                /* check DB work */
                updateDataIntoTable()

                progressBar.visibility = View.GONE
                homeSwipeRefreshView.isRefreshing = false

                if (listRes.isEmpty()) {
                    noDataMsgTv.visibility = View.VISIBLE
                } else {
                    noDataMsgTv.visibility = View.GONE
                }
            }else{
                progressBar.visibility = View.GONE
                homeSwipeRefreshView.isRefreshing = false
            }
        }

        updateListObserver = Observer {
            if (it != null && it.isNotEmpty()) {
                if (listRes.isNotEmpty())
                    listRes.clear()

                listRes.addAll(it)
                mAdapter.notifyDataSetChanged()

            } else {
                if (listRes.isEmpty()) {
                    noDataMsgTv.visibility = View.VISIBLE
                } else {
                    noDataMsgTv.visibility = View.GONE
                }
            }
        }


        communicatorViewModel.updateTitle(getString(R.string.photo_page))
        communicatorViewModel.searchHomeUI(true)

        listViewModel.updateListFromDBResponse().observe(
            viewLifecycleOwner,
            updateListObserver
        )
    }

    private fun getRowsFromDB() {
        listViewModel.getRowsData()
    }

    private fun updateDataIntoTable() {
        listViewModel.updateDatabase(listRes)
    }
}
