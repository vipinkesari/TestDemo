package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000bH\'J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/myinfosysprogram/retrofit/NetworkBoundWtDbRes;", "ResultType", "RequestType", "", "appExecutors", "Lcom/myinfosysprogram/retrofit/AppExecutors;", "(Lcom/myinfosysprogram/retrofit/AppExecutors;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/myinfosysprogram/retrofit/ApiResponse;", "fetchFromNetwork", "", "resultTypeLiveData", "onFetchFailed", "setNetworkBoundResource", "app_debug"})
public abstract class NetworkBoundWtDbRes<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.myinfosysprogram.retrofit.Resource<ResultType>> result = null;
    private final com.myinfosysprogram.retrofit.AppExecutors appExecutors = null;
    
    private final void setNetworkBoundResource() {
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> resultTypeLiveData) {
    }
    
    private final void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    public abstract androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.ApiResponse<ResultType>> createCall();
    
    @androidx.annotation.MainThread()
    protected NetworkBoundWtDbRes(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.AppExecutors appExecutors) {
        super();
    }
}