package com.simplemobiletools.contacts.pro.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u00a2\u0006\u0002\u0010\u0017J\u0010\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\b\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0016H\u0002J\b\u0010=\u001a\u00020\u0016H\u0002J\b\u0010>\u001a\u00020\nH\u0016J\u0010\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020\nH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\u0010\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0016J\u0017\u0010D\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u00062\u0006\u0010C\u001a\u00020\nH\u0002J\b\u0010G\u001a\u00020\nH\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0006\u0010I\u001a\u00020\u0016J\u001c\u0010J\u001a\u00020\u00162\n\u0010K\u001a\u00060LR\u00020\u00012\u0006\u0010@\u001a\u00020\nH\u0016J\u001c\u0010M\u001a\u00060LR\u00020\u00012\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\nH\u0016J\u0014\u0010Q\u001a\u00020\u00162\n\u0010K\u001a\u00060LR\u00020\u0001H\u0016J\u0010\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020\u0016H\u0002J\b\u0010V\u001a\u00020\u0016H\u0002J\b\u0010W\u001a\u00020\u0016H\u0002J\u0018\u0010X\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0006H\u0002J\b\u0010\\\u001a\u00020\u0016H\u0002J\u0016\u0010]\u001a\u00020\u00162\f\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u0005H\u0002J\u001e\u0010`\u001a\u00020\u00162\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0018\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u000e\u00102\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R\u000e\u00106\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/ContactsAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "contactItems", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "refreshListener", "Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "location", "", "removeListener", "Lcom/simplemobiletools/contacts/pro/interfaces/RemoveFromGroupListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "highlightText", "", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;ILcom/simplemobiletools/contacts/pro/interfaces/RemoveFromGroupListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lcom/simplemobiletools/commons/views/FastScroller;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "NEW_GROUP_ID", "adjustedPrimaryColor", "getAdjustedPrimaryColor", "()I", "setAdjustedPrimaryColor", "(I)V", "bigPadding", "businessContactDrawable", "Landroid/graphics/drawable/Drawable;", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "contactDrawable", "getContactItems", "()Ljava/util/ArrayList;", "setContactItems", "(Ljava/util/ArrayList;)V", "mediumPadding", "showContactThumbnails", "", "getShowContactThumbnails", "()Z", "setShowContactThumbnails", "(Z)V", "showPhoneNumbers", "getShowPhoneNumbers", "setShowPhoneNumbers", "smallPadding", "startNameWithSurname", "getStartNameWithSurname", "setStartNameWithSurname", "textToHighlight", "actionItemPressed", "id", "addToFavorites", "addToGroup", "askConfirmDelete", "deleteContacts", "editContact", "getActionMenuId", "getIsItemSelectable", "position", "getItemCount", "getItemKeyPosition", "key", "getItemSelectionKey", "(I)Ljava/lang/Integer;", "getItemWithKey", "getSelectableItemCount", "getSelectedItems", "initDrawables", "onBindViewHolder", "holder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "prepareActionMode", "menu", "Landroid/view/Menu;", "removeContacts", "sendEmailToContacts", "sendSMSToContacts", "setupView", "view", "Landroid/view/View;", "contact", "shareContacts", "showGroupsPicker", "radioItems", "Lcom/simplemobiletools/commons/models/RadioItem;", "updateItems", "newItems", "contacts_debug"})
public final class ContactsAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private final int NEW_GROUP_ID = -1;
    private android.graphics.drawable.Drawable contactDrawable;
    private android.graphics.drawable.Drawable businessContactDrawable;
    private com.simplemobiletools.contacts.pro.helpers.Config config;
    private java.lang.String textToHighlight;
    private int adjustedPrimaryColor;
    private boolean startNameWithSurname;
    private boolean showContactThumbnails;
    private boolean showPhoneNumbers;
    private int smallPadding;
    private int mediumPadding;
    private int bigPadding;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contactItems;
    private final com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener refreshListener = null;
    private final int location = 0;
    private final com.simplemobiletools.contacts.pro.interfaces.RemoveFromGroupListener removeListener = null;
    
    public final int getAdjustedPrimaryColor() {
        return 0;
    }
    
    public final void setAdjustedPrimaryColor(int p0) {
    }
    
    public final boolean getStartNameWithSurname() {
        return false;
    }
    
    public final void setStartNameWithSurname(boolean p0) {
    }
    
    public final boolean getShowContactThumbnails() {
        return false;
    }
    
    public final void setShowContactThumbnails(boolean p0) {
    }
    
    public final boolean getShowPhoneNumbers() {
        return false;
    }
    
    public final void setShowPhoneNumbers(boolean p0) {
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
    
    private final com.simplemobiletools.contacts.pro.models.Contact getItemWithKey(int key) {
        return null;
    }
    
    public final void initDrawables() {
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> newItems, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText) {
    }
    
    private final void editContact() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final void deleteContacts() {
    }
    
    private final void removeContacts() {
    }
    
    private final void addToFavorites() {
    }
    
    private final void addToGroup() {
    }
    
    private final void showGroupsPicker(java.util.ArrayList<com.simplemobiletools.commons.models.RadioItem> radioItems) {
    }
    
    private final void shareContacts() {
    }
    
    private final void sendSMSToContacts() {
    }
    
    private final void sendEmailToContacts() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getSelectedItems() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder) {
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getContactItems() {
        return null;
    }
    
    public final void setContactItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> p0) {
    }
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contactItems, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener refreshListener, int location, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.contacts.pro.interfaces.RemoveFromGroupListener removeListener, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}