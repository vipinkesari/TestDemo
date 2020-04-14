package com.myinfosysprogram.retrofit

import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.myinfosysprogram.constants.ApiConstants

abstract class NetworkBoundWtDbRes<ResultType, RequestType> @MainThread protected constructor(
    private val appExecutors: AppExecutors
) {
    private val result =
        MediatorLiveData<Resource<ResultType>>()

    init {
        setNetworkBoundResource()
    }

    private fun setNetworkBoundResource() {
        result.value = (
            Resource.loading<Any>(
                null,
                ApiConstants.ZERO_STATUS_CODE
            ) as Resource<ResultType>
        )
        val resultTypeLiveData: LiveData<ResultType> =
            AbsentLiveData.create()
        fetchFromNetwork(resultTypeLiveData)
    }

    private fun fetchFromNetwork(resultTypeLiveData: LiveData<ResultType>) {
        val apiResponse = createCall()
        result.addSource(
            apiResponse
        ) { resultTypeApiResponse ->
            result.removeSource(apiResponse)
            result.removeSource(resultTypeLiveData)
            if (resultTypeApiResponse!!.isSuccessful()) {
                result.addSource(
                    ApiUtil.successCall(
                        resultTypeApiResponse.body
                    )
                ) { resultType ->
                    result.value = Resource.success(
                        resultType,
                        resultTypeApiResponse.code
                    )
                }
            } else {
                onFetchFailed()
                result.addSource(
                    resultTypeLiveData
                ) { newData ->
                    result.value = Resource.error(
                        resultTypeApiResponse.errorMessage,
                        newData,
                        resultTypeApiResponse.code
                    )
                }
            }
        }
    }

    private fun onFetchFailed() {}
    fun asLiveData(): LiveData<Resource<ResultType>> {
        return result
    }

    @MainThread
    abstract fun createCall(): LiveData<ApiResponse<ResultType>>

}