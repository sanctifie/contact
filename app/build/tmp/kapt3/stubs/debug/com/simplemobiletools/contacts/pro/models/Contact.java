package com.simplemobiletools.contacts.pro.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u0083\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0083\u0001B\u00a7\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\rj\b\u0012\u0004\u0012\u00020\u001e`\u000f\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000f\u0012\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\rj\b\u0012\u0004\u0012\u00020#`\u000f\u00a2\u0006\u0002\u0010$J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0000H\u0096\u0002J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010^\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fH\u00c6\u0003J\u0019\u0010_\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000fH\u00c6\u0003J\u0019\u0010`\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000fH\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\rj\b\u0012\u0004\u0012\u00020\u001e`\u000fH\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020 H\u00c6\u0003J\u0019\u0010j\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000fH\u00c6\u0003J\u0019\u0010k\u001a\u0012\u0012\u0004\u0012\u00020#0\rj\b\u0012\u0004\u0012\u00020#`\u000fH\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u00c6\u0003J\u00d7\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\rj\b\u0012\u0004\u0012\u00020\u001e`\u000f2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0018\b\u0002\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000f2\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\rj\b\u0012\u0004\u0012\u00020#`\u000fH\u00c6\u0001J\u0016\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00052\u0006\u0010w\u001a\u00020uJ\u0013\u0010x\u001a\u00020u2\b\u0010\\\u001a\u0004\u0018\u00010yH\u00d6\u0003J\u0006\u0010z\u001a\u00020\u0005J\u0006\u0010{\u001a\u00020\u0005J\u0006\u0010|\u001a\u00020\u0003J\u0006\u0010}\u001a\u00020\u0005J\u0006\u0010~\u001a\u00020\u0005J\t\u0010\u007f\u001a\u00020\u0003H\u00d6\u0001J\u0007\u0010\u0080\u0001\u001a\u00020uJ\u0007\u0010\u0081\u0001\u001a\u00020uJ\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00d6\u0001R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\rj\b\u0012\u0004\u0012\u00020#`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\rj\b\u0012\u0004\u0012\u00020\u001e`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010&\"\u0004\bF\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u00104\"\u0004\bL\u00106R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00104\"\u0004\bP\u00106R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u00104\"\u0004\bX\u00106R*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010(\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/simplemobiletools/contacts/pro/models/Contact;", "", "id", "", "prefix", "", "firstName", "middleName", "surname", "suffix", "nickname", "photoUri", "phoneNumbers", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/PhoneNumber;", "Lkotlin/collections/ArrayList;", "emails", "Lcom/simplemobiletools/contacts/pro/models/Email;", "addresses", "Lcom/simplemobiletools/contacts/pro/models/Address;", "events", "Lcom/simplemobiletools/contacts/pro/models/Event;", "source", "starred", "contactId", "thumbnailUri", "photo", "Landroid/graphics/Bitmap;", "notes", "groups", "Lcom/simplemobiletools/contacts/pro/models/Group;", "organization", "Lcom/simplemobiletools/contacts/pro/models/Organization;", "websites", "IMs", "Lcom/simplemobiletools/contacts/pro/models/IM;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;IILjava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/util/ArrayList;Lcom/simplemobiletools/contacts/pro/models/Organization;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getIMs", "()Ljava/util/ArrayList;", "setIMs", "(Ljava/util/ArrayList;)V", "getAddresses", "setAddresses", "getContactId", "()I", "setContactId", "(I)V", "getEmails", "setEmails", "getEvents", "setEvents", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getGroups", "setGroups", "getId", "setId", "getMiddleName", "setMiddleName", "getNickname", "setNickname", "getNotes", "setNotes", "getOrganization", "()Lcom/simplemobiletools/contacts/pro/models/Organization;", "setOrganization", "(Lcom/simplemobiletools/contacts/pro/models/Organization;)V", "getPhoneNumbers", "setPhoneNumbers", "getPhoto", "()Landroid/graphics/Bitmap;", "setPhoto", "(Landroid/graphics/Bitmap;)V", "getPhotoUri", "setPhotoUri", "getPrefix", "setPrefix", "getSource", "setSource", "getStarred", "setStarred", "getSuffix", "setSuffix", "getSurname", "setSurname", "getThumbnailUri", "setThumbnailUri", "getWebsites", "setWebsites", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "doesContainPhoneNumber", "", "text", "convertLetters", "equals", "", "getBubbleText", "getFullCompany", "getHashToCompare", "getNameToDisplay", "getStringToCompare", "hashCode", "isABusinessContact", "isPrivate", "toString", "Companion", "contacts_debug"})
public final class Contact implements java.lang.Comparable<com.simplemobiletools.contacts.pro.models.Contact> {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String prefix;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String middleName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String surname;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String suffix;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nickname;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoUri;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String source;
    private int starred;
    private int contactId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String thumbnailUri;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap photo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String notes;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups;
    @org.jetbrains.annotations.NotNull()
    private com.simplemobiletools.contacts.pro.models.Organization organization;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> websites;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs;
    private static int sorting;
    private static boolean startWithSurname;
    public static final com.simplemobiletools.contacts.pro.models.Contact.Companion Companion = null;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBubbleText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameToDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringToCompare() {
        return null;
    }
    
    public final int getHashToCompare() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullCompany() {
        return null;
    }
    
    public final boolean isABusinessContact() {
        return false;
    }
    
    public final boolean doesContainPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean convertLetters) {
        return false;
    }
    
    public final boolean isPrivate() {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    public final void setPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMiddleName() {
        return null;
    }
    
    public final void setMiddleName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSurname() {
        return null;
    }
    
    public final void setSurname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuffix() {
        return null;
    }
    
    public final void setSuffix(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoUri() {
        return null;
    }
    
    public final void setPhotoUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> getPhoneNumbers() {
        return null;
    }
    
    public final void setPhoneNumbers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> getEmails() {
        return null;
    }
    
    public final void setEmails(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> getAddresses() {
        return null;
    }
    
    public final void setAddresses(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStarred() {
        return 0;
    }
    
    public final void setStarred(int p0) {
    }
    
    public final int getContactId() {
        return 0;
    }
    
    public final void setContactId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnailUri() {
        return null;
    }
    
    public final void setThumbnailUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.models.Organization getOrganization() {
        return null;
    }
    
    public final void setOrganization(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Organization p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getWebsites() {
        return null;
    }
    
    public final void setWebsites(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> getIMs() {
        return null;
    }
    
    public final void setIMs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> p0) {
    }
    
    public Contact(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUri, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events, @org.jetbrains.annotations.NotNull()
    java.lang.String source, int starred, int contactId, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUri, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap photo, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Organization organization, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.models.Organization component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.models.Contact copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUri, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events, @org.jetbrains.annotations.NotNull()
    java.lang.String source, int starred, int contactId, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUri, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap photo, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Organization organization, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/simplemobiletools/contacts/pro/models/Contact$Companion;", "", "()V", "sorting", "", "getSorting", "()I", "setSorting", "(I)V", "startWithSurname", "", "getStartWithSurname", "()Z", "setStartWithSurname", "(Z)V", "contacts_debug"})
    public static final class Companion {
        
        public final int getSorting() {
            return 0;
        }
        
        public final void setSorting(int p0) {
        }
        
        public final boolean getStartWithSurname() {
            return false;
        }
        
        public final void setStartWithSurname(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}