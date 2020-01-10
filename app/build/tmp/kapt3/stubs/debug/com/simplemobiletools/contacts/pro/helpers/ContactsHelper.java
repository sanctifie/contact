package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u0010J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J8\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\nj\b\u0012\u0004\u0012\u00020\u0019`\u00102\u0006\u0010\u001a\u001a\u00020\u000f2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\nj\b\u0012\u0004\u0012\u00020\u0019`\u0010H\u0002J \u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bJ;\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\r0&J\u001e\u0010*\u001a\u00020$2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u0010J\u000e\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012J\u001e\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J/\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002050\nj\b\u0012\u0004\u0012\u000205`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106JG\u00107\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\nj\b\u0012\u0004\u0012\u00020\u001d`\u0010042\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\nj\b\u0012\u0004\u0012\u00020\u001d`\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bJ\u0016\u0010;\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bJ\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0>H\u0002\u00a2\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J*\u0010A\u001a\u00020\r2\"\u0010%\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002020\nj\b\u0012\u0004\u0012\u000202`\u0010\u0012\u0004\u0012\u00020\r0&J\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u0002020\nj\b\u0012\u0004\u0012\u000202`\u0010J\u0018\u0010C\u001a\u0004\u0018\u00010\u000f2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010D\u001a\u00020$J\u0010\u0010E\u001a\u0004\u0018\u00010\u000f2\u0006\u0010F\u001a\u00020\u000bJD\u0010G\u001a\u00020\r2\b\b\u0002\u0010H\u001a\u00020$2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b012\"\u0010%\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\u0004\u0012\u00020\r0&J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\f\u0010K\u001a\b\u0012\u0004\u0012\u0002020LJ&\u0010M\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f042\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u000101H\u0002J\u0018\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\nj\b\u0012\u0004\u0012\u00020\u001d`\u0010H\u0002J:\u0010O\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020$2\"\u0010%\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\u0004\u0012\u00020\r0&J/\u0010Q\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020R0\nj\b\u0012\u0004\u0012\u00020R`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J/\u0010S\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020T0\nj\b\u0012\u0004\u0012\u00020T`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J/\u0010U\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020V0\nj\b\u0012\u0004\u0012\u00020V`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000b042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J\u001f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J/\u0010[\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\\0\nj\b\u0012\u0004\u0012\u00020\\`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J\b\u0010]\u001a\u00020\u000bH\u0002J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0012H\u0002J\b\u0010_\u001a\u00020\u000bH\u0002J&\u0010`\u001a\u00020\u000b2\b\b\u0002\u0010a\u001a\u00020$2\b\b\u0002\u0010b\u001a\u00020$2\b\b\u0002\u0010c\u001a\u00020$H\u0002J+\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000b0>2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010fJ*\u0010g\u001a\u00020\r2\"\u0010%\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\nj\b\u0012\u0004\u0012\u00020\u001d`\u0010\u0012\u0004\u0012\u00020\r0&J\u0016\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\nj\b\u0012\u0004\u0012\u00020\u001d`\u0010J/\u0010i\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\u0010042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u00106J\u000e\u0010j\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u000fJ%\u0010k\u001a\u0004\u0018\u00010\u000f2\u0006\u0010l\u001a\u00020\u000b2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000b0>H\u0002\u00a2\u0006\u0002\u0010nJ&\u0010o\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010p\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u0010J8\u0010q\u001a\u0012\u0012\u0004\u0012\u00020\u00190\nj\b\u0012\u0004\u0012\u00020\u0019`\u00102\u0006\u0010\u001a\u001a\u00020\u000f2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\nj\b\u0012\u0004\u0012\u00020\u0019`\u0010H\u0002J\u000e\u0010r\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u001dJ(\u0010t\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010u\u001a\u00020$H\u0002J(\u0010v\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010u\u001a\u00020$H\u0002J\u0016\u0010w\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/ContactsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "BATCH_SIZE", "", "getContext", "()Landroid/content/Context;", "displayContactSources", "Ljava/util/ArrayList;", "", "addContactsToGroup", "", "contacts", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "Lkotlin/collections/ArrayList;", "groupId", "", "addFavorites", "addFullSizePhoto", "contactId", "fullSizePhotoData", "", "addPhoto", "Landroid/content/ContentProviderOperation;", "contact", "operations", "createNewGroup", "Lcom/simplemobiletools/contacts/pro/models/Group;", "title", "accountName", "accountType", "deleteContact", "originalContact", "deleteClones", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "deleteContacts", "deleteGroup", "id", "fillSourcesFromUri", "uri", "Landroid/net/Uri;", "sources", "Ljava/util/HashSet;", "Lcom/simplemobiletools/contacts/pro/models/ContactSource;", "getAddresses", "Landroid/util/SparseArray;", "Lcom/simplemobiletools/contacts/pro/models/Address;", "(Ljava/lang/Integer;)Landroid/util/SparseArray;", "getContactGroups", "storedGroups", "(Ljava/util/ArrayList;Ljava/lang/Integer;)Landroid/util/SparseArray;", "getContactLookupKey", "getContactMimeTypeId", "mimeType", "getContactProjection", "", "()[Ljava/lang/String;", "getContactSourceType", "getContactSources", "getContactSourcesSync", "getContactWithId", "isLocalPrivate", "getContactWithLookupKey", "key", "getContacts", "getAll", "ignoredContactSources", "getContentResolverAccounts", "getDeviceContactSources", "Ljava/util/LinkedHashSet;", "getDeviceContacts", "getDeviceStoredGroups", "getDuplicatesOfContact", "addOriginal", "getEmails", "Lcom/simplemobiletools/contacts/pro/models/Email;", "getEvents", "Lcom/simplemobiletools/contacts/pro/models/Event;", "getIMs", "Lcom/simplemobiletools/contacts/pro/models/IM;", "getNicknames", "getNotes", "getOrganizations", "Lcom/simplemobiletools/contacts/pro/models/Organization;", "getPhoneNumbers", "Lcom/simplemobiletools/contacts/pro/models/PhoneNumber;", "getQuestionMarks", "getRealContactId", "getSortString", "getSourcesSelection", "addMimeType", "addContactId", "useRawContactId", "getSourcesSelectionArgs", "mimetype", "(Ljava/lang/String;Ljava/lang/Integer;)[Ljava/lang/String;", "getStoredGroups", "getStoredGroupsSync", "getWebsites", "insertContact", "parseContactCursor", "selection", "selectionArgs", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/simplemobiletools/contacts/pro/models/Contact;", "removeContactsFromGroup", "removeFavorites", "removePhoto", "renameGroup", "group", "toggleFavorites", "addToFavorites", "toggleLocalFavorites", "updateContact", "photoUpdateStatus", "contacts_debug"})
public final class ContactsHelper {
    private final int BATCH_SIZE = 50;
    private java.util.ArrayList<java.lang.String> displayContactSources;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void getContacts(boolean getAll, @org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> ignoredContactSources, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, kotlin.Unit> callback) {
    }
    
    private final java.util.HashSet<com.simplemobiletools.contacts.pro.models.ContactSource> getContentResolverAccounts() {
        return null;
    }
    
    private final void fillSourcesFromUri(android.net.Uri uri, java.util.HashSet<com.simplemobiletools.contacts.pro.models.ContactSource> sources) {
    }
    
    private final void getDeviceContacts(android.util.SparseArray<com.simplemobiletools.contacts.pro.models.Contact> contacts, java.util.HashSet<java.lang.String> ignoredContactSources) {
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber>> getPhoneNumbers(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getNicknames(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email>> getEmails(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address>> getAddresses(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM>> getIMs(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event>> getEvents(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getNotes(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<com.simplemobiletools.contacts.pro.models.Organization> getOrganizations(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<java.lang.String>> getWebsites(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group>> getContactGroups(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> storedGroups, java.lang.Integer contactId) {
        return null;
    }
    
    private final java.lang.String getQuestionMarks() {
        return null;
    }
    
    private final java.lang.String getSourcesSelection(boolean addMimeType, boolean addContactId, boolean useRawContactId) {
        return null;
    }
    
    private final java.lang.String[] getSourcesSelectionArgs(java.lang.String mimetype, java.lang.Integer contactId) {
        return null;
    }
    
    public final void getStoredGroups(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getStoredGroupsSync() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getDeviceStoredGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.contacts.pro.models.Group createNewGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType) {
        return null;
    }
    
    public final void renameGroup(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Group group) {
    }
    
    public final void deleteGroup(long id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.contacts.pro.models.Contact getContactWithId(int id, boolean isLocalPrivate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.contacts.pro.models.Contact getContactWithLookupKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    private final com.simplemobiletools.contacts.pro.models.Contact parseContactCursor(java.lang.String selection, java.lang.String[] selectionArgs) {
        return null;
    }
    
    public final void getContactSources(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.ContactSource>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.ContactSource> getContactSourcesSync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashSet<com.simplemobiletools.contacts.pro.models.ContactSource> getDeviceContactSources() {
        return null;
    }
    
    private final java.lang.String getContactSourceType(java.lang.String accountName) {
        return null;
    }
    
    private final java.lang.String[] getContactProjection() {
        return null;
    }
    
    private final java.lang.String getSortString() {
        return null;
    }
    
    private final int getRealContactId(long id) {
        return 0;
    }
    
    public final boolean updateContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact, int photoUpdateStatus) {
        return false;
    }
    
    private final java.util.ArrayList<android.content.ContentProviderOperation> addPhoto(com.simplemobiletools.contacts.pro.models.Contact contact, java.util.ArrayList<android.content.ContentProviderOperation> operations) {
        return null;
    }
    
    private final java.util.ArrayList<android.content.ContentProviderOperation> removePhoto(com.simplemobiletools.contacts.pro.models.Contact contact, java.util.ArrayList<android.content.ContentProviderOperation> operations) {
        return null;
    }
    
    public final void addContactsToGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, long groupId) {
    }
    
    public final void removeContactsFromGroup(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, long groupId) {
    }
    
    public final boolean insertContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact) {
        return false;
    }
    
    private final void addFullSizePhoto(long contactId, byte[] fullSizePhotoData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContactLookupKey(@org.jetbrains.annotations.NotNull()
    java.lang.String contactId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContactMimeTypeId(@org.jetbrains.annotations.NotNull()
    java.lang.String contactId, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return null;
    }
    
    public final void addFavorites(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    public final void removeFavorites(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
    }
    
    private final void toggleFavorites(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, boolean addToFavorites) {
    }
    
    private final void toggleLocalFavorites(java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, boolean addToFavorites) {
    }
    
    public final void deleteContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact originalContact, boolean deleteClones, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public final boolean deleteContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts) {
        return false;
    }
    
    public final void getDuplicatesOfContact(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact, boolean addOriginal, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ContactsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}