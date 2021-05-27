package com.myinfosysprogram.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u001e\u0010\u0013\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/myinfosysprogram/viewModel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/myinfosysprogram/repository/UserRepository;", "(Lcom/myinfosysprogram/repository/UserRepository;)V", "generalRequestMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/myinfosysprogram/model/request/GeneralRequest;", "userListResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/myinfosysprogram/retrofit/Resource;", "", "Lcom/myinfosysprogram/model/response/UserRows;", "userListUpdateMutableLiveData", "getGeneralMutableRequest", "", "request", "getUserListResponse", "getUserRowsData", "updateUserDatabase", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "updateUserListFromDBResponse", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.myinfosysprogram.model.request.GeneralRequest> generalRequestMutableLiveData;
    private androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<java.util.List<com.myinfosysprogram.model.response.UserRows>>> userListResponseLiveData;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.UserRows>> userListUpdateMutableLiveData;
    private final com.myinfosysprogram.repository.UserRepository userRepository = null;
    
    public final void updateUserDatabase(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.UserRows> list) {
    }
    
    public final void getUserRowsData() {
    }
    
    public final void getGeneralMutableRequest(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.request.GeneralRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.myinfosysprogram.retrofit.Resource<java.util.List<com.myinfosysprogram.model.response.UserRows>>> getUserListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.myinfosysprogram.model.response.UserRows>> updateUserListFromDBResponse() {
        return null;
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.repository.UserRepository userRepository) {
        super();
    }
}