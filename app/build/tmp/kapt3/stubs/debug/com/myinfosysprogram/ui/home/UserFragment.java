package com.myinfosysprogram.ui.home;

import java.lang.System;

/**
 * A simple [UserFragment] subclass as the default destination in the navigation.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001aH\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010-\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006."}, d2 = {"Lcom/myinfosysprogram/ui/home/UserFragment;", "Lcom/myinfosysprogram/base/BaseFragment;", "Lcom/myinfosysprogram/interfaces/OnItemClickInterfaces;", "()V", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "listObserver", "Landroidx/lifecycle/Observer;", "Lcom/myinfosysprogram/retrofit/Resource;", "", "Lcom/myinfosysprogram/model/response/UserRows;", "listRes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mAdapter", "Lcom/myinfosysprogram/adapter/UserDataAdapter;", "refreshUIObserver", "", "updateListObserver", "userListViewModel", "Lcom/myinfosysprogram/viewModel/UserViewModel;", "getUserListViewModel", "()Lcom/myinfosysprogram/viewModel/UserViewModel;", "userListViewModel$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "getList", "", "getRowsFromDB", "initAdapter", "initObserver", "initUI", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUserItemClick", "pos", "onViewCreated", "view", "updateDataIntoTable", "app_debug"})
public final class UserFragment extends com.myinfosysprogram.base.BaseFragment implements com.myinfosysprogram.interfaces.OnItemClickInterfaces {
    private com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    private final kotlin.Lazy userListViewModel$delegate = null;
    private androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<java.util.List<com.myinfosysprogram.model.response.UserRows>>> listObserver;
    private androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.UserRows>> updateListObserver;
    private androidx.lifecycle.Observer<java.lang.Boolean> refreshUIObserver;
    private com.myinfosysprogram.adapter.UserDataAdapter mAdapter;
    private java.util.ArrayList<com.myinfosysprogram.model.response.UserRows> listRes;
    private java.util.HashMap _$_findViewCache;
    
    private final com.myinfosysprogram.viewModel.UserViewModel getUserListViewModel() {
        return null;
    }
    
    private final int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void getList() {
    }
    
    private final void initAdapter() {
    }
    
    private final void initObserver() {
    }
    
    private final void getRowsFromDB() {
    }
    
    private final void updateDataIntoTable() {
    }
    
    @java.lang.Override()
    public void onUserItemClick(int pos) {
    }
    
    public UserFragment() {
        super();
    }
}