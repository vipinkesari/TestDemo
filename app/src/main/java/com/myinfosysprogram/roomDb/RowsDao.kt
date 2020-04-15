package com.myinfosysprogram.roomDb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows

@Dao
interface RowsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRow(rows: ListResponse)

    @Query("Select * from list_rows")
    fun getAllRows(): List<Rows>
}