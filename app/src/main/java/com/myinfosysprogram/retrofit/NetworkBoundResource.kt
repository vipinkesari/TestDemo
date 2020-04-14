package com.myinfosysprogram.retrofit

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.myinfosysprogram.constants.ApiConstants
import com.myinfosysprogram.constants.AppConstants

abstract class NetworkBoundResource<ResultType, RequestType> @MainThread protected constructor(
    private val appExecutors: AppExecutors
) {
    private val result =
        MediatorLiveData<Resource<ResultType>>()
    private val appService: RetrofitService? = null
    private fun setNetworkBoundResource() {
        result.setValue(
            Resource.loading<Any>(
                null,
                ApiConstants.ZERO_STATUS_CODE
            ) as Resource<ResultType>
        )
        val dbSource = loadFromDb()
        result.addSource(dbSource) { data: ResultType ->
            result.removeSource(dbSource)
            if (shouldFetch(data)) {
                fetchFromNetwork(dbSource)
            } else {
                result.addSource(
                    dbSource
                ) { newData: ResultType ->
                    result.setValue(
                        Resource.success(
                            newData,
                            ApiConstants.ZERO_STATUS_CODE
                        )
                    )
                }
            }
        }
    }

    private fun fetchFromNetwork(dbSource: LiveData<ResultType>) {
        val apiResponse = createCall()
        // we re-attach dbSource as a new source, it will dispatch its latest value quickly
        result.addSource(
            dbSource
        ) { newData: ResultType ->
            result.setValue(
                Resource.loading(
                    newData,
                    ApiConstants.ZERO_STATUS_CODE
                )
            )
        }
        result.addSource(
            apiResponse
        ) { response ->
            result.removeSource(apiResponse)
            result.removeSource(dbSource)
            if (response!!.isSuccessful()) {
                appExecutors.diskIO().execute {
                    processResponse(
                        response
                    )?.let {
                        saveCallResult(
                            it
                        )
                    }
                    appExecutors.mainThreadIO().execute {
                        result.addSource(
                            loadFromDb()
                        ) { newData ->
                            result.setValue(
                                Resource.success(
                                    newData,
                                    response.code
                                )
                            )
                        }
                    }
                }
            } else {
                onFetchFailed()
                result.addSource(
                    dbSource
                ) { newData ->
                    result.setValue(
                        Resource.error(
                            response.errorMessage,
                            newData,
                            response.code
                        )
                    )
                }
            }
        }
    }

    protected fun onFetchFailed() {}
    fun asLiveData(): LiveData<Resource<ResultType>> {
        return result
    }

    @WorkerThread
    protected fun processResponse(response: ApiResponse<RequestType>?): RequestType? {
        return response!!.body
    }

    @WorkerThread
    protected abstract fun saveCallResult(item: RequestType)

    @MainThread
    protected abstract fun shouldFetch(data: ResultType?): Boolean

    @MainThread
    protected abstract fun loadFromDb(): LiveData<ResultType>

    @MainThread
    protected abstract fun createCall(): LiveData<ApiResponse<RequestType>>

    init {
        setNetworkBoundResource()
    }
}