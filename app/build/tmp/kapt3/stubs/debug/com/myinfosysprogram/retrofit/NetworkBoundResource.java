package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\rH%J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\rH%J\b\u0010\u0014\u001a\u00020\u0011H\u0004J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fH\u0005\u00a2\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0017\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/myinfosysprogram/retrofit/NetworkBoundResource;", "ResultType", "RequestType", "", "appExecutors", "Lcom/myinfosysprogram/retrofit/AppExecutors;", "(Lcom/myinfosysprogram/retrofit/AppExecutors;)V", "appService", "Lcom/myinfosysprogram/retrofit/RetrofitService;", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/myinfosysprogram/retrofit/ApiResponse;", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "processResponse", "response", "(Lcom/myinfosysprogram/retrofit/ApiResponse;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setNetworkBoundResource", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.myinfosysprogram.retrofit.Resource<ResultType>> result = null;
    private final com.myinfosysprogram.retrofit.RetrofitService appService = null;
    private final com.myinfosysprogram.retrofit.AppExecutors appExecutors = null;
    
    private final void setNetworkBoundResource() {
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    protected final void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected final RequestType processResponse(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.retrofit.ApiResponse<RequestType> response) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveCallResult(RequestType item);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.ApiResponse<RequestType>> createCall();
    
    @androidx.annotation.MainThread()
    protected NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.AppExecutors appExecutors) {
        super();
    }
}