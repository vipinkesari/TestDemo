package com.myinfosysprogram.roomDb

import androidx.room.*
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows
import kotlinx.coroutines.Deferred

@Dao
interface TitleDao {

    @Delete
    suspend fun deleteUser(title: ListResponse)
}