package com.myinfosysprogram.repository

import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.response.UserRows
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.NetworkBoundWtDbRes
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.roomDb.RowsDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.dsl.module

val repositoryUserModule = module {
    factory {
        UserRepository(get(), get())
    }
}

open class UserRepository(private val apiService: RetrofitService, private val rowDao: RowsDao) :
    BaseRepository() {

    fun saveUserData(list: ArrayList<UserRows>) {
        CoroutineScope(Dispatchers.IO).launch {
            rowDao.nukeTable()
            for (item in list)
                rowDao.insertUserRow(item)
        }
    }

    fun getUserRowsListFromDb(): List<UserRows> {
        return rowDao.getAllUserRows()
    }

    fun getUserListApi(): LiveData<Resource<List<UserRows>>> {
        return object : NetworkBoundWtDbRes<List<UserRows>, List<UserRows>>(appExecutor) {
            override fun createCall(): LiveData<ApiResponse<List<UserRows>>> {
                return apiService.getUserListData()
            }
        }.asLiveData()
    }
}

