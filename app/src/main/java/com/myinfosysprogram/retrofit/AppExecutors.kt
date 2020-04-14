package com.myinfosysprogram.retrofit

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class AppExecutors {
    private var mDiskIO: Executor
    var mNetworkIO: Executor
    var mMainThread: Executor

    constructor(){
        mDiskIO = Executors.newSingleThreadExecutor()
        mNetworkIO = Executors.newFixedThreadPool(3)
        mMainThread = MainThreadExecutor()
    }

    constructor (diskIO: Executor, networkIO: Executor, mainThread: Executor) {
        mDiskIO = diskIO
        mNetworkIO = networkIO
        mMainThread = mainThread
    }

    companion object {
        private class MainThreadExecutor : Executor {
            private val mainThreadHandler =
                Handler(Looper.getMainLooper())

            override fun execute(command: Runnable) {
                mainThreadHandler.post(command)
            }
        }
    }

    fun diskIO(): Executor {
        return mDiskIO;
    }

    fun networkIO(): Executor {
        return mNetworkIO
    }

    fun mainThreadIO(): Executor {
        return mMainThread
    }
}