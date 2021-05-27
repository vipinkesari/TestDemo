package com.myinfosysprogram.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mapLocation", "Lcom/myinfosysprogram/model/response/UserRows$Geo;", "getMapLocation", "()Lcom/myinfosysprogram/model/response/UserRows$Geo;", "setMapLocation", "(Lcom/myinfosysprogram/model/response/UserRows$Geo;)V", "placeName", "", "getPlaceName", "()Ljava/lang/String;", "setPlaceName", "(Ljava/lang/String;)V", "searchUIMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchUIMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSearchUIMutableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "titleUpdateMutableLiveData", "getTitleUpdateMutableLiveData", "setTitleUpdateMutableLiveData", "searchHomeUI", "", "status", "updateTitle", "str", "app_debug"})
public final class HomeCommunicatorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> titleUpdateMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> searchUIMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String placeName = "";
    @org.jetbrains.annotations.Nullable()
    private com.myinfosysprogram.model.response.UserRows.Geo mapLocation;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitleUpdateMutableLiveData() {
        return null;
    }
    
    public final void setTitleUpdateMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSearchUIMutableLiveData() {
        return null;
    }
    
    public final void setSearchUIMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaceName() {
        return null;
    }
    
    public final void setPlaceName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.UserRows.Geo getMapLocation() {
        return null;
    }
    
    public final void setMapLocation(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.UserRows.Geo p0) {
    }
    
    public final void updateTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void searchHomeUI(boolean status) {
    }
    
    public HomeCommunicatorViewModel() {
        super();
    }
}