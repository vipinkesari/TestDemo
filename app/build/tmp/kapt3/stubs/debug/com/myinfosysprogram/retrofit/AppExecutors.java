package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/myinfosysprogram/retrofit/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "networkIO", "mainThread", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "mDiskIO", "mMainThread", "getMMainThread", "()Ljava/util/concurrent/Executor;", "setMMainThread", "(Ljava/util/concurrent/Executor;)V", "mNetworkIO", "getMNetworkIO", "setMNetworkIO", "mainThreadIO", "Companion", "app_debug"})
public final class AppExecutors {
    private java.util.concurrent.Executor mDiskIO;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.Executor mNetworkIO;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.Executor mMainThread;
    public static final com.myinfosysprogram.retrofit.AppExecutors.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getMNetworkIO() {
        return null;
    }
    
    public final void setMNetworkIO(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getMMainThread() {
        return null;
    }
    
    public final void setMMainThread(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor diskIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor networkIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor mainThreadIO() {
        return null;
    }
    
    public AppExecutors() {
        super();
    }
    
    public AppExecutors(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor diskIO, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor networkIO, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor mainThread) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/myinfosysprogram/retrofit/AppExecutors$Companion;", "", "()V", "MainThreadExecutor", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/myinfosysprogram/retrofit/AppExecutors$Companion$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "app_debug"})
        static final class MainThreadExecutor implements java.util.concurrent.Executor {
            private final android.os.Handler mainThreadHandler = null;
            
            @java.lang.Override()
            public void execute(@org.jetbrains.annotations.NotNull()
            java.lang.Runnable command) {
            }
            
            public MainThreadExecutor() {
                super();
            }
        }
    }
}