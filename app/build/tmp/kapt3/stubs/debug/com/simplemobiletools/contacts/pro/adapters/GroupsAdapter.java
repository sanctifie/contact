package com.simplemobiletools.contacts.pro.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0010H\u0002J\b\u0010+\u001a\u00020\u0010H\u0002J\b\u0010,\u001a\u00020\u0013H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0013H\u0016J\b\u0010/\u001a\u00020\u0013H\u0016J\u0010\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013H\u0016J\u0017\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u00101\u001a\u00020\u0013H\u0002J\b\u00105\u001a\u00020\u0013H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u00107\u001a\u00020\u00102\n\u00108\u001a\u000609R\u00020\u00012\u0006\u0010.\u001a\u00020\u0013H\u0016J\u001c\u0010:\u001a\u000609R\u00020\u00012\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0013H\u0016J\u0010\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\u0010H\u0002J\u0018\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0006H\u0002J\u001e\u0010F\u001a\u00020\u00102\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010H\u001a\u00020\'R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/GroupsAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "groups", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Group;", "refreshListener", "Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lcom/simplemobiletools/commons/views/FastScroller;Lkotlin/jvm/functions/Function1;)V", "adjustedPrimaryColor", "", "getAdjustedPrimaryColor", "()I", "setAdjustedPrimaryColor", "(I)V", "bigPadding", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "getRefreshListener", "()Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "showContactThumbnails", "", "getShowContactThumbnails", "()Z", "setShowContactThumbnails", "(Z)V", "smallPadding", "textToHighlight", "", "actionItemPressed", "id", "askConfirmDelete", "deleteGroups", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemWithKey", "getSelectableItemCount", "getSelectedItems", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "renameGroup", "setupView", "view", "Landroid/view/View;", "group", "updateItems", "newItems", "highlightText", "contacts_debug"})
public final class GroupsAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private int smallPadding;
    private int bigPadding;
    private java.lang.String textToHighlight;
    private int adjustedPrimaryColor;
    private boolean showContactThumbnails;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups;
    @org.jetbrains.annotations.Nullable()
    private final com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener refreshListener = null;
    
    public final int getAdjustedPrimaryColor() {
        return 0;
    }
    
    public final void setAdjustedPrimaryColor(int p0) {
    }
    
    public final boolean getShowContactThumbnails() {
        return false;
    }
    
    public final void setShowContactThumbnails(boolean p0) {
    }
    
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
    
    private final com.simplemobiletools.contacts.pro.models.Group getItemWithKey(int key) {
        return null;
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> newItems, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText) {
    }
    
    private final void renameGroup() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final void deleteGroups() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getSelectedItems() {
        return null;
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.contacts.pro.models.Group group) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener getRefreshListener() {
        return null;
    }
    
    public GroupsAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener refreshListener, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}