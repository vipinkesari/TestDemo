package com.myinfosysprogram.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0006\u0010 \u001a\u00020\u001dJ&\u0010!\u001a\u00020\u001d2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00160#j\b\u0012\u0004\u0012\u00020\u0016`$2\u0006\u0010%\u001a\u00020&J\u0012\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0006J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000b\u00a8\u0006)"}, d2 = {"Lcom/myinfosysprogram/viewModel/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "generalRepository", "Lcom/myinfosysprogram/repository/GeneralRepository;", "(Lcom/myinfosysprogram/repository/GeneralRepository;)V", "generalRequestMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/myinfosysprogram/model/request/GeneralRequest;", "getGeneralRequestMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGeneralRequestMutableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "listResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "Lcom/myinfosysprogram/model/response/ListResponse;", "getListResponseLiveData", "()Landroidx/lifecycle/LiveData;", "setListResponseLiveData", "(Landroidx/lifecycle/LiveData;)V", "listUpdateMutableLiveData", "", "Lcom/myinfosysprogram/model/response/Rows;", "getListUpdateMutableLiveData", "setListUpdateMutableLiveData", "titleUpdateMutableLiveData", "getTitleUpdateMutableLiveData", "setTitleUpdateMutableLiveData", "getGeneralMutableRequest", "", "request", "getListResponse", "getRowsData", "updateDatabase", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "title", "", "updateListFromDBResonse", "updateTitleFromDBResponse", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.myinfosysprogram.model.request.GeneralRequest> generalRequestMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> listResponseLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.ListResponse>> titleUpdateMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.Rows>> listUpdateMutableLiveData;
    private final com.myinfosysprogram.repository.GeneralRepository generalRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.myinfosysprogram.model.request.GeneralRequest> getGeneralRequestMutableLiveData() {
        return null;
    }
    
    public final void setGeneralRequestMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.myinfosysprogram.model.request.GeneralRequest> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> getListResponseLiveData() {
        return null;
    }
    
    public final void setListResponseLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.ListResponse>> getTitleUpdateMutableLiveData() {
        return null;
    }
    
    public final void setTitleUpdateMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.ListResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.Rows>> getListUpdateMutableLiveData() {
        return null;
    }
    
    public final void setListUpdateMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.Rows>> p0) {
    }
    
    public final void updateDatabase(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.Rows> list, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void getRowsData() {
    }
    
    public final void getGeneralMutableRequest(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.request.GeneralRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> getListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.ListResponse>> updateTitleFromDBResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.Rows>> updateListFromDBResonse() {
        return null;
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.repository.GeneralRepository generalRepository) {
        super();
    }
}