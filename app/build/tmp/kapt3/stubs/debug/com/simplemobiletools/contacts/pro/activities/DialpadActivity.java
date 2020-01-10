package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0003J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J \u0010\u001c\u001a\u00020\u000b2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\"\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u000bH\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u00060"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/DialpadActivity;", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "()V", "contacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "getContacts", "()Ljava/util/ArrayList;", "setContacts", "(Ljava/util/ArrayList;)V", "addNumberToContact", "", "checkDialIntent", "clearChar", "view", "Landroid/view/View;", "clearInput", "dialpadPressed", "char", "", "dialpadValueChanged", "text", "disableKeyboardPopping", "getCharKeyCode", "", "getKeyEvent", "Landroid/view/KeyEvent;", "keyCode", "gotContacts", "newContacts", "Lkotlin/collections/ArrayList;", "initCall", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "contacts_debug"})
public final class DialpadActivity extends com.simplemobiletools.contacts.pro.activities.SimpleActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getContacts() {
        return null;
    }
    
    public final void setContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> p0) {
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
    
    private final void checkDialIntent() {
    }
    
    private final void addNumberToContact() {
    }
    
    private final void dialpadPressed(java.lang.String p0_1526187, android.view.View view) {
    }
    
    private final void clearChar(android.view.View view) {
    }
    
    private final void clearInput() {
    }
    
    private final android.view.KeyEvent getKeyEvent(int keyCode) {
        return null;
    }
    
    private final int getCharKeyCode(java.lang.String p0_1526187) {
        return 0;
    }
    
    private final void disableKeyboardPopping() {
    }
    
    private final void gotContacts(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> newContacts) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final void dialpadValueChanged(java.lang.String text) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void initCall() {
    }
    
    public DialpadActivity() {
        super();
    }
}