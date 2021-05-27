package com.myinfosysprogram.ui.home;

import java.lang.System;

/**
 * A simple [HomeFragment] subclass as the default destination in the navigation.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/myinfosysprogram/ui/home/HomeFragment;", "Lcom/myinfosysprogram/base/BaseFragment;", "()V", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "listObserver", "Landroidx/lifecycle/Observer;", "Lcom/myinfosysprogram/retrofit/Resource;", "", "Lcom/myinfosysprogram/model/response/PhotoRows;", "listRes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listViewModel", "Lcom/myinfosysprogram/viewModel/ListViewModel;", "getListViewModel", "()Lcom/myinfosysprogram/viewModel/ListViewModel;", "listViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/myinfosysprogram/adapter/ListDataAdapter;", "updateListObserver", "getLayoutId", "", "getList", "", "getRowsFromDB", "initAdapter", "initObserver", "initUI", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateDataIntoTable", "app_debug"})
public final class HomeFragment extends com.myinfosysprogram.base.BaseFragment {
    private com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    private final kotlin.Lazy listViewModel$delegate = null;
    private androidx.lifecycle.Observer<com.myinfosysprogram.retrofit.Resource<java.util.List<com.myinfosysprogram.model.response.PhotoRows>>> listObserver;
    private androidx.lifecycle.Observer<java.util.List<com.myinfosysprogram.model.response.PhotoRows>> updateListObserver;
    private com.myinfosysprogram.adapter.ListDataAdapter mAdapter;
    private java.util.ArrayList<com.myinfosysprogram.model.response.PhotoRows> listRes;
    private java.util.HashMap _$_findViewCache;
    
    private final com.myinfosysprogram.viewModel.ListViewModel getListViewModel() {
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
    
    public HomeFragment() {
        super();
    }
}