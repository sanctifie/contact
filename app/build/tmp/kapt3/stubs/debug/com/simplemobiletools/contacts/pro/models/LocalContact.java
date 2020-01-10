package com.simplemobiletools.contacts.pro.models;

import java.lang.System;

@androidx.room.Entity(tableName = "contacts", indices = {@androidx.room.Index(unique = true, value = {"id"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u000ej\b\u0012\u0004\u0012\u00020\u0012`\u0010\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000ej\b\u0012\u0004\u0012\u00020\u0017`\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000ej\b\u0012\u0004\u0012\u00020\u001a`\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u0010\u0012\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u000ej\b\u0012\u0004\u0012\u00020\u001f`\u0010\u00a2\u0006\u0002\u0010 J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0019\u0010S\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u000ej\b\u0012\u0004\u0012\u00020\u0012`\u0010H\u00c6\u0003J\u0019\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u0010H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000ej\b\u0012\u0004\u0012\u00020\u0017`\u0010H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000ej\b\u0012\u0004\u0012\u00020\u001a`\u0010H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u0010H\u00c6\u0003J\u0019\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u000ej\b\u0012\u0004\u0012\u00020\u001f`\u0010H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0019\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u00c6\u0003J\u00c0\u0002\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u000ej\b\u0012\u0004\u0012\u00020\u0012`\u00102\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000ej\b\u0012\u0004\u0012\u00020\u0017`\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00052\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000ej\b\u0012\u0004\u0012\u00020\u001a`\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u00102\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u000ej\b\u0012\u0004\u0012\u00020\u001f`\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010j\u001a\u00020\u0003H\u0016J\t\u0010k\u001a\u00020\u0005H\u00d6\u0001R.\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u000ej\b\u0012\u0004\u0012\u00020\u001f`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000ej\b\u0012\u0004\u0012\u00020\u0017`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001e\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R.\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u000ej\b\u0012\u0004\u0012\u00020\u0012`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R.\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000ej\b\u0012\u0004\u0012\u00020\u0014`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R.\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000ej\b\u0012\u0004\u0012\u00020\u001a`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R\u001e\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R.\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010(\"\u0004\bG\u0010*R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010(\"\u0004\bM\u0010*R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R.\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010$\u00a8\u0006l"}, d2 = {"Lcom/simplemobiletools/contacts/pro/models/LocalContact;", "", "id", "", "prefix", "", "firstName", "middleName", "surname", "suffix", "nickname", "photo", "", "phoneNumbers", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/PhoneNumber;", "Lkotlin/collections/ArrayList;", "emails", "Lcom/simplemobiletools/contacts/pro/models/Email;", "events", "Lcom/simplemobiletools/contacts/pro/models/Event;", "starred", "addresses", "Lcom/simplemobiletools/contacts/pro/models/Address;", "notes", "groups", "", "company", "jobPosition", "websites", "IMs", "Lcom/simplemobiletools/contacts/pro/models/IM;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getIMs", "()Ljava/util/ArrayList;", "setIMs", "(Ljava/util/ArrayList;)V", "getAddresses", "setAddresses", "getCompany", "()Ljava/lang/String;", "setCompany", "(Ljava/lang/String;)V", "getEmails", "setEmails", "getEvents", "setEvents", "getFirstName", "setFirstName", "getGroups", "setGroups", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getJobPosition", "setJobPosition", "getMiddleName", "setMiddleName", "getNickname", "setNickname", "getNotes", "setNotes", "getPhoneNumbers", "setPhoneNumbers", "getPhoto", "()[B", "setPhoto", "([B)V", "getPrefix", "setPrefix", "getStarred", "()I", "setStarred", "(I)V", "getSuffix", "setSuffix", "getSurname", "setSurname", "getWebsites", "setWebsites", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lcom/simplemobiletools/contacts/pro/models/LocalContact;", "equals", "", "other", "hashCode", "toString", "contacts_debug"})
public final class LocalContact {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "prefix")
    private java.lang.String prefix;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "first_name")
    private java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "middle_name")
    private java.lang.String middleName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "surname")
    private java.lang.String surname;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "suffix")
    private java.lang.String suffix;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nickname")
    private java.lang.String nickname;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "photo", typeAffinity = androidx.room.ColumnInfo.BLOB)
    private byte[] photo;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "phone_numbers")
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emails")
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "events")
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events;
    @androidx.room.ColumnInfo(name = "starred")
    private int starred;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "addresses")
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "notes")
    private java.lang.String notes;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "groups")
    private java.util.ArrayList<java.lang.Long> groups;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "company")
    private java.lang.String company;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "job_position")
    private java.lang.String jobPosition;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "websites")
    private java.util.ArrayList<java.lang.String> websites;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ims")
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
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
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> p0) {
    }
    
    public final int getStarred() {
        return 0;
    }
    
    public final void setStarred(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> getAddresses() {
        return null;
    }
    
    public final void setAddresses(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Long> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJobPosition() {
        return null;
    }
    
    public final void setJobPosition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    public LocalContact(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.Nullable()
    byte[] photo, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events, int starred, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Long> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String jobPosition, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] component8() {
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
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Long> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.models.LocalContact copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, @org.jetbrains.annotations.NotNull()
    java.lang.String nickname, @org.jetbrains.annotations.Nullable()
    byte[] photo, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> emails, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> events, int starred, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> addresses, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Long> groups, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String jobPosition, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> IMs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}