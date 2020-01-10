package com.simplemobiletools.contacts.pro.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012V\u0010\t\u001aR\u0012#\u0012!\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012#\u0012!\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ra\u0010\t\u001aR\u0012#\u0012!\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012#\u0012!\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/simplemobiletools/contacts/pro/dialogs/SelectContactsDialog;", "", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "initialContacts", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "Lkotlin/collections/ArrayList;", "selectContacts", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "addedContacts", "removedContacts", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function2;", "initiallySelectedContacts", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "dialogConfirmed", "contacts_debug"})
public final class SelectContactsDialog {
    private android.view.View view;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> initiallySelectedContacts;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, kotlin.Unit> callback = null;
    
    private final void dialogConfirmed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, kotlin.Unit> getCallback() {
        return null;
    }
    
    public SelectContactsDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> initialContacts, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact> selectContacts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, ? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Contact>, kotlin.Unit> callback) {
        super();
    }
}