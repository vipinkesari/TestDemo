package com.myinfosysprogram.roomDb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/myinfosysprogram/roomDb/RowsDao;", "", "getAllRows", "", "Lcom/myinfosysprogram/model/response/Rows;", "getTitle", "Lcom/myinfosysprogram/model/response/ListResponse;", "insertRow", "", "rows", "(Lcom/myinfosysprogram/model/response/Rows;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTitle", "title", "(Lcom/myinfosysprogram/model/response/ListResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nukeTable", "app_debug"})
public abstract interface RowsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRow(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.response.Rows rows, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from list_rows")
    public abstract java.util.List<com.myinfosysprogram.model.response.Rows> getAllRows();
    
    @androidx.room.Query(value = "DELETE FROM list_rows")
    public abstract void nukeTable();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTitle(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.response.ListResponse title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from ListResponse")
    public abstract java.util.List<com.myinfosysprogram.model.response.ListResponse> getTitle();
}