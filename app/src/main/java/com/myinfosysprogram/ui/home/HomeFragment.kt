package com.myinfosysprogram.ui.home

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myinfosysprogram.R
import com.myinfosysprogram.adapter.ListDataAdapter
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.utils.showShackBarMsg
import com.myinfosysprogram.utils.verifyAvailableNetwork
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import com.myinfosysprogram.viewModel.ListViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
class HomeFragment : BaseFragment() {

    lateinit var communicatorViewModel: HomeCommunicatorViewModel
    val listViewModel: ListViewModel by viewModel()

    lateinit var listObserver: Observer<Resource<ListResponse>>
    lateinit var refreshUIObserver: Observer<Boolean>
    lateinit var updateListObserver: Observer<List<Rows>>
    lateinit var updateTitleObserver: Observer<List<ListResponse>>

    lateinit var mAdapter: ListDataAdapter
    var listRes: ArrayList<Rows> = arrayListOf()

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
                getDatafromDB()
            }
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

        if (verifyAvailableNetwork(requireContext(), homeParentLyt))
            getList()
        else
            getDatafromDB()
    }

    /* this fun defines the observer of the current view model used in fragment */
    private fun initObserver() {
        listObserver = Observer {
            if (it.Success && it.data != null) {
                val listResponse: ListResponse? = it.data as ListResponse

                if (listRes.isNotEmpty())
                    listRes.clear()

                val title = listResponse?.title ?: ""
                if (!TextUtils.isEmpty(title)) {
                    communicatorViewModel.updateTitle(title)
                }

                if (listResponse?.rows?.isEmpty() ?: true) {
                    showShackBarMsg(
                        homeParentLyt,
                        requireActivity().resources.getString(R.string.msg_no_data)
                    )
                    noDataMsgTv.visibility = View.VISIBLE
                } else {
                    listRes.addAll(listResponse!!.rows!!)
                    noDataMsgTv.visibility = View.GONE
                }
                mAdapter.notifyDataSetChanged()

                /* check DB work */
                updateDataIntoTable(title)

                progressBar.visibility = View.GONE
                homeSwipeRefreshView.isRefreshing = false

                if (listRes.isEmpty()) {
                    noDataMsgTv.visibility = View.VISIBLE
                } else {
                    noDataMsgTv.visibility = View.GONE
                }
            }


        }

        /* this observer is refresh the api data if network is connected */
        refreshUIObserver = Observer {
            if ((verifyAvailableNetwork(requireContext(), homeParentLyt))) {
                homeSwipeRefreshView.isRefreshing = true
                getList()
            } else {
                getDatafromDB()
            }

        }

        updateTitleObserver = Observer {
            if (it != null && it.isNotEmpty()) {
                communicatorViewModel.updateTitle(it.get(0).title)
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

        communicatorViewModel.refreshUIMutableLiveData.observe(
            viewLifecycleOwner,
            refreshUIObserver
        )

        listViewModel.updateTitleFromDBResponse().observe(
            viewLifecycleOwner,
            updateTitleObserver
        )

        listViewModel.updateListFromDBResonse().observe(
            viewLifecycleOwner,
            updateListObserver
        )
    }

    fun getDatafromDB() {
        listViewModel.getRowsData()
    }

    fun updateDataIntoTable(title: String) {
        listViewModel.updateDatabase(listRes, title)
    }

}
