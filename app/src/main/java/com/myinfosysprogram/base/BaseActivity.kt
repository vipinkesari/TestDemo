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
        setViewModels()
        initUI()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    /* this is an extention function
    *  we can use this where base class instance is used.
    * */
    fun toast(message: String, duration: Int = Toast.LENGTH_LONG){
        Toast.makeText(this, message, duration).show()
    }

    override fun getLifecycle(): Lifecycle {
        return super.getLifecycle()
    }
}