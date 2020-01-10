package com.simplemobiletools.contacts.pro.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001=BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\b\u0010-\u001a\u00020\u0016H\u0016J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\'J\u001c\u0010/\u001a\u00020\u00112\n\u00100\u001a\u00060\u0002R\u00020\u00002\u0006\u00101\u001a\u00020\u0016H\u0016J\u001c\u00102\u001a\u00060\u0002R\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0016H\u0016J\u0014\u00106\u001a\u00020\u00112\n\u00100\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0018\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0016H\u0002J\u001e\u0010:\u001a\u00020\u00112\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010<\u001a\u00020,R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/SelectContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/simplemobiletools/contacts/pro/adapters/SelectContactsAdapter$ViewHolder;", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "contacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "selectedContacts", "allowPickMultiple", "", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "itemClick", "Lkotlin/Function1;", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLcom/simplemobiletools/commons/views/MyRecyclerView;Lcom/simplemobiletools/commons/views/FastScroller;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "adjustedPrimaryColor", "", "bigPadding", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "contactDrawable", "Landroid/graphics/drawable/Drawable;", "getContacts", "()Ljava/util/ArrayList;", "setContacts", "(Ljava/util/ArrayList;)V", "getFastScroller", "()Lcom/simplemobiletools/commons/views/FastScroller;", "itemLayout", "itemViews", "Landroid/util/SparseArray;", "Landroid/view/View;", "selectedPositions", "Ljava/util/HashSet;", "showContactThumbnails", "smallPadding", "textColor", "textToHighlight", "", "getItemCount", "getSelectedItemsSet", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "toggleItemSelection", "select", "pos", "updateItems", "newItems", "highlightText", "ViewHolder", "contacts_debug"})
public final class SelectContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.simplemobiletools.contacts.pro.adapters.SelectContactsAdapter.ViewHolder> {
    private final android.util.SparseArray<android.view.View> itemViews = null;
    private final java.util.HashSet<java.lang.Integer> selectedPositions = null;
    private final com.simplemobiletools.contacts.pro.helpers.Config config = null;
    private final int textColor = 0;
    private final int adjustedPrimaryColor = 0;
    private final android.graphics.drawable.Drawable contactDrawable = null;
    private final boolean showContactThumbnails = false;
    private final int itemLayout = 0;
    private java.lang.String textToHighlight;
    private int smallPadding;
    private int bigPadding;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts;
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> selectedContacts = null;
    private final boolean allowPickMultiple = false;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.views.FastScroller fastScroller = null;
    private final kotlin.jvm.functions.Function1<com.simplemobiletools.contacts.pro.models.Contact, kotlin.Unit> itemClick = null;
    
    private final void toggleItemSelection(boolean select, int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<com.simplemobiletools.contacts.pro.models.Contact> getSelectedItemsSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.contacts.pro.adapters.SelectContactsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.adapters.SelectContactsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> newItems, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.adapters.SelectContactsAdapter.ViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getContacts() {
        return null;
    }
    
    public final void setContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.commons.views.FastScroller getFastScroller() {
        return null;
    }
    
    public SelectContactsAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> selectedContacts, boolean allowPickMultiple, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.simplemobiletools.contacts.pro.models.Contact, kotlin.Unit> itemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a8\u0006\u0014"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/SelectContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/simplemobiletools/contacts/pro/adapters/SelectContactsAdapter;Landroid/view/View;)V", "bindView", "contact", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "contactDrawable", "Landroid/graphics/drawable/Drawable;", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "showContactThumbnails", "", "smallPadding", "", "bigPadding", "viewClicked", "", "select", "contacts_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View bindView(@org.jetbrains.annotations.NotNull()
        com.simplemobiletools.contacts.pro.models.Contact contact, @org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable contactDrawable, @org.jetbrains.annotations.NotNull()
        com.simplemobiletools.contacts.pro.helpers.Config config, boolean showContactThumbnails, int smallPadding, int bigPadding) {
            return null;
        }
        
        private final void viewClicked(boolean select) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}