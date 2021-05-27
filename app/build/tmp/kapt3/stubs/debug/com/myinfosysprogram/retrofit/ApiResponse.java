package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/myinfosysprogram/retrofit/ApiResponse;", "T", "", "error", "", "(Ljava/lang/Throwable;)V", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "body", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "code", "", "getCode", "()I", "setCode", "(I)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "isSuccessful", "", "app_debug"})
public final class ApiResponse<T extends java.lang.Object> {
    private int code = 0;
    @org.jetbrains.annotations.Nullable()
    private T body;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorMessage;
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
        super();
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
        super();
    }
}