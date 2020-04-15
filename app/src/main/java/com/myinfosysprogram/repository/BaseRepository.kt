package com.myinfosysprogram.repository

import com.myinfosysprogram.retrofit.AppExecutors

open class BaseRepository {
    var appExecutor: AppExecutors = AppExecutors()
}