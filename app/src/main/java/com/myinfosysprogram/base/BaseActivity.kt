package com.myinfosysprogram.base

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.myinfosysprogram.interfaces.BaseActivityInterfaces

abstract class BaseActivity : AppCompatActivity(),LifecycleOwner, BaseActivityInterfaces {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initUI()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun getLifecycle(): Lifecycle {
        return super.getLifecycle()
    }
}