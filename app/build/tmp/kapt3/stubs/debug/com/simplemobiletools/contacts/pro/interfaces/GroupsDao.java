package com.simplemobiletools.contacts.pro.interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/simplemobiletools/contacts/pro/interfaces/GroupsDao;", "", "deleteGroupId", "", "id", "", "getGroups", "", "Lcom/simplemobiletools/contacts/pro/models/Group;", "insertOrUpdate", "group", "contacts_debug"})
public abstract interface GroupsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM groups")
    public abstract java.util.List<com.simplemobiletools.contacts.pro.models.Group> getGroups();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertOrUpdate(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Group group);
    
    @androidx.room.Query(value = "DELETE FROM groups WHERE id = :id")
    public abstract void deleteGroupId(long id);
}