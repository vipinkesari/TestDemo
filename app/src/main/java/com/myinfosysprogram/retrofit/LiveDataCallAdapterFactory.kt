package com.myinfosysprogram.retrofit

import androidx.lifecycle.LiveData
import com.myinfosysprogram.constants.ApiConstants
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

class LiveDataCallAdapterFactory : CallAdapter.Factory() {
    override fun get(
        returnType: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): CallAdapter<*, *>? {
        if (getRawType(returnType) != LiveData::class.java) {
            return null
        }
        val observableType =
            getParameterUpperBound(
                0,
                returnType as ParameterizedType
            )
        val rawObservableType =
            getRawType(observableType)
        if (rawObservableType != ApiResponse::class.java) {
            throw IllegalArgumentException(ApiConstants.RESOURCE_ERROR_TYPE)
        }
        if (observableType !is ParameterizedType) {
            throw IllegalArgumentException(ApiConstants.RESOURCE_ERROR_PARAMETER)
        }
        val bodyType = getParameterUpperBound(
            0,
            observableType
        )
        return LiveDataCallAdapter<Type>(bodyType)
    }
}