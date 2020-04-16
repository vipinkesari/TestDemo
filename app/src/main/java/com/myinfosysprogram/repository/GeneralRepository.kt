package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.NetworkBoundWtDbRes
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.roomDb.RowsDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.dsl.module

val repositoryModule = module {
    factory {
        GeneralRepository(get(), get())
    }
}

open class GeneralRepository(private val apiService: RetrofitService, private val rowDao: RowsDao) :
    BaseRepository() {

    // var apiService: RetrofitService = AppRetrofit.getInstance()
    //val data = rowDao.getAllRows()

    fun saveData(list: ArrayList<Rows>, title: String) {
        CoroutineScope(Dispatchers.IO).launch {
            rowDao.nukeTable()
            if (title.isNotEmpty())
                rowDao.insertTitle(ListResponse(title))
            for (item in list)
                rowDao.insertRow(item)
        }
    }

    fun getTitleFromDb(): List<ListResponse> {
        return rowDao.getTitle()
    }

    fun getRowsListFromDb(): List<Rows> {
        return rowDao.getAllRows()
    }


    fun getGeneralListApi(): LiveData<Resource<ListResponse>> {
        return object : NetworkBoundWtDbRes<ListResponse, ListResponse>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<ListResponse>> {
                val res = apiService.getListData()
                return res
            }
        }.asLiveData()
    }

}

