package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.PhotoRows
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.Resource
import org.koin.dsl.module

val listViewModelModule = module {
    factory { ListViewModel(get()) }
}

class ListViewModel(private val generalRepository: GeneralRepository) : ViewModel() {

    private var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    private var listResponseLiveData: LiveData<Resource<List<PhotoRows>>>
    private var listUpdateMutableLiveData = MutableLiveData<List<PhotoRows>>()

    init {
        listResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap generalRepository.getPhotoListApi()
        }
    }

    fun updateDatabase(list: ArrayList<PhotoRows>) {
        generalRepository.savePhotoData(list)
    }

    fun getRowsData() {
        val list = generalRepository.getRowsListFromDb()
        listUpdateMutableLiveData.value = list
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getListResponse() = listResponseLiveData

    fun updateListFromDBResponse() = listUpdateMutableLiveData
}