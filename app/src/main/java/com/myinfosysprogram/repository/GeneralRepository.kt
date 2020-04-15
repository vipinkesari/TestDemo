package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.retrofit.*
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import org.koin.dsl.module

val repositoryModule= module {
    factory { GeneralRepository(get())
    }
}

open class GeneralRepository(private val apiService: RetrofitService) : BaseRepository() {

   // var apiService: RetrofitService = AppRetrofit.getInstance()

    fun getGeneralListApi(): LiveData<Resource<ListResponse>> {
        return object : NetworkBoundWtDbRes<ListResponse, ListResponse>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<ListResponse>> {
                return apiService.getListData()
            }
        }.asLiveData()
    }

}

