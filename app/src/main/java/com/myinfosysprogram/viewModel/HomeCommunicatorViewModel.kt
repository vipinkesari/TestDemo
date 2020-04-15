package com.myinfosysprogram.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeCommunicatorViewModel : ViewModel() {

    var titleUpdateMutableLiveData = MutableLiveData<String>()
    var refreshUIMutableLiveData = MutableLiveData<Boolean>()

    fun updateTitle(str: String) {
        titleUpdateMutableLiveData.postValue(str)
    }

    fun refreshHomeUI() {
        refreshUIMutableLiveData.postValue(true)
    }

}