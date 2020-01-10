package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002JO\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0012J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/VcfExporter;", "", "()V", "contactsExported", "", "contactsFailed", "exportContacts", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "file", "Ljava/io/File;", "contacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "showExportingToast", "", "callback", "Lkotlin/Function1;", "Lcom/simplemobiletools/contacts/pro/helpers/VcfExporter$ExportResult;", "Lkotlin/ParameterName;", "name", "result", "getAddressTypeLabel", "", "type", "label", "getEmailTypeLabel", "getPhoneNumberTypeLabel", "ExportResult", "contacts_debug"})
public final class VcfExporter {
    private int contactsExported;
    private int contactsFailed;
    
    public final void exportContacts(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> contacts, boolean showExportingToast, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.simplemobiletools.contacts.pro.helpers.VcfExporter.ExportResult, kotlin.Unit> callback) {
    }
    
    private final java.lang.String getPhoneNumberTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    private final java.lang.String getEmailTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    private final java.lang.String getAddressTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    public VcfExporter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/VcfExporter$ExportResult;", "", "(Ljava/lang/String;I)V", "EXPORT_FAIL", "EXPORT_OK", "EXPORT_PARTIAL", "contacts_debug"})
    public static enum ExportResult {
        /*public static final*/ EXPORT_FAIL /* = new EXPORT_FAIL() */,
        /*public static final*/ EXPORT_OK /* = new EXPORT_OK() */,
        /*public static final*/ EXPORT_PARTIAL /* = new EXPORT_PARTIAL() */;
        
        ExportResult() {
        }
    }
}