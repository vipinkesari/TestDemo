package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData

class AbsentLiveData<T> : LiveData<T>() {
    companion object {
        fun <T> create(): LiveData<T> {
            return AbsentLiveData()
        }
    }

    init {
        postValue(null)
    }
}