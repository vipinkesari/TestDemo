package com.myinfosysprogram.roomDb

import androidx.room.Room
import com.myinfosysprogram.constants.AppConstants
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, AppConstants.DB_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

    factory { get<AppDatabase>().rowsDao() }
}
