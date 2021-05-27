package com.myinfosysprogram.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.myinfosysprogram.R
import com.myinfosysprogram.adapter.UserDataAdapter
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.interfaces.OnItemClickInterfaces
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.UserRows
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.utils.showShackBarMsg
import com.myinfosysprogram.utils.verifyAvailableNetwork
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import com.myinfosysprogram.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.homeRv
import kotlinx.android.synthetic.main.fragment_home.homeSwipeRefreshView
import kotlinx.android.synthetic.main.fragment_home.noDataMsgTv
import kotlinx.android.synthetic.main.fragment_home.progressBar
import kotlinx.android.synthetic.main.fragment_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [UserFragment] subclass as the default destination in the navigation.
 */
class UserFragment : BaseFragment(), OnItemClickInterfaces {

    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private val userListViewModel: UserViewModel by viewModel()

    private lateinit var listObserver: Observer<Resource<List<UserRows>>>
    private lateinit var updateListObserver: Observer<List<UserRows>>
    private lateinit var refreshUIObserver: Observer<Boolean>


    private lateinit var mAdapter: UserDataAdapter
    private var listRes: ArrayList<UserRows> = arrayListOf()

    private fun getLayoutId(): Int {
        return R.layout.fragment_user
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
            if (verifyAvailableNetwork(requireContext(), userParentLyt))
                getList()
            else {
                getRowsFromDB()
            }
        }

        communicatorViewModel.updateTitle(getString(R.string.user_page))
        communicatorViewModel.searchHomeUI(false)

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
        userListViewModel.getGeneralMutableRequest(request)
        userListViewModel.getUserListResponse().observe(viewLifecycleOwner, listObserver)

    }

    /* adapter is initialise to show data using RV*/
    private fun initAdapter() {
        mAdapter = UserDataAdapter(listRes, requireContext(), this)
        homeRv.adapter = mAdapter

        if (verifyAvailableNetwork(requireContext(), userParentLyt))
            getList()
        else
            getRowsFromDB()
    }

    /* this fun defines the observer of the current view model used in fragment */
    private fun initObserver() {
        listObserver = Observer {
            if (it.success && it.data != null) {
                val listResponse: List<UserRows>? = it.data as? List<UserRows>

                if (listRes.isNotEmpty())
                    listRes.clear()

                if (listResponse.isNullOrEmpty()) {
                    showShackBarMsg(
                        userParentLyt,
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
            } else {
                progressBar.visibility = View.GONE
                homeSwipeRefreshView.isRefreshing = false
            }
        }

        /* this observer is refresh the api data if network is connected */
        refreshUIObserver = Observer {
            if ((verifyAvailableNetwork(requireContext(), userParentLyt))) {
                homeSwipeRefreshView.isRefreshing = true
                getList()
            } else {
                getRowsFromDB()
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

        userListViewModel.updateUserListFromDBResponse().observe(
            viewLifecycleOwner,
            updateListObserver
        )
    }

    private fun getRowsFromDB() {
        userListViewModel.getUserRowsData()
    }

    private fun updateDataIntoTable() {
        userListViewModel.updateUserDatabase(listRes)
    }

    override fun onUserItemClick(pos: Int) {
        val data = listRes[pos]
        if (data.address?.geo != null) {
            communicatorViewModel.mapLocation = data.address?.geo
            communicatorViewModel.placeName = data.name ?: ""
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_userFragment_to_mapFragment)
        } else {
            Toast.makeText(requireContext(), getString(R.string.no_geo), Toast.LENGTH_LONG).show()
        }
    }
}
