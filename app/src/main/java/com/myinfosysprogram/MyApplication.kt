package com.myinfosysprogram

import android.app.Application
import com.myinfosysprogram.prefrences.prefModule
import com.myinfosysprogram.repository.repositoryModule
import com.myinfosysprogram.retrofit.networkModule
import com.myinfosysprogram.roomDb.databaseModule
import com.myinfosysprogram.viewModel.listViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/* application class contains all application level data*/
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    prefModule,
                    listViewModelModule,
                    networkModule,
                    repositoryModule,
                    databaseModule
                )
            )
        }
    }
}