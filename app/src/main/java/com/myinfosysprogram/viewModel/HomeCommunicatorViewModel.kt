package com.myinfosysprogram.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.response.UserRows

class HomeCommunicatorViewModel : ViewModel() {

    var titleUpdateMutableLiveData = MutableLiveData<String>()
    var searchUIMutableLiveData = MutableLiveData<Boolean>()
    var placeName :String = ""
    var mapLocation : UserRows.Geo? = null

    fun updateTitle(str: String) {
        titleUpdateMutableLiveData.postValue(str)
    }

    fun searchHomeUI(status : Boolean) {
        searchUIMutableLiveData.postValue(status)
    }

}