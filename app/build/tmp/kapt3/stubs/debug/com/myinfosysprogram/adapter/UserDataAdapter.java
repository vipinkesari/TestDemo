package com.myinfosysprogram.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/myinfosysprogram/adapter/UserDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/myinfosysprogram/adapter/UserDataViewHolder;", "item", "Ljava/util/ArrayList;", "Lcom/myinfosysprogram/model/response/UserRows;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "mInterface", "Lcom/myinfosysprogram/interfaces/OnItemClickInterfaces;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/myinfosysprogram/interfaces/OnItemClickInterfaces;)V", "ctx", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class UserDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.myinfosysprogram.adapter.UserDataViewHolder> {
    private android.content.Context ctx;
    private com.myinfosysprogram.interfaces.OnItemClickInterfaces mInterface;
    private final java.util.ArrayList<com.myinfosysprogram.model.response.UserRows> item = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.myinfosysprogram.adapter.UserDataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.adapter.UserDataViewHolder holder, int position) {
    }
    
    public UserDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.UserRows> item, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.interfaces.OnItemClickInterfaces mInterface) {
        super();
    }
}