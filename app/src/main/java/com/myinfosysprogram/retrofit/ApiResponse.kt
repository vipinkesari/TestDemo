package com.myinfosysprogram.retrofit

import android.util.Log
import retrofit2.Response
import java.io.IOException
import java.net.UnknownHostException

class ApiResponse<T> {
    var code = 0
    var body: T? = null
    var errorMessage: String? = null

     constructor(error: Throwable) {
        code =
            if (error is UnknownHostException) ApiResponseStatusCode.INTERNET_ERROR else ApiResponseStatusCode.DATABASE_ERROR
        body = null
        errorMessage = error.message
    }

    constructor(response: Response<T>) {
        code = response.code()
        if (response.isSuccessful) {
            body = response.body()
            errorMessage = null
        } else {
            var message: String? = null
            if (response.errorBody() != null) {
                try {
                    message = response.errorBody()!!.string()
                } catch (ignored: IOException) {
                    Log.e(ignored.toString(), "error while parsing response")
                }
            }
            if (message == null || message.trim { it <= ' ' }.isEmpty()) {
                message = response.message()
            }
            errorMessage = message
            body = null
        }
    }

    fun isSuccessful(): Boolean {
        return code >= ApiResponseStatusCode.SUCCESS_200 && code < ApiResponseStatusCode.SUCCESS_300
    }




}