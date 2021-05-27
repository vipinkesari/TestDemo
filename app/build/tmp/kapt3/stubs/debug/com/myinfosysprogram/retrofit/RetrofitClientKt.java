package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0010"}, d2 = {"networkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "ctx", "Landroid/content/Context;", "authInterceptor", "Lcom/myinfosysprogram/retrofit/AuthInterceptor;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "provideRetrofitApi", "Lcom/myinfosysprogram/retrofit/RetrofitService;", "retrofit", "app_debug"})
public final class RetrofitClientKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module networkModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.myinfosysprogram.retrofit.RetrofitService provideRetrofitApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}