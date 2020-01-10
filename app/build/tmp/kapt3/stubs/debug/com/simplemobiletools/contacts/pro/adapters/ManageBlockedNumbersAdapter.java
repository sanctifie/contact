package com.simplemobiletools.contacts.pro.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001aH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010&\u001a\u00020\u000e2\n\u0010\'\u001a\u00060(R\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010)\u001a\u00060(R\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001aH\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u000eH\u0002J\u0018\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00065"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/ManageBlockedNumbersAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "blockedNumbers", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/BlockedNumber;", "listener", "Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "getBlockedNumbers", "()Ljava/util/ArrayList;", "setBlockedNumbers", "(Ljava/util/ArrayList;)V", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "getListener", "()Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "actionItemPressed", "id", "", "getActionMenuId", "getIsItemSelectable", "", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getSelectableItemCount", "getSelectedItems", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "removeSelection", "setupView", "view", "Landroid/view/View;", "blockedNumber", "contacts_debug"})
public final class ManageBlockedNumbersAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private final com.simplemobiletools.contacts.pro.helpers.Config config = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.BlockedNumber> blockedNumbers;
    @org.jetbrains.annotations.Nullable()
    private final com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener listener = null;
    
    @java.lang.Override()
    public int getActionMenuId() {
        return 0;
    }
    
    @java.lang.Override()
    public void prepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void actionItemPressed(int id) {
    }
    
    @java.lang.Override()
    public int getSelectableItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getIsItemSelectable(int position) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getItemSelectionKey(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemKeyPosition(int key) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.BlockedNumber> getSelectedItems() {
        return null;
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.contacts.pro.models.BlockedNumber blockedNumber) {
    }
    
    private final void removeSelection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.BlockedNumber> getBlockedNumbers() {
        return null;
    }
    
    public final void setBlockedNumbers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.BlockedNumber> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener getListener() {
        return null;
    }
    
    public ManageBlockedNumbersAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.BlockedNumber> blockedNumbers, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener listener, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}