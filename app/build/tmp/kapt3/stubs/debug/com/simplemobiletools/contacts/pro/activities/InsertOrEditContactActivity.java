package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0006\u0010\u0012\u001a\u00020\u000eJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\u0006\u0010\u0016\u001a\u00020\u0005J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\"\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u000eH\u0014J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\u000eH\u0002J\u0006\u0010*\u001a\u00020\u000eJ\b\u0010+\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/InsertOrEditContactActivity;", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "()V", "START_EDIT_ACTIVITY", "", "START_INSERT_ACTIVITY", "contactsFavoritesList", "Ljava/util/ArrayList;", "isSearchOpen", "", "searchMenuItem", "Landroid/view/MenuItem;", "contactClicked", "", "contact", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "createNewContact", "fabClicked", "getCurrentFragment", "Lcom/simplemobiletools/contacts/pro/fragments/MyViewPagerFragment;", "getSearchString", "getTabsMask", "initFragments", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "onStop", "refreshContacts", "refreshTabsMask", "setupSearch", "setupTabColors", "showFilterDialog", "showSortingDialog", "contacts_debug"})
public final class InsertOrEditContactActivity extends com.simplemobiletools.contacts.pro.activities.SimpleActivity implements com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener {
    private final int START_INSERT_ACTIVITY = 1;
    private final int START_EDIT_ACTIVITY = 2;
    private boolean isSearchOpen;
    private android.view.MenuItem searchMenuItem;
    private final java.util.ArrayList<java.lang.Integer> contactsFavoritesList = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
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
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void initFragments() {
    }
    
    private final void setupSearch(android.view.Menu menu) {
    }
    
    private final int getSearchString() {
        return 0;
    }
    
    private final com.simplemobiletools.contacts.pro.fragments.MyViewPagerFragment getCurrentFragment() {
        return null;
    }
    
    private final void setupTabColors() {
    }
    
    @java.lang.Override()
    public void refreshContacts(int refreshTabsMask) {
    }
    
    @java.lang.Override()
    public void contactClicked(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    private final void createNewContact() {
    }
    
    public final void fabClicked() {
    }
    
    private final void showSortingDialog() {
    }
    
    public final void showFilterDialog() {
    }
    
    public final int getTabsMask() {
        return 0;
    }
    
    public InsertOrEditContactActivity() {
        super();
    }
}