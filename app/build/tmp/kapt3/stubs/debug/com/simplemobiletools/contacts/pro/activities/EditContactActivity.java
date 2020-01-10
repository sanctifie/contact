package com.simplemobiletools.contacts.pro.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%H\u0002J\u0018\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\'0#j\b\u0012\u0004\u0012\u00020\'`%H\u0002J\u0018\u0010(\u001a\u0012\u0012\u0004\u0012\u00020)0#j\b\u0012\u0004\u0012\u00020)`%H\u0002J\u0018\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+0#j\b\u0012\u0004\u0012\u00020+`%H\u0002J\u0018\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0#j\b\u0012\u0004\u0012\u00020-`%H\u0002J\u0018\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00150#j\b\u0012\u0004\u0012\u00020\u0015`%H\u0002J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0018\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0002J\u0018\u00104\u001a\n 6*\u0004\u0018\u000105052\u0006\u00107\u001a\u00020\rH\u0002J\b\u00108\u001a\u00020\u0018H\u0002J\b\u00109\u001a\u00020\u0018H\u0002J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\rH\u0002J\b\u0010<\u001a\u00020\rH\u0002J\"\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0012\u0010B\u001a\u00020\u00182\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u0010\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u0018H\u0002J\u0010\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010P\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J \u0010Q\u001a\u00020\u00182\u0016\u0010R\u001a\u0012\u0012\u0004\u0012\u00020N0#j\b\u0012\u0004\u0012\u00020N`%H\u0002J\u0010\u0010S\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010T\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010U\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010V\u001a\u00020\u00182\u0006\u0010W\u001a\u00020XH\u0002J\u0018\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020\u0018H\u0002J \u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020[2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0015H\u0002J\b\u0010c\u001a\u00020\u0018H\u0002J\b\u0010d\u001a\u00020\u0018H\u0002J\b\u0010e\u001a\u00020\u0018H\u0002J \u0010f\u001a\u00020\u00182\u0006\u0010g\u001a\u00020[2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0015H\u0002J\b\u0010h\u001a\u00020\u0018H\u0002J\u001a\u0010i\u001a\u00020\u00182\u0006\u0010j\u001a\u00020k2\b\b\u0002\u0010a\u001a\u00020\u0004H\u0002J\b\u0010l\u001a\u00020\u0018H\u0002J\b\u0010m\u001a\u00020\u0018H\u0002J\b\u0010n\u001a\u00020\u0018H\u0002J\u001c\u0010o\u001a\u00020\u00182\u0006\u0010p\u001a\u00020[2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010rH\u0002J \u0010s\u001a\u00020\u00182\u0006\u0010t\u001a\u00020[2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0015H\u0002J\b\u0010u\u001a\u00020\u0018H\u0002J\b\u0010v\u001a\u00020\u0018H\u0002J\b\u0010w\u001a\u00020\u0018H\u0002J\b\u0010x\u001a\u00020\u0018H\u0002J\b\u0010y\u001a\u00020\u0018H\u0002J \u0010z\u001a\u00020\u00182\u0006\u0010{\u001a\u00020[2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0015H\u0002J\b\u0010|\u001a\u00020\u0018H\u0002J\b\u0010}\u001a\u00020\u0018H\u0002J\b\u0010~\u001a\u00020\u0018H\u0002J\u0010\u0010\u007f\u001a\u00020\u00182\u0006\u0010`\u001a\u00020[H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u00182\u0006\u0010g\u001a\u00020[H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00182\u0007\u0010\u0082\u0001\u001a\u00020[H\u0002J\u0011\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010t\u001a\u00020[H\u0002J\u0011\u0010\u0084\u0001\u001a\u00020\u00182\u0006\u0010{\u001a\u00020[H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0018H\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0018H\u0002J\t\u0010\u0087\u0001\u001a\u00020\u0018H\u0002J\u001f\u0010\u0088\u0001\u001a\u00020\u00182\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0012H\u0002J\t\u0010\u008b\u0001\u001a\u00020\u0018H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0018H\u0002J\t\u0010\u008d\u0001\u001a\u00020\u0018H\u0002J\u0012\u0010\u008e\u0001\u001a\u00020\u00182\u0007\u0010\u008f\u0001\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/simplemobiletools/contacts/pro/activities/EditContactActivity;", "Lcom/simplemobiletools/contacts/pro/activities/ContactActivity;", "()V", "CHOOSE_PHOTO", "", "INTENT_CHOOSE_PHOTO", "INTENT_CROP_PHOTO", "INTENT_TAKE_PHOTO", "REMOVE_PHOTO", "TAKE_PHOTO", "emailViewToColor", "Landroid/widget/EditText;", "highlightLastEmail", "", "highlightLastPhoneNumber", "isSaving", "isThirdPartyIntent", "lastPhotoIntentUri", "Landroid/net/Uri;", "numberViewToColor", "originalContactSource", "", "wasActivityInitialized", "addNewAddressField", "", "addNewEmailField", "addNewEventField", "addNewIMField", "addNewPhoneNumberField", "addNewWebsiteField", "getAddressTypeId", "value", "getEmailTypeId", "getEventTypeId", "getFilledAddresses", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/contacts/pro/models/Address;", "Lkotlin/collections/ArrayList;", "getFilledEmails", "Lcom/simplemobiletools/contacts/pro/models/Email;", "getFilledEvents", "Lcom/simplemobiletools/contacts/pro/models/Event;", "getFilledIMs", "Lcom/simplemobiletools/contacts/pro/models/IM;", "getFilledPhoneNumbers", "Lcom/simplemobiletools/contacts/pro/models/PhoneNumber;", "getFilledWebsites", "getIMTypeId", "getPhoneNumberTypeId", "getPhotoUpdateStatus", "oldUri", "newUri", "getStarDrawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "on", "gotContact", "initContact", "insertNewContact", "deleteCurrentContact", "isContactStarred", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openWith", "parseAddress", "contentValues", "Landroid/content/ContentValues;", "parseEmail", "parseEvent", "parseIntentData", "data", "parseNote", "parseOrganization", "parseWebsite", "removeGroup", "id", "", "resetContactEvent", "contactEvent", "Landroid/widget/TextView;", "removeContactEventButton", "Landroid/widget/ImageView;", "saveContact", "setupAddressTypePicker", "addressTypeField", "type", "label", "setupAddresses", "setupContactSource", "setupEditContact", "setupEmailTypePicker", "emailTypeField", "setupEmails", "setupEventTypePicker", "eventHolder", "Landroid/view/ViewGroup;", "setupEvents", "setupFieldVisibility", "setupGroups", "setupGroupsPicker", "groupTitleField", "group", "Lcom/simplemobiletools/contacts/pro/models/Group;", "setupIMTypePicker", "imTypeField", "setupIMs", "setupNames", "setupNewContact", "setupNotes", "setupOrganization", "setupPhoneNumberTypePicker", "numberTypeField", "setupPhoneNumbers", "setupTypePickers", "setupWebsites", "showAddressTypePicker", "showEmailTypePicker", "showEventTypePicker", "eventTypeField", "showIMTypePicker", "showNumberTypePicker", "showSelectContactSourceDialog", "showSelectGroupsDialog", "startChoosePhotoIntent", "startCropPhotoIntent", "primaryUri", "backupUri", "startTakePhotoIntent", "toggleFavorite", "trySetPhoto", "updateContact", "photoUpdateStatus", "contacts_debug"})
public final class EditContactActivity extends com.simplemobiletools.contacts.pro.activities.ContactActivity {
    private final int INTENT_TAKE_PHOTO = 1;
    private final int INTENT_CHOOSE_PHOTO = 2;
    private final int INTENT_CROP_PHOTO = 3;
    private final int TAKE_PHOTO = 1;
    private final int CHOOSE_PHOTO = 2;
    private final int REMOVE_PHOTO = 3;
    private boolean wasActivityInitialized;
    private android.net.Uri lastPhotoIntentUri;
    private boolean isSaving;
    private boolean isThirdPartyIntent;
    private boolean highlightLastPhoneNumber;
    private boolean highlightLastEmail;
    private android.widget.EditText numberViewToColor;
    private android.widget.EditText emailViewToColor;
    private java.lang.String originalContactSource;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void initContact() {
    }
    
    private final void gotContact() {
    }
    
    private final void openWith() {
    }
    
    private final void startCropPhotoIntent(android.net.Uri primaryUri, android.net.Uri backupUri) {
    }
    
    private final void setupFieldVisibility() {
    }
    
    private final void setupEditContact() {
    }
    
    private final void setupNames() {
    }
    
    private final void setupPhoneNumbers() {
    }
    
    private final void setupEmails() {
    }
    
    private final void setupAddresses() {
    }
    
    private final void setupIMs() {
    }
    
    private final void setupNotes() {
    }
    
    private final void setupOrganization() {
    }
    
    private final void setupWebsites() {
    }
    
    private final void setupEvents() {
    }
    
    private final void setupGroups() {
    }
    
    private final void setupContactSource() {
    }
    
    private final void setupNewContact() {
    }
    
    private final void setupTypePickers() {
    }
    
    private final void setupPhoneNumberTypePicker(android.widget.TextView numberTypeField, int type, java.lang.String label) {
    }
    
    private final void setupEmailTypePicker(android.widget.TextView emailTypeField, int type, java.lang.String label) {
    }
    
    private final void setupAddressTypePicker(android.widget.TextView addressTypeField, int type, java.lang.String label) {
    }
    
    private final void setupIMTypePicker(android.widget.TextView imTypeField, int type, java.lang.String label) {
    }
    
    private final void setupEventTypePicker(android.view.ViewGroup eventHolder, int type) {
    }
    
    private final void setupGroupsPicker(android.widget.TextView groupTitleField, com.simplemobiletools.contacts.pro.models.Group group) {
    }
    
    private final void resetContactEvent(android.widget.TextView contactEvent, android.widget.ImageView removeContactEventButton) {
    }
    
    private final void removeGroup(long id) {
    }
    
    private final void showNumberTypePicker(android.widget.TextView numberTypeField) {
    }
    
    private final void showEmailTypePicker(android.widget.TextView emailTypeField) {
    }
    
    private final void showAddressTypePicker(android.widget.TextView addressTypeField) {
    }
    
    private final void showIMTypePicker(android.widget.TextView imTypeField) {
    }
    
    private final void showEventTypePicker(android.widget.TextView eventTypeField) {
    }
    
    private final void showSelectGroupsDialog() {
    }
    
    private final void showSelectContactSourceDialog() {
    }
    
    private final void saveContact() {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.PhoneNumber> getFilledPhoneNumbers() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Email> getFilledEmails() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Address> getFilledAddresses() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.IM> getFilledIMs() {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.contacts.pro.models.Event> getFilledEvents() {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.String> getFilledWebsites() {
        return null;
    }
    
    private final void insertNewContact(boolean deleteCurrentContact) {
    }
    
    private final void updateContact(int photoUpdateStatus) {
    }
    
    private final int getPhotoUpdateStatus(java.lang.String oldUri, java.lang.String newUri) {
        return 0;
    }
    
    private final void addNewPhoneNumberField() {
    }
    
    private final void addNewEmailField() {
    }
    
    private final void addNewAddressField() {
    }
    
    private final void addNewIMField() {
    }
    
    private final void addNewEventField() {
    }
    
    private final void toggleFavorite() {
    }
    
    private final void addNewWebsiteField() {
    }
    
    private final boolean isContactStarred() {
        return false;
    }
    
    private final android.graphics.drawable.Drawable getStarDrawable(boolean on) {
        return null;
    }
    
    private final void trySetPhoto() {
    }
    
    private final void parseIntentData(java.util.ArrayList<android.content.ContentValues> data) {
    }
    
    private final void parseEmail(android.content.ContentValues contentValues) {
    }
    
    private final void parseAddress(android.content.ContentValues contentValues) {
    }
    
    private final void parseOrganization(android.content.ContentValues contentValues) {
    }
    
    private final void parseEvent(android.content.ContentValues contentValues) {
    }
    
    private final void parseWebsite(android.content.ContentValues contentValues) {
    }
    
    private final void parseNote(android.content.ContentValues contentValues) {
    }
    
    private final void startTakePhotoIntent() {
    }
    
    private final void startChoosePhotoIntent() {
    }
    
    private final int getPhoneNumberTypeId(java.lang.String value) {
        return 0;
    }
    
    private final int getEmailTypeId(java.lang.String value) {
        return 0;
    }
    
    private final int getEventTypeId(java.lang.String value) {
        return 0;
    }
    
    private final int getAddressTypeId(java.lang.String value) {
        return 0;
    }
    
    private final int getIMTypeId(java.lang.String value) {
        return 0;
    }
    
    public EditContactActivity() {
        super();
    }
}