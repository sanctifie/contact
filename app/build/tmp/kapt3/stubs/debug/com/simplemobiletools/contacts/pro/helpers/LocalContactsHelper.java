package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J,\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\nj\b\u0012\u0004\u0012\u00020\u0015`\fH\u0002J\u0014\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018J\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u000bJ&\u0010#\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eJ!\u0010$\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001c0%2\u0006\u0010&\u001a\u00020\"\u00a2\u0006\u0002\u0010\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006("}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/LocalContactsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "addContactsToGroup", "", "contacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "Lkotlin/collections/ArrayList;", "groupId", "", "convertContactToLocalContact", "Lcom/simplemobiletools/contacts/pro/models/LocalContact;", "contact", "convertLocalContactToContact", "localContact", "storedGroups", "Lcom/simplemobiletools/contacts/pro/models/Group;", "deleteContactIds", "ids", "", "getAllContacts", "getContactWithId", "id", "", "getPhotoByteArray", "", "uri", "", "insertOrUpdateContact", "", "removeContactsFromGroup", "toggleFavorites", "", "addToFavorites", "([Ljava/lang/Integer;Z)V", "contacts_debug"})
public final class LocalContactsHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> getAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.contacts.pro.models.Contact getContactWithId(int id) {
        return null;
    }
    
    public final boolean insertOrUpdateContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
        return false;
    }
    
    public final void addContactsToGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, long groupId) {
    }
    
    public final void removeContactsFromGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, long groupId) {
    }
    
    public final void deleteContactIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids) {
    }
    
    public final void toggleFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.Integer[] ids, boolean addToFavorites) {
    }
    
    private final byte[] getPhotoByteArray(java.lang.String uri) {
        return null;
    }
    
    private final com.simplemobiletools.contacts.pro.models.Contact convertLocalContactToContact(com.simplemobiletools.contacts.pro.models.LocalContact localContact, java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> storedGroups) {
        return null;
    }
    
    private final com.simplemobiletools.contacts.pro.models.LocalContact convertContactToLocalContact(com.simplemobiletools.contacts.pro.models.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public LocalContactsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}