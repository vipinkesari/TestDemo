package com.myinfosysprogram.retrofit

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class AppExecutors {
    private var mDiskIO: Executor = Executors.newSingleThreadExecutor()
    private var mNetworkIO: Executor = Executors.newFixedThreadPool(3)
    private var mMainThread: Executor = MainThreadExecutor()

    /*constructor (diskIO: Executor, networkIO: Executor, mainThread: Executor) {
        mDiskIO = diskIO
        mNetworkIO = networkIO
        mMainThread = mainThread
    }*/

    companion object {
        private class MainThreadExecutor : Executor {
            private val mainThreadHandler =
                Handler(Looper.getMainLooper())

            override fun execute(command: Runnable) {
                mainThreadHandler.post(command)
            }
        }
    }

    /*fun diskIO(): Executor {
        return mDiskIO
    }*/

   /* fun networkIO(): Executor {
        return mNetworkIO
    }*/

    /*fun mainThreadIO(): Executor {
        return mMainThread
    }*/
}