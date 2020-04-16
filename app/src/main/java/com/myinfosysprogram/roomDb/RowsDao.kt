package com.myinfosysprogram.roomDb

import androidx.room.*
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows
import kotlinx.coroutines.Deferred

@Dao
interface RowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRow(rows: Rows)

    @Query("Select * from list_rows")
    fun getAllRows(): List<Rows>

    @Query("DELETE FROM list_rows")
    fun nukeTable()

    @Query("DELETE FROM ListResponse")
    suspend fun nukeUserTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insertTitle(title: ListResponse)

    @Query("Select * from ListResponse")
    fun getTitle(): List<ListResponse>
}