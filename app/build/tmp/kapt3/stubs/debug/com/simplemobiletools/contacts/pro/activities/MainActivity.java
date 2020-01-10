package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0003J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0016\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0003J\n\u0010#\u001a\u0004\u0018\u00010\u001eH\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010\'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0003J\b\u0010(\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\u0012\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0015H\u0014J\u0010\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u000bH\u0016J\b\u00106\u001a\u00020\u0015H\u0014J\b\u00107\u001a\u00020\u0015H\u0014J\b\u00108\u001a\u00020\u0015H\u0014J\u0010\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020\u00152\u0006\u00101\u001a\u000202H\u0002J\b\u0010<\u001a\u00020\u0015H\u0002J\u0006\u0010=\u001a\u00020\u0015J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020\u0015H\u0002J\b\u0010B\u001a\u00020\u0015H\u0002J\b\u0010C\u001a\u00020\u0015H\u0002J\b\u0010D\u001a\u00020\u0015H\u0002J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020GH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/MainActivity;", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "()V", "handledShowTabs", "", "isFirstResume", "", "isGettingContacts", "isSearchOpen", "searchMenuItem", "Landroid/view/MenuItem;", "storedBackgroundColor", "storedPrimaryColor", "storedShowContactThumbnails", "storedShowPhoneNumbers", "storedShowTabs", "storedStartNameWithSurname", "storedTextColor", "werePermissionsHandled", "checkContactPermissions", "", "checkShortcuts", "checkWhatsNewDialog", "contactClicked", "contact", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "exportContacts", "getAllFragments", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/fragments/MyViewPagerFragment;", "kotlin.jvm.PlatformType", "getCreateNewContactShortcut", "Landroid/content/pm/ShortcutInfo;", "appIconColor", "getCurrentFragment", "getInactiveTabIndexes", "", "activeIndex", "getLaunchDialpadShortcut", "getSearchString", "importContacts", "initFragments", "launchAbout", "launchDialpad", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "onPause", "onResume", "onStop", "refreshContacts", "refreshTabsMask", "setupSearch", "setupTabColors", "showFilterDialog", "showImportContactsDialog", "path", "", "showSortingDialog", "storeStateVariables", "tryExportContacts", "tryImportContacts", "tryImportContactsFromFile", "uri", "Landroid/net/Uri;", "contacts_debug"})
public final class MainActivity extends com.simplemobiletools.contacts.pro.activities.SimpleActivity implements com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener {
    private boolean isSearchOpen;
    private android.view.MenuItem searchMenuItem;
    private boolean werePermissionsHandled;
    private boolean isFirstResume;
    private boolean isGettingContacts;
    private int handledShowTabs;
    private int storedTextColor;
    private int storedBackgroundColor;
    private int storedPrimaryColor;
    private boolean storedShowContactThumbnails;
    private boolean storedShowPhoneNumbers;
    private boolean storedStartNameWithSurname;
    private int storedShowTabs;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkContactPermissions() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
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
    
    private final void storeStateVariables() {
    }
    
    private final void setupSearch(android.view.Menu menu) {
    }
    
    private final int getSearchString() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void checkShortcuts() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final android.content.pm.ShortcutInfo getLaunchDialpadShortcut(int appIconColor) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final android.content.pm.ShortcutInfo getCreateNewContactShortcut(int appIconColor) {
        return null;
    }
    
    private final com.simplemobiletools.contacts.pro.fragments.MyViewPagerFragment getCurrentFragment() {
        return null;
    }
    
    private final void setupTabColors() {
    }
    
    private final java.util.List<java.lang.Integer> getInactiveTabIndexes(int activeIndex) {
        return null;
    }
    
    private final void initFragments() {
    }
    
    private final void showSortingDialog() {
    }
    
    public final void showFilterDialog() {
    }
    
    private final void launchDialpad() {
    }
    
    private final void tryImportContacts() {
    }
    
    private final void importContacts() {
    }
    
    private final void showImportContactsDialog(java.lang.String path) {
    }
    
    private final void tryImportContactsFromFile(android.net.Uri uri) {
    }
    
    private final void tryExportContacts() {
    }
    
    private final void exportContacts() {
    }
    
    private final void launchAbout() {
    }
    
    @java.lang.Override()
    public void refreshContacts(int refreshTabsMask) {
    }
    
    @java.lang.Override()
    public void contactClicked(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.fragments.MyViewPagerFragment> getAllFragments() {
        return null;
    }
    
    private final void checkWhatsNewDialog() {
    }
    
    public MainActivity() {
        super();
    }
}