package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ApiUtil {
    companion object {
        fun <T> successCall(data: T): LiveData<T> {
            return createCall(data)
        }

        fun <T> createCall(response: T): LiveData<T> {
            val data = MutableLiveData<T>()
            data.value = response
            return data
        }
    }
}