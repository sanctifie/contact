package com.simplemobiletools.contacts.pro.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020%H&J\u0006\u0010&\u001a\u00020%J\u0006\u0010\'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\u0006\u0010)\u001a\u00020%J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020%H&J\u0006\u0010.\u001a\u00020%J\u001e\u0010/\u001a\u00020%2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`1J \u00102\u001a\u00020%2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`1H\u0002J \u00103\u001a\u00020%2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`1H\u0002J\u000e\u00104\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\bJ.\u00105\u001a\u00020%2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`12\f\u00106\u001a\b\u0012\u0004\u0012\u00020%07H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020\u0018H\u0002J\u000e\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0018J\u000e\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u0018J\u000e\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020 J\b\u0010@\u001a\u00020%H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001c\u00a8\u0006A"}, d2 = {"Lcom/simplemobiletools/contacts/pro/fragments/MyViewPagerFragment;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "setActivity", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;)V", "allContacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "getAllContacts", "()Ljava/util/ArrayList;", "setAllContacts", "(Ljava/util/ArrayList;)V", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "contactsIgnoringSearch", "forceListRedraw", "", "getForceListRedraw", "()Z", "setForceListRedraw", "(Z)V", "groupsIgnoringSearch", "Lcom/simplemobiletools/contacts/pro/models/Group;", "lastHashCode", "", "skipHashComparing", "getSkipHashComparing", "setSkipHashComparing", "fabClicked", "", "finishActMode", "onActivityResume", "onSearchClosed", "onSearchOpened", "onSearchQueryChanged", "text", "", "placeholderClicked", "primaryColorChanged", "refreshContacts", "contacts", "Lkotlin/collections/ArrayList;", "setupContacts", "setupContactsFavoritesAdapter", "setupFragment", "setupGroupsAdapter", "callback", "Lkotlin/Function0;", "setupViewVisibility", "hasItemsToShow", "showContactThumbnailsChanged", "showThumbnails", "startNameWithSurnameChanged", "startNameWithSurname", "textColorChanged", "color", "updateViewStuff", "contacts_debug"})
public abstract class MyViewPagerFragment extends androidx.coordinatorlayout.widget.CoordinatorLayout {
    @org.jetbrains.annotations.Nullable()
    private com.simplemobiletools.contacts.pro.activities.SimpleActivity activity;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> allContacts;
    private int lastHashCode;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contactsIgnoringSearch;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groupsIgnoringSearch;
    private com.simplemobiletools.contacts.pro.helpers.Config config;
    private boolean skipHashComparing;
    private boolean forceListRedraw;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    protected final void setActivity(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getAllContacts() {
        return null;
    }
    
    protected final void setAllContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> p0) {
    }
    
    public final boolean getSkipHashComparing() {
        return false;
    }
    
    public final void setSkipHashComparing(boolean p0) {
    }
    
    public final boolean getForceListRedraw() {
        return false;
    }
    
    public final void setForceListRedraw(boolean p0) {
    }
    
    public final void setupFragment(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity) {
    }
    
    public final void textColorChanged(int color) {
    }
    
    public final void primaryColorChanged() {
    }
    
    public final void startNameWithSurnameChanged(boolean startNameWithSurname) {
    }
    
    public final void refreshContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    private final void setupContacts(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    private final void setupGroupsAdapter(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    private final void setupContactsFavoritesAdapter(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    public final void showContactThumbnailsChanged(boolean showThumbnails) {
    }
    
    public final void onActivityResume() {
    }
    
    public final void finishActMode() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onSearchOpened() {
    }
    
    public final void onSearchClosed() {
    }
    
    private final void updateViewStuff() {
    }
    
    private final void setupViewVisibility(boolean hasItemsToShow) {
    }
    
    public abstract void fabClicked();
    
    public abstract void placeholderClicked();
    
    public MyViewPagerFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
}