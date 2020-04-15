package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.prefrences.Prefrences
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.AbsentLiveData
import com.myinfosysprogram.retrofit.Resource
import org.koin.dsl.module
import java.util.*

val listViewModelModule = module{
        factory { ListViewModel(get()) }
}
class ListViewModel(private val generalRepository: GeneralRepository) : ViewModel(){

    //var generalRepository: GeneralRepository = GeneralRepository()

    var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    var listResponseLiveData: LiveData<Resource<ListResponse>>

    init {
        listResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap generalRepository.getGeneralListApi()
        }
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getListResponse() = listResponseLiveData
}