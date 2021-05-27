package com.myinfosysprogram.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/myinfosysprogram/retrofit/RetrofitService;", "", "getPhotoListData", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/ApiResponse;", "", "Lcom/myinfosysprogram/model/response/PhotoRows;", "getUserListData", "Lcom/myinfosysprogram/model/response/UserRows;", "app_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos")
    public abstract androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.ApiResponse<java.util.List<com.myinfosysprogram.model.response.PhotoRows>>> getPhotoListData();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users")
    public abstract androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.ApiResponse<java.util.List<com.myinfosysprogram.model.response.UserRows>>> getUserListData();
}