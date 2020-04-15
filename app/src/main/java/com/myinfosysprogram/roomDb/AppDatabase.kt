package com.myinfosysprogram.roomDb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.myinfosysprogram.constants.AppConstants
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.model.response.Rows

@Database(entities = [ListResponse::class, Rows::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun rowsDao(): RowsDao

    /*companion object {
        var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase? {
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, AppConstants.DB_NAME).build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }*/
}