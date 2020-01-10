package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010J\"\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/ContactActivity;", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "()V", "contact", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "getContact", "()Lcom/simplemobiletools/contacts/pro/models/Contact;", "setContact", "(Lcom/simplemobiletools/contacts/pro/models/Contact;)V", "currentContactPhotoPath", "", "getCurrentContactPhotoPath", "()Ljava/lang/String;", "setCurrentContactPhotoPath", "(Ljava/lang/String;)V", "deleteContact", "", "getAddressTypeText", "type", "", "label", "getEmailTypeText", "getEventTextId", "getIMTypeText", "getPhoneNumberTypeText", "shareContact", "showPhotoPlaceholder", "photoView", "Landroid/widget/ImageView;", "trySendEmail", "trySendSMS", "updateContactPhoto", "path", "bitmap", "Landroid/graphics/Bitmap;", "contacts_debug"})
public abstract class ContactActivity extends com.simplemobiletools.contacts.pro.activities.SimpleActivity {
    @org.jetbrains.annotations.Nullable()
    private com.simplemobiletools.contacts.pro.models.Contact contact;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentContactPhotoPath;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final com.simplemobiletools.contacts.pro.models.Contact getContact() {
        return null;
    }
    
    protected final void setContact(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.contacts.pro.models.Contact p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getCurrentContactPhotoPath() {
        return null;
    }
    
    protected final void setCurrentContactPhotoPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void showPhotoPlaceholder(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView photoView) {
    }
    
    public final void updateContactPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView photoView, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
    }
    
    public final void deleteContact() {
    }
    
    public final void shareContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
    }
    
    public final void trySendSMS() {
    }
    
    public final void trySendEmail() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumberTypeText(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailTypeText(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressTypeText(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIMTypeText(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        return null;
    }
    
    public final int getEventTextId(int type) {
        return 0;
    }
    
    public ContactActivity() {
        super();
    }
}