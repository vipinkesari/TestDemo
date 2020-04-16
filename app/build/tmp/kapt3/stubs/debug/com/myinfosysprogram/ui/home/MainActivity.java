package com.myinfosysprogram.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/myinfosysprogram/ui/home/MainActivity;", "Lcom/myinfosysprogram/base/BaseActivity;", "()V", "communicatorViewModel", "Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "getCommunicatorViewModel", "()Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;", "setCommunicatorViewModel", "(Lcom/myinfosysprogram/viewModel/HomeCommunicatorViewModel;)V", "listViewModel", "Lcom/myinfosysprogram/viewModel/ListViewModel;", "getListViewModel", "()Lcom/myinfosysprogram/viewModel/ListViewModel;", "listViewModel$delegate", "Lkotlin/Lazy;", "titleObserver", "Landroidx/lifecycle/Observer;", "", "getTitleObserver", "()Landroidx/lifecycle/Observer;", "setTitleObserver", "(Landroidx/lifecycle/Observer;)V", "getLayoutId", "", "initObserver", "", "initUI", "manageToolbar", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "refreshHomeScreen", "app_debug"})
public final class MainActivity extends com.myinfosysprogram.base.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public com.myinfosysprogram.viewModel.HomeCommunicatorViewModel communicatorViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy listViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.Observer<java.lang.String> titleObserver;
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
    public final androidx.lifecycle.Observer<java.lang.String> getTitleObserver() {
        return null;
    }
    
    public final void setTitleObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void initUI() {
    }
    
    private final void initObserver() {
    }
    
    private final void manageToolbar(java.lang.String title) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void refreshHomeScreen() {
    }
    
    public MainActivity() {
        super();
    }
}