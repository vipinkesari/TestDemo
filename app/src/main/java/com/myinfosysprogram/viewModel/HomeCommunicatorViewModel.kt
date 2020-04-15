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


class HomeCommunicatorViewModel : ViewModel(){

    var titleUpdateMutableLiveData  = MutableLiveData<String>()
    var refreshUIMutableLiveData  = MutableLiveData<Boolean>()

    fun updateTitle(str : String){
        titleUpdateMutableLiveData.postValue(str)
    }

    fun refreshHomeUI(){
        refreshUIMutableLiveData.postValue(true)
    }

}