package com.myinfosysprogram.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001e\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0010j\b\u0012\u0004\u0012\u00020\u000b`\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/myinfosysprogram/repository/GeneralRepository;", "Lcom/myinfosysprogram/repository/BaseRepository;", "apiService", "Lcom/myinfosysprogram/retrofit/RetrofitService;", "rowDao", "Lcom/myinfosysprogram/roomDb/RowsDao;", "(Lcom/myinfosysprogram/retrofit/RetrofitService;Lcom/myinfosysprogram/roomDb/RowsDao;)V", "getPhotoListApi", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "", "Lcom/myinfosysprogram/model/response/PhotoRows;", "getRowsListFromDb", "savePhotoData", "", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public class GeneralRepository extends com.myinfosysprogram.repository.BaseRepository {
    private final com.myinfosysprogram.retrofit.RetrofitService apiService = null;
    private final com.myinfosysprogram.roomDb.RowsDao rowDao = null;
    
    public final void savePhotoData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.PhotoRows> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.myinfosysprogram.model.response.PhotoRows> getRowsListFromDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<java.util.List<com.myinfosysprogram.model.response.PhotoRows>>> getPhotoListApi() {
        return null;
    }
    
    public GeneralRepository(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.RetrofitService apiService, @org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.roomDb.RowsDao rowDao) {
        super();
    }
}