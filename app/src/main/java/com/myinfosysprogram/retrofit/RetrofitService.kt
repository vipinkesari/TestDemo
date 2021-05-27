package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData
import com.myinfosysprogram.constants.ApiConstants
import com.myinfosysprogram.model.response.PhotoRows
import com.myinfosysprogram.model.response.UserRows
import retrofit2.http.GET

interface RetrofitService {

    @GET(ApiConstants.GET_PHOTO_LIST)
    fun getPhotoListData(): LiveData<ApiResponse<List<PhotoRows>>>

    @GET(ApiConstants.GET_USER_LIST)
    fun getUserListData(): LiveData<ApiResponse<List<UserRows>>>

}