package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bJ\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/VcfImporter;", "", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "contactsFailed", "", "contactsImported", "formatDateToDayCode", "", "date", "Ljava/util/Date;", "getAddressTypeId", "type", "getContactGroups", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Group;", "ezContact", "Lezvcard/VCard;", "getEmailTypeId", "getPhoneNumberTypeId", "subtype", "importContacts", "Lcom/simplemobiletools/contacts/pro/helpers/VcfImporter$ImportResult;", "path", "targetContactSource", "savePhoto", "byteArray", "", "ImportResult", "contacts_debug"})
public final class VcfImporter {
    private int contactsImported;
    private int contactsFailed;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.helpers.VcfImporter.ImportResult importContacts(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String targetContactSource) {
        return null;
    }
    
    private final java.lang.String formatDateToDayCode(java.util.Date date) {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getContactGroups(ezvcard.VCard ezContact) {
        return null;
    }
    
    private final int getPhoneNumberTypeId(java.lang.String type, java.lang.String subtype) {
        return 0;
    }
    
    private final int getEmailTypeId(java.lang.String type) {
        return 0;
    }
    
    private final int getAddressTypeId(java.lang.String type) {
        return 0;
    }
    
    private final java.lang.String savePhoto(byte[] byteArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    public VcfImporter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/VcfImporter$ImportResult;", "", "(Ljava/lang/String;I)V", "IMPORT_FAIL", "IMPORT_OK", "IMPORT_PARTIAL", "contacts_debug"})
    public static enum ImportResult {
        /*public static final*/ IMPORT_FAIL /* = new IMPORT_FAIL() */,
        /*public static final*/ IMPORT_OK /* = new IMPORT_OK() */,
        /*public static final*/ IMPORT_PARTIAL /* = new IMPORT_PARTIAL() */;
        
        ImportResult() {
        }
    }
}