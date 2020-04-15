package com.myinfosysprogram.retrofit

import android.content.Context
import com.google.gson.GsonBuilder
import com.myinfosysprogram.BuildConfig
import com.myinfosysprogram.MyApplication
import com.myinfosysprogram.constants.ApiConstants.Companion.BASE_URL
import com.myinfosysprogram.utils.verifyAvailableNetwork
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.IOException
import java.lang.reflect.Modifier
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit

object AppRetrofit {

    var mInstance: RetrofitService
    private const val TIMEOUT = 30.toLong()
    private var ctx: Context? = null

    init {
        mInstance =  makeRetrofitService()
    }

    fun getInstance(): RetrofitService {
        if (mInstance == null)
            mInstance =
                makeRetrofitService()

        ctx = MyApplication.getAppContext()
        return mInstance
    }

    fun getInstance(context : Context?): RetrofitService {
        if (mInstance == null)
            mInstance =
                makeRetrofitService();
        ctx = context
        return mInstance
    }

    private  fun makeRetrofitService(): RetrofitService {
        val mBaseUrl = BASE_URL
        val cacheSize = (5*12024*104).toLong()

        val headerInterceptor: Interceptor = object : Interceptor {
            @Throws(IOException::class)
            override fun intercept(chain: Interceptor.Chain): Response {

                var response: Response

                /* for cache result */
                if(ctx != null) {
                    var request = chain.request().newBuilder()
                    request = if (verifyAvailableNetwork(ctx!!, null))
                        request.header("Cache-Control", "public, max-age=" + 5)
                    else
                        request.header(
                            "Cache-Control",
                            "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7
                        )

                    request.addHeader("Authorization", "authKey")
                    response = chain.proceed(request.build())
                }else {
                    /* for non cache */
                    val builder = chain.request().newBuilder()
                    //builder.addHeader("Content-Type", "application/x-www-form-urlencoded");
                    builder.addHeader("Authorization", "authKey")
                    response = chain.proceed(builder.build())
                }

                /* check for forbidden */
                if (isForbidden(response.code)) {
                    var newRequest = chain.request()
                    newRequest = newRequest.newBuilder()
                        .addHeader("Authorization", "authKey")
                        .build()
                    response = chain.proceed(newRequest)
                }
                return response
            }
        }

        val httpClient = OkHttpClient().newBuilder()
            //.addInterceptor(LastFmRequestInterceptor(apiKey, cacheDuration))
            .addInterceptor(headerInterceptor)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level =
                    if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                    else HttpLoggingInterceptor.Level.NONE
            })
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)

        if(ctx != null){
            val myCache = Cache(ctx!!.cacheDir, cacheSize)
            httpClient.cache(myCache)
        }

        httpClient.build()

        val retrofit = Retrofit.Builder()
            .baseUrl(mBaseUrl)
            .client(httpClient.build())
            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(
                GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create()))
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()

        return retrofit.create(RetrofitService::class.java)
    }

    private fun isForbidden(code: Int): Boolean {
        return code == HttpURLConnection.HTTP_FORBIDDEN
    }
}