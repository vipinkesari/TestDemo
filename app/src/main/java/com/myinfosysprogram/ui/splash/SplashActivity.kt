package com.myinfosysprogram.ui.splash

import android.content.Intent
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.constants.AppConstants
import com.myinfosysprogram.constants.AppConstants.Companion.TIMEOUT_SPLASH
import com.myinfosysprogram.prefrences.Prefrences
import com.myinfosysprogram.ui.home.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class SplashActivity : BaseActivity() {

    private var isRunning: Boolean = false
    private val preferences: Prefrences by inject()

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    /* init the block of code */
    override fun initUI() {

       if(preferences.getBooleanData(AppConstants.KEY_HIDE_SPLASH)) {
           CoroutineScope(Dispatchers.Main).launch {
               moveToHome()
           }
       }

        CoroutineScope(Dispatchers.Main).launch {
            delay(TIMEOUT_SPLASH)
            preferences.setBooleanData(AppConstants.KEY_HIDE_SPLASH, true)
            moveToHome()
        }
    }

    /* suspend fun for move from splash screen to home screen */
    private fun moveToHome() {
        if (isRunning) {
            val mIntent = Intent(this, MainActivity::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(mIntent)
        }
        finish()
    }

    override fun onResume() {
        super.onResume()
        isRunning = true
    }

    override fun onPause() {
        super.onPause()
        isRunning = false
    }

}