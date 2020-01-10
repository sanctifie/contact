package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0018\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0010H\u0014J\b\u0010&\u001a\u00020\u0010H\u0002J\b\u0010\'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\b\u0010+\u001a\u00020\u0010H\u0002J\b\u0010,\u001a\u00020\u0010H\u0002J\b\u0010-\u001a\u00020\u0010H\u0002J\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\b\u00100\u001a\u00020\u0010H\u0002J\b\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020\u0010H\u0002J\b\u00104\u001a\u00020\u0010H\u0002J\u0014\u00105\u001a\u00020\u0010*\u0002062\u0006\u00107\u001a\u000208H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/ViewContactActivity;", "Lcom/simplemobiletools/contacts/pro/activities/ContactActivity;", "()V", "COMPARABLE_PHONE_NUMBER_LENGTH", "", "contactSources", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/ContactSource;", "duplicateContacts", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "fullContact", "isViewIntent", "", "showFields", "wasEditLaunched", "deleteContactFromAllSources", "", "getDuplicateContacts", "callback", "Lkotlin/Function0;", "getStarDrawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "on", "gotContact", "initContact", "launchEditContact", "contact", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "openWith", "setupAddresses", "setupContactDetails", "setupContactSources", "setupEmails", "setupEvents", "setupFavorite", "setupGroups", "setupIMs", "setupNames", "setupNotes", "setupOrganization", "setupPhoneNumbers", "setupViewContact", "setupWebsites", "copyOnLongClick", "Landroid/view/View;", "value", "", "contacts_debug"})
public final class ViewContactActivity extends com.simplemobiletools.contacts.pro.activities.ContactActivity {
    private boolean isViewIntent;
    private boolean wasEditLaunched;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> duplicateContacts;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.ContactSource> contactSources;
    private int showFields;
    private com.simplemobiletools.contacts.pro.models.Contact fullContact;
    private final int COMPARABLE_PHONE_NUMBER_LENGTH = 7;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
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
    
    private final void initContact() {
    }
    
    private final void gotContact() {
    }
    
    private final void setupViewContact() {
    }
    
    private final void setupContactDetails() {
    }
    
    private final void launchEditContact(com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    private final void openWith() {
    }
    
    private final void setupFavorite() {
    }
    
    private final void setupNames() {
    }
    
    private final void setupPhoneNumbers() {
    }
    
    private final void setupEmails() {
    }
    
    private final void setupAddresses() {
    }
    
    private final void setupIMs() {
    }
    
    private final void setupEvents() {
    }
    
    private final void setupWebsites() {
    }
    
    private final void setupGroups() {
    }
    
    private final void setupContactSources() {
    }
    
    private final void setupNotes() {
    }
    
    private final void setupOrganization() {
    }
    
    private final void getDuplicateContacts(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    private final void deleteContactFromAllSources() {
    }
    
    private final android.graphics.drawable.Drawable getStarDrawable(boolean on) {
        return null;
    }
    
    private final void copyOnLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$copyOnLongClick, java.lang.String value) {
    }
    
    public ViewContactActivity() {
        super();
    }
}