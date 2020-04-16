package com.myinfosysprogram.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/myinfosysprogram/adapter/ListDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/myinfosysprogram/adapter/ListDataAdapter$ViewHolder;", "item", "Ljava/util/ArrayList;", "Lcom/myinfosysprogram/model/response/Rows;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "ctx", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ListDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.myinfosysprogram.adapter.ListDataAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context ctx;
    private final java.util.ArrayList<com.myinfosysprogram.model.response.Rows> item = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.myinfosysprogram.adapter.ListDataAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.adapter.ListDataAdapter.ViewHolder holder, int position) {
    }
    
    public ListDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.myinfosysprogram.model.response.Rows> item, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/myinfosysprogram/adapter/ListDataAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemHomeRvBinding", "Lcom/myinfosysprogram/databinding/ItemHomeRvBinding;", "(Lcom/myinfosysprogram/databinding/ItemHomeRvBinding;)V", "bind", "", "res", "Lcom/myinfosysprogram/model/response/Rows;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.myinfosysprogram.databinding.ItemHomeRvBinding itemHomeRvBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.myinfosysprogram.model.response.Rows res, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.myinfosysprogram.databinding.ItemHomeRvBinding itemHomeRvBinding) {
            super(null);
        }
    }
}