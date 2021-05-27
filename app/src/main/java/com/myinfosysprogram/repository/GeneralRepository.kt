package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.response.PhotoRows
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.NetworkBoundWtDbRes
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.roomDb.RowsDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.koin.dsl.module

val repositoryModule = module {
    factory {
        GeneralRepository(get(), get())
    }
}

open class GeneralRepository(private val apiService: RetrofitService, private val rowDao: RowsDao) :
    BaseRepository() {

    fun savePhotoData(list: ArrayList<PhotoRows>) {
        CoroutineScope(Dispatchers.IO).async {
            rowDao.nukeTable()
            for (item in list)
                rowDao.insertRow(item)
        }
    }

    fun getRowsListFromDb(): List<PhotoRows> {
        return rowDao.getAllRows()
    }

    fun getPhotoListApi(): LiveData<Resource<List<PhotoRows>>> {
        return object : NetworkBoundWtDbRes<List<PhotoRows>, List<PhotoRows>>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<List<PhotoRows>>> {
                return apiService.getPhotoListData()

            }
        }.asLiveData()
    }
}

