package com.myinfosysprogram.roomDb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.myinfosysprogram.model.response.PhotoRows
import com.myinfosysprogram.model.response.UserRows

@Dao
interface RowsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRow(rows: PhotoRows)

    @Query("Select * from list_rows")
    fun getAllRows(): List<PhotoRows>

    @Query("DELETE FROM list_rows")
    fun nukeTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserRow(rows: UserRows)

    @Query("Select * from user_rows")
    fun getAllUserRows(): List<UserRows>

    @Query("DELETE FROM user_rows")
    fun nukeUserTable()
}