package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.retrofit.*
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse


class GeneralRepository() : BaseRepository() {

    var apiService: RetrofitService = AppRetrofit.getInstance()

    fun getCategoryApi(request: GeneralRequest): LiveData<Resource<ListResponse>> {
        return object : NetworkBoundWtDbRes<ListResponse, ListResponse>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<ListResponse>> {
                return apiService.getListData()
            }
        }.asLiveData()
    }

}

