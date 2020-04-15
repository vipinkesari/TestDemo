package com.myinfosysprogram

import android.app.Application
import android.content.Context
import com.myinfosysprogram.prefrences.prefModule
import com.myinfosysprogram.repository.repositoryModule
import com.myinfosysprogram.retrofit.networkModule
import com.myinfosysprogram.viewModel.listViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/* application class contains all application level data*/
class MyApplication : Application(){

    companion object {
        lateinit var context: Context

        fun getAppContext(): Context {
            return context
        }
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(listOf(prefModule, listViewModelModule, networkModule, repositoryModule))
        }
    }



}