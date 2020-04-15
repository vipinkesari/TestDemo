package com.myinfosysprogram.roomDb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows

@Dao
interface TitleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTitle(title: ListResponse)

    @Query("Select * from ListResponse")
    fun getTitle(): List<ListResponse>
}