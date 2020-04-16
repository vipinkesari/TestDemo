package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.Resource
import org.koin.dsl.module

val listViewModelModule = module {
    factory { ListViewModel(get()) }
}

class ListViewModel(private val generalRepository: GeneralRepository) : ViewModel() {

    //var generalRepository: GeneralRepository = GeneralRepository()

    private var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    private var listResponseLiveData: LiveData<Resource<ListResponse>>

    private var titleUpdateMutableLiveData = MutableLiveData<List<ListResponse>>()
    private var listUpdateMutableLiveData = MutableLiveData<List<Rows>>()

    init {
        listResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap generalRepository.getGeneralListApi()
        }
    }

    fun updateDatabase(list: ArrayList<Rows>, title: String) {
        generalRepository.saveData(list, title)
    }

    fun getRowsData() {
        val list = generalRepository.getRowsListFromDb()
        val title = generalRepository.getTitleFromDb()

        titleUpdateMutableLiveData.value = title
        listUpdateMutableLiveData.value = list
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getListResponse() = listResponseLiveData

    fun updateTitleFromDBResponse() = titleUpdateMutableLiveData

    fun updateListFromDBResponse() = listUpdateMutableLiveData
}