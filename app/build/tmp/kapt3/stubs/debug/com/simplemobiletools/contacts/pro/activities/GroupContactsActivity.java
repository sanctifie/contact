package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020\u00122\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`$H\u0016J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J \u0010\'\u001a\u00020\u00122\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`$H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/GroupContactsActivity;", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "Lcom/simplemobiletools/contacts/pro/interfaces/RemoveFromGroupListener;", "Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "()V", "allContacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "group", "Lcom/simplemobiletools/contacts/pro/models/Group;", "getGroup", "()Lcom/simplemobiletools/contacts/pro/models/Group;", "setGroup", "(Lcom/simplemobiletools/contacts/pro/models/Group;)V", "groupContacts", "wasInit", "", "contactClicked", "", "contact", "fabClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "refreshContacts", "refreshTabsMask", "", "removeFromGroup", "contacts", "Lkotlin/collections/ArrayList;", "sendEmailToGroup", "sendSMSToGroup", "updateContacts", "contacts_debug"})
public final class GroupContactsActivity extends com.simplemobiletools.contacts.pro.activities.SimpleActivity implements com.simplemobiletools.contacts.pro.interfaces.RemoveFromGroupListener, com.simplemobiletools.contacts.pro.interfaces.RefreshContactsListener {
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> allContacts;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> groupContacts;
    private boolean wasInit;
    @org.jetbrains.annotations.NotNull()
    public com.simplemobiletools.contacts.pro.models.Group group;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.models.Group getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Group p0) {
    }
    
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
    
    private final void fabClicked() {
    }
    
    private final void refreshContacts() {
    }
    
    private final void sendSMSToGroup() {
    }
    
    private final void sendEmailToGroup() {
    }
    
    private final void updateContacts(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    @java.lang.Override()
    public void refreshContacts(int refreshTabsMask) {
    }
    
    @java.lang.Override()
    public void contactClicked(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    @java.lang.Override()
    public void removeFromGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    public GroupContactsActivity() {
        super();
    }
}