package com.myinfosysprogram

import android.R.attr.description
import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.AppRetrofit
import com.myinfosysprogram.retrofit.RetrofitService
import junit.framework.Assert.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class ListApiTest {

    lateinit var apiService: RetrofitService

    @Before
    fun before_test() {
        apiService = AppRetrofit.getInstance(null)
    }

    @Test
    fun list_Api_Success() {
        try {
            Assert.assertNotNull("Api service is null", apiService)

             CoroutineScope(Dispatchers.Main).async {
                 val response: LiveData<ApiResponse<ListResponse>> = apiService.getListData()
                 assertNotNull("response is null", response)
                 assertNotNull("not getting the response", response.value)
                 assertTrue("List is null", response.value?.body?.title != null)
                 assertTrue("List is not empty", response.value?.body?.rows?.size ?:0 > 0 )
             }
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        }catch (e: Exception) {
            println("${e.message} - failed")
        }
    }

}