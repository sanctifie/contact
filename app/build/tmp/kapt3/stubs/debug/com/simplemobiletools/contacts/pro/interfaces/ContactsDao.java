package com.simplemobiletools.contacts.pro.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\'J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/simplemobiletools/contacts/pro/interfaces/ContactsDao;", "", "deleteContactId", "", "id", "", "deleteContactIds", "ids", "", "", "getContactWithId", "Lcom/simplemobiletools/contacts/pro/models/LocalContact;", "getContacts", "insertOrUpdate", "contact", "updateStarred", "isStarred", "contacts_debug"})
public abstract interface ContactsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM contacts")
    public abstract java.util.List<com.simplemobiletools.contacts.pro.models.LocalContact> getContacts();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM contacts WHERE id = :id")
    public abstract com.simplemobiletools.contacts.pro.models.LocalContact getContactWithId(int id);
    
    @androidx.room.Query(value = "UPDATE contacts SET starred = :isStarred WHERE id = :id")
    public abstract void updateStarred(int isStarred, int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertOrUpdate(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.LocalContact contact);
    
    @androidx.room.Query(value = "DELETE FROM contacts WHERE id = :id")
    public abstract void deleteContactId(int id);
    
    @androidx.room.Query(value = "DELETE FROM contacts WHERE id IN (:ids)")
    public abstract void deleteContactIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
}