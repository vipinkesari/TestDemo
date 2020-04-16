package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001+B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010)\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006,"}, d2 = {"Lcom/myinfosysprogram/retrofit/Resource;", "T", "", "mStatus", "Lcom/myinfosysprogram/retrofit/Status;", "mDdata", "mMessage", "", "mCcode", "", "mSuccess", "", "(Lcom/myinfosysprogram/retrofit/Status;Ljava/lang/Object;Ljava/lang/String;IZ)V", "code", "getCode", "()I", "setCode", "(I)V", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "status", "getStatus", "()Lcom/myinfosysprogram/retrofit/Status;", "setStatus", "(Lcom/myinfosysprogram/retrofit/Status;)V", "success", "getSuccess", "()Z", "setSuccess", "(Z)V", "equals", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private com.myinfosysprogram.retrofit.Status status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    private boolean success = false;
    @org.jetbrains.annotations.Nullable()
    private T data;
    private int code = 0;
    public static final com.myinfosysprogram.retrofit.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.retrofit.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.retrofit.Status p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.Status mStatus, @org.jetbrains.annotations.Nullable()
    T mDdata, @org.jetbrains.annotations.Nullable()
    java.lang.String mMessage, int mCcode, boolean mSuccess) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/myinfosysprogram/retrofit/Resource$Companion;", "", "()V", "error", "Lcom/myinfosysprogram/retrofit/Resource;", "T", "msg", "", "data", "code", "", "(Ljava/lang/String;Ljava/lang/Object;I)Lcom/myinfosysprogram/retrofit/Resource;", "loading", "(Ljava/lang/Object;I)Lcom/myinfosysprogram/retrofit/Resource;", "success", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final <T extends java.lang.Object>com.myinfosysprogram.retrofit.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final <T extends java.lang.Object>com.myinfosysprogram.retrofit.Resource<T> error(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final <T extends java.lang.Object>com.myinfosysprogram.retrofit.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}