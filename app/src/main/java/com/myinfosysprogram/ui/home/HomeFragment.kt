package com.myinfosysprogram.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
import com.myinfosysprogram.viewModel.ListViewModel
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : BaseFragment() {

    lateinit var listViewModel: ListViewModel
    lateinit var listObserver: Observer<Resource<ListResponse>>
    lateinit var refreshUIObserver: Observer<Boolean>
    lateinit var mAdapter: ListDataAdapter
    var listRes: ArrayList<Rows> = arrayListOf();

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
        initUI();
    }


    private fun initUI() {
        listViewModel = ViewModelProvider(requireActivity()).get(ListViewModel::class.java)
        progressBar.visibility = View.GONE
        homeSwipeRefreshView.setOnRefreshListener {
            homeSwipeRefreshView.isRefreshing = false
            if (verifyAvailableNetwork(requireContext(), homeParentLyt))
                getList()
        }

        initObserver()
        initAdapter();
    }



    private fun getList() {

        progressBar.visibility = View.VISIBLE
        var request = GeneralRequest()
        listViewModel.getGeneralMutableRequest(request)
        listViewModel.listResponseLiveData.observe(viewLifecycleOwner, listObserver)
    }

    private fun initAdapter() {
        mAdapter = ListDataAdapter(listRes, requireContext())
        homeRv.adapter = mAdapter

        verifyAvailableNetwork(requireContext(), homeParentLyt)
        getList()
    }

    private fun initObserver() {
        listObserver = Observer {
            if (it.Success && it.data != null) {
                val listResponse: ListResponse = it.data as ListResponse

                if (listRes?.size > 0)
                    listRes.clear()

                if (listResponse.title != null) {
                    listViewModel.updateTitle(listResponse.title)
                }

                if (listResponse.rows == null) {
                    showShackBarMsg(
                        homeParentLyt,
                        requireActivity().resources.getString(R.string.msg_no_internet)
                    )
                } else {
                    if (listResponse.rows?.size > 0) {
                        listRes.addAll(listResponse.rows)
                    } else {
                        showShackBarMsg(
                            homeParentLyt,
                            requireActivity().resources.getString(R.string.msg_no_data)
                        )
                    }

                    if (mAdapter != null)
                        mAdapter.notifyDataSetChanged()
                }
            }
            progressBar.visibility = View.GONE
        }

        refreshUIObserver = Observer {
            homeSwipeRefreshView.isRefreshing = false
            if (verifyAvailableNetwork(requireContext(), homeParentLyt))
                getList()
        }
        listViewModel.refreshUIMutableLiveData.observe(viewLifecycleOwner, refreshUIObserver)
    }

}
