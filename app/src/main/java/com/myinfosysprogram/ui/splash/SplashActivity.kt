package com.myinfosysprogram.ui.splash

import android.content.Intent
import android.os.Handler
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.constants.AppConstants.Companion.TIMEOUT_SPLASH
import com.myinfosysprogram.ui.home.MainActivity

class SplashActivity : BaseActivity() {

    private lateinit var mHandler: Handler

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initUI() {
        mHandler = Handler()
        mHandler.postDelayed(
            {
                var mIntent = Intent(this, MainActivity::class.java)
                startActivity(mIntent)
                finish()
            },
            TIMEOUT_SPLASH
        )
    }

    override fun setViewModels() {
    }
}