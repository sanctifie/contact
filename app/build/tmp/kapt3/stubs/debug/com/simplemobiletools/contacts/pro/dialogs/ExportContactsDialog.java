package com.simplemobiletools.contacts.pro.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012<\u0010\u0006\u001a8\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011RD\u0010\u0006\u001a8\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/simplemobiletools/contacts/pro/dialogs/ExportContactsDialog;", "", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "path", "", "callback", "Lkotlin/Function2;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", "Ljava/util/HashSet;", "ignoredContactSources", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "contactSources", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/ContactSource;", "ignoreClicks", "", "getPath", "()Ljava/lang/String;", "contacts_debug"})
public final class ExportContactsDialog {
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.ContactSource> contactSources;
    private boolean ignoreClicks;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    private final kotlin.jvm.functions.Function2<java.io.File, java.util.HashSet<java.lang.String>, kotlin.Unit> callback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public ExportContactsDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.io.File, ? super java.util.HashSet<java.lang.String>, kotlin.Unit> callback) {
        super();
    }
}