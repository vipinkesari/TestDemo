package com.myinfosysprogram

import android.app.Application
import com.google.android.libraries.places.api.Places
import com.myinfosysprogram.prefrences.prefModule
import com.myinfosysprogram.repository.repositoryModule
import com.myinfosysprogram.repository.repositoryUserModule
import com.myinfosysprogram.retrofit.networkModule
import com.myinfosysprogram.roomDb.databaseModule
import com.myinfosysprogram.viewModel.listViewModelModule
import com.myinfosysprogram.viewModel.userViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/* application class contains all application level data*/
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize the SDK
        Places.initialize(this, "AIzaSyCDyfBYZfumOMu_zICFmDUkmywY9r3EU-0")

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    prefModule,
                    listViewModelModule,
                    userViewModelModule,
                    networkModule,
                    repositoryModule,
                    repositoryUserModule,
                    databaseModule
                )
            )
        }
    }
}