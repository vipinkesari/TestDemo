package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.AbsentLiveData
import com.myinfosysprogram.retrofit.Resource
import java.util.*

class ListViewModel : BaseViewModel(){

    var generalRepository: GeneralRepository = GeneralRepository()

    var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    var listResponseLiveData: LiveData<Resource<ListResponse>>

    var titleUpdateMutableLiveData  = MutableLiveData<String>()
    var refreshUIMutableLiveData  = MutableLiveData<Boolean>()

    init {
        listResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap generalRepository.getCategoryApi(input)
        }
    }

    fun updateTitle(str : String){
        titleUpdateMutableLiveData.postValue(str)
    }

    fun refreshHomeUI(){
        refreshUIMutableLiveData.postValue(true)
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getListResponse() = listResponseLiveData
}