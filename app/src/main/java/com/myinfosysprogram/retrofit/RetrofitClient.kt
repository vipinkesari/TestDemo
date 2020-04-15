package com.myinfosysprogram.retrofit

import android.content.Context
import com.google.gson.GsonBuilder
import com.myinfosysprogram.BuildConfig
import com.myinfosysprogram.constants.ApiConstants
import com.myinfosysprogram.utils.verifyAvailableNetwork
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Modifier
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit

val networkModule = module {
    factory { AuthInterceptor(androidContext()) }
    factory { provideOkHttpClient(androidContext(), get()) }
    factory { provideRetrofitApi(get()) }
    single { provideRetrofit(get()) }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    val retrofit = Retrofit.Builder()
        .baseUrl(ApiConstants.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder()
                    .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                    .create()
            )
        )
        .addCallAdapterFactory(LiveDataCallAdapterFactory())
        .build()

    return retrofit
}

fun provideOkHttpClient(ctx: Context, authInterceptor: AuthInterceptor): OkHttpClient {
    val httpClient = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .addInterceptor(HttpLoggingInterceptor().apply {
            level =
                if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                else HttpLoggingInterceptor.Level.NONE
        })
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)

    val myCache = Cache(ctx.cacheDir, (5 * 12024 * 104).toLong())
    httpClient.cache(myCache)

    httpClient.build()
    return OkHttpClient().newBuilder().addInterceptor(authInterceptor).build()
}

fun provideRetrofitApi(retrofit: Retrofit): RetrofitService =
    retrofit.create(RetrofitService::class.java)


class AuthInterceptor(private val ctx: Context) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var response: Response

        /* for cache result */
        var request = chain.request().newBuilder()
        //if (ctx != null) {
        request = if (verifyAvailableNetwork(ctx, null))
            request.header("Cache-Control", "public, max-age=" + 5)
        else
            request.header(
                "Cache-Control",
                "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7
            )


        //}
        request.addHeader("Authorization", "authKey")
        response = chain.proceed(request.build())

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

    private fun isForbidden(code: Int): Boolean {
        return code == HttpURLConnection.HTTP_FORBIDDEN
    }
}
