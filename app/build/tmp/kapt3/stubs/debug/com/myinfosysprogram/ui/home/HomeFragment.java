package com.myinfosysprogram.ui.home;

import java.lang.System;

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u000203J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000203H\u0002J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010@\u001a\u0002032\u0006\u0010A\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020&0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R&\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0*0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010\u00a8\u0006E"}, d2 = {"Lcom/myinfosysprogram/ui/home/HomeFragment;", "Lcom/myinfosysprogram/base/BaseFragment;", "()V", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "getCommunicatorViewModel", "()Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "setCommunicatorViewModel", "(Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;)V", "listObserver", "Landroidx/lifecycle/Observer;", "Lcom/myinfosysprogram/retrofit/Resource;", "Lcom/myinfosysprogram/model/response/ListResponse;", "getListObserver", "()Landroidx/lifecycle/Observer;", "setListObserver", "(Landroidx/lifecycle/Observer;)V", "listRes", "Ljava/util/ArrayList;", "Lcom/myinfosysprogram/model/response/Rows;", "Lkotlin/collections/ArrayList;", "getListRes", "()Ljava/util/ArrayList;", "setListRes", "(Ljava/util/ArrayList;)V", "listViewModel", "Lcom/myinfosysprogram/viewModel/ListViewModel;", "getListViewModel", "()Lcom/myinfosysprogram/viewModel/ListViewModel;", "listViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/myinfosysprogram/adapter/ListDataAdapter;", "getMAdapter", "()Lcom/myinfosysprogram/adapter/ListDataAdapter;", "setMAdapter", "(Lcom/myinfosysprogram/adapter/ListDataAdapter;)V", "refreshUIObserver", "", "getRefreshUIObserver", "setRefreshUIObserver", "updateListObserver", "", "getUpdateListObserver", "setUpdateListObserver", "updateTitleObserver", "getUpdateTitleObserver", "setUpdateTitleObserver", "getLayoutId", "", "getList", "", "getRowsFromDB", "initAdapter", "initObserver", "initUI", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateDataIntoTable", "title", "", "app_debug"})
public final class HomeFragment extends com.myinfosysprogram.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy listViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> listObserver;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.Observer<java.lang.Boolean> refreshUIObserver;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.Rows>> updateListObserver;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.ListResponse>> updateTitleObserver;
    @org.jetbrains.annotations.NotNull()
    public com.myinfosysprogram.adapter.ListDataAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.myinfosysprogram.model.response.Rows> listRes;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.myinfosysprogram.viewModel.HomeCommunicatorViewModel getCommunicatorViewModel() {
        return null;
    }
    
    public final void setCommunicatorViewModel(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.viewModel.HomeCommunicatorViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.myinfosysprogram.viewModel.ListViewModel getListViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> getListObserver() {
        return null;
    }
    
    public final void setListObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<com.myinfosysprogram.model.response.ListResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.Observer<java.lang.Boolean> getRefreshUIObserver() {
        return null;
    }
    
    public final void setRefreshUIObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.Rows>> getUpdateListObserver() {
        return null;
    }
    
    public final void setUpdateListObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.Rows>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.ListResponse>> getUpdateTitleObserver() {
        return null;
    }
    
    public final void setUpdateTitleObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.ListResponse>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.myinfosysprogram.adapter.ListDataAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.adapter.ListDataAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.myinfosysprogram.model.response.Rows> getListRes() {
        return null;
    }
    
    public final void setListRes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.Rows> p0) {
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
    
    public final void getRowsFromDB() {
    }
    
    public final void updateDataIntoTable(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public HomeFragment() {
        super();
    }
}