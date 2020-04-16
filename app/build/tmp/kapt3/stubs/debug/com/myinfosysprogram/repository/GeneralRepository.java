package com.myinfosysprogram.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\fJ&\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0012j\b\u0012\u0004\u0012\u00020\r`\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/myinfosysprogram/repository/GeneralRepository;", "Lcom/myinfosysprogram/repository/BaseRepository;", "apiService", "Lcom/myinfosysprogram/retrofit/RetrofitService;", "rowDao", "Lcom/myinfosysprogram/roomDb/RowsDao;", "(Lcom/myinfosysprogram/retrofit/RetrofitService;Lcom/myinfosysprogram/roomDb/RowsDao;)V", "getGeneralListApi", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "Lcom/myinfosysprogram/model/response/ListResponse;", "getRowsListFromDb", "", "Lcom/myinfosysprogram/model/response/Rows;", "getTitleFromDb", "saveData", "", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "title", "", "app_debug"})
public class GeneralRepository extends com.myinfosysprogram.repository.BaseRepository {
    private final com.myinfosysprogram.retrofit.RetrofitService apiService = null;
    private final com.myinfosysprogram.roomDb.RowsDao rowDao = null;
    
    public final void saveData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.Rows> list, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.myinfosysprogram.model.response.ListResponse> getTitleFromDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.myinfosysprogram.model.response.Rows> getRowsListFromDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> getGeneralListApi() {
        return null;
    }
    
    public GeneralRepository(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.retrofit.RetrofitService apiService, @org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.roomDb.RowsDao rowDao) {
        super();
    }
}