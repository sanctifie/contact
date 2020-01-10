package com.simplemobiletools.contacts.pro.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001d\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR2\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/simplemobiletools/contacts/pro/dialogs/SelectGroupsDialog;", "", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "selectedGroups", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Group;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newGroups", "", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "checkboxes", "Lcom/simplemobiletools/commons/views/MyAppCompatCheckbox;", "config", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "groups", "getSelectedGroups", "()Ljava/util/ArrayList;", "view", "Landroid/view/ViewGroup;", "addCreateNewGroupButton", "addGroupCheckbox", "group", "dialogConfirmed", "initDialog", "contacts_debug"})
public final class SelectGroupsDialog {
    private final android.view.ViewGroup view = null;
    private final java.util.ArrayList<com.simplemobiletools.commons.views.MyAppCompatCheckbox> checkboxes = null;
    private java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> groups;
    private final com.simplemobiletools.contacts.pro.helpers.Config config = null;
    private androidx.appcompat.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> selectedGroups = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group>, kotlin.Unit> callback = null;
    
    private final void initDialog() {
    }
    
    private final void addGroupCheckbox(com.simplemobiletools.contacts.pro.models.Group group) {
    }
    
    private final void addCreateNewGroupButton() {
    }
    
    private final void dialogConfirmed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> getSelectedGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group>, kotlin.Unit> getCallback() {
        return null;
    }
    
    public SelectGroupsDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group> selectedGroups, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Group>, kotlin.Unit> callback) {
        super();
    }
}