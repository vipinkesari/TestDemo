package com.myinfosysprogram.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.myinfosysprogram.R


fun verifyAvailableNetwork(context: Context, view: View?): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
        val networkInfo = connectivityManager.activeNetworkInfo
        val result = networkInfo != null && networkInfo.isConnected

        if (!result && view != null)
            showShackBarMsg(view, context.resources.getString(R.string.msg_no_internet))

        return result
    } else {
        val network = connectivityManager.allNetworks
        var hasNetwork = false

        if (network.isNotEmpty()) {
            for (item in network) {
                val networkCapabilities = connectivityManager.getNetworkCapabilities(item)
                if (networkCapabilities!!.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET))
                    hasNetwork = true
            }
        }

        if (!hasNetwork && view != null)
            showShackBarMsg(view, context.resources.getString(R.string.msg_no_internet))

        return hasNetwork
    }
}

fun showShackBarMsg(view: View, msg: String) {
    Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show()
}


