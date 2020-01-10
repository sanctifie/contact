package com.simplemobiletools.contacts.pro.databases;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.simplemobiletools.contacts.pro.helpers.Converters.class})
@androidx.room.Database(entities = {com.simplemobiletools.contacts.pro.models.LocalContact.class, com.simplemobiletools.contacts.pro.models.Group.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/simplemobiletools/contacts/pro/databases/ContactsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "ContactsDao", "Lcom/simplemobiletools/contacts/pro/interfaces/ContactsDao;", "GroupsDao", "Lcom/simplemobiletools/contacts/pro/interfaces/GroupsDao;", "Companion", "contacts_debug"})
public abstract class ContactsDatabase extends androidx.room.RoomDatabase {
    private static com.simplemobiletools.contacts.pro.databases.ContactsDatabase db;
    public static final com.simplemobiletools.contacts.pro.databases.ContactsDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.contacts.pro.interfaces.ContactsDao ContactsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.contacts.pro.interfaces.GroupsDao GroupsDao();
    
    public ContactsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/simplemobiletools/contacts/pro/databases/ContactsDatabase$Companion;", "", "()V", "db", "Lcom/simplemobiletools/contacts/pro/databases/ContactsDatabase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "increaseAutoIncrementIds", "contacts_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.contacts.pro.databases.ContactsDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private final void increaseAutoIncrementIds() {
        }
        
        private Companion() {
            super();
        }
    }
}