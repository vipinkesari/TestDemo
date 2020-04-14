package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData
import com.myinfosysprogram.constants.ApiConstants
import com.myinfosysprogram.model.response.ListResponse
import retrofit2.http.GET

interface RetrofitService {

    @GET(ApiConstants.GET_NEWS_LIST)
    fun getListData(): LiveData<ApiResponse<ListResponse>>

}