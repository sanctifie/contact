package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010X\u001a\u00020Y\u001a\u0016\u0010Z\u001a\u00020\u00012\u0006\u0010[\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020]\u001a\u001e\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020\u00012\u0006\u0010b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030U\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010W\u00a8\u0006c"}, d2 = {"ADD_NEW_CONTACT_NUMBER", "", "ALL_TABS_MASK", "", "CELL", "CONTACTS_TAB_MASK", "CONTACT_ID", "DEFAULT_ADDRESS_TYPE", "DEFAULT_EMAIL_TYPE", "DEFAULT_EVENT_TYPE", "DEFAULT_IM_TYPE", "DEFAULT_ORGANIZATION_TYPE", "DEFAULT_PHONE_NUMBER_TYPE", "DEFAULT_WEBSITE_TYPE", "FAVORITES_TAB_MASK", "FAX", "FIRST_CONTACT_ID", "FIRST_GROUP_ID", "", "GROUP", "GROUPS_TAB_MASK", "HANGOUTS", "HOME", "HOME_FAX", "IGNORED_CONTACT_SOURCES", "IS_FROM_SIMPLE_CONTACTS", "IS_PRIVATE", "JABBER", "KEY_EMAIL", "KEY_MAILTO", "KEY_NAME", "KEY_PHONE", "LAST_USED_CONTACT_SOURCE", "LOCATION_CONTACTS_TAB", "LOCATION_DIALPAD", "LOCATION_FAVORITES_TAB", "LOCATION_GROUP_CONTACTS", "LOCATION_INSERT_OR_EDIT", "MAIN", "MOBILE", "ON_CLICK_CALL_CONTACT", "ON_CLICK_EDIT_CONTACT", "ON_CLICK_VIEW_CONTACT", "ON_CONTACT_CLICK", "OTHER", "PAGER", "PHOTO_ADDED", "PHOTO_CHANGED", "PHOTO_REMOVED", "PHOTO_UNCHANGED", "PREF", "QQ", "REQUEST_CODE_SET_DEFAULT_DIALER", "SHOW_ADDRESSES_FIELD", "SHOW_CALL_CONFIRMATION", "SHOW_CONTACT_FIELDS", "SHOW_CONTACT_SOURCE_FIELD", "SHOW_CONTACT_THUMBNAILS", "SHOW_DIALPAD_BUTTON", "SHOW_DIALPAD_LETTERS", "SHOW_EMAILS_FIELD", "SHOW_EVENTS_FIELD", "SHOW_FIRST_NAME_FIELD", "SHOW_GROUPS_FIELD", "SHOW_IMS_FIELD", "SHOW_MIDDLE_NAME_FIELD", "SHOW_NICKNAME_FIELD", "SHOW_NOTES_FIELD", "SHOW_ONLY_CONTACTS_WITH_NUMBERS", "SHOW_ORGANIZATION_FIELD", "SHOW_PHONE_NUMBERS", "SHOW_PHONE_NUMBERS_FIELD", "SHOW_PREFIX_FIELD", "SHOW_SUFFIX_FIELD", "SHOW_SURNAME_FIELD", "SHOW_TABS", "SHOW_WEBSITES_FIELD", "SIGNAL_PACKAGE", "SMT_PRIVATE", "START_NAME_WITH_SURNAME", "TELEGRAM_PACKAGE", "WHATSAPP_PACKAGE", "WORK", "WORK_FAX", "tabsList", "Ljava/util/ArrayList;", "getTabsList", "()Ljava/util/ArrayList;", "getEmptyLocalContact", "Lcom/simplemobiletools/contacts/pro/models/LocalContact;", "getProperText", "text", "shouldNormalize", "", "highlightTextFromNumbers", "Landroid/text/SpannableString;", "name", "textToHighlight", "adjustedPrimaryColor", "contacts_debug"})
public final class ConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_CONTACT_THUMBNAILS = "show_contact_thumbnails";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_PHONE_NUMBERS = "show_phone_numbers";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_ONLY_CONTACTS_WITH_NUMBERS = "show_only_contacts_with_numbers";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IGNORED_CONTACT_SOURCES = "ignored_contact_sources_2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String START_NAME_WITH_SURNAME = "start_name_with_surname";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_USED_CONTACT_SOURCE = "last_used_contact_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ON_CONTACT_CLICK = "on_contact_click";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_CONTACT_FIELDS = "show_contact_fields";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_TABS = "show_tabs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_CALL_CONFIRMATION = "show_call_confirmation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_DIALPAD_BUTTON = "show_dialpad_button";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOW_DIALPAD_LETTERS = "show_dialpad_letters";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTACT_ID = "contact_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMT_PRIVATE = "smt_private";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_PRIVATE = "is_private";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP = "group";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_FROM_SIMPLE_CONTACTS = "is_from_simple_contacts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_NEW_CONTACT_NUMBER = "add_new_contact_number";
    public static final int FIRST_CONTACT_ID = 1000000;
    public static final long FIRST_GROUP_ID = 10000L;
    public static final int REQUEST_CODE_SET_DEFAULT_DIALER = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PHONE = "phone";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_MAILTO = "mailto";
    public static final int LOCATION_CONTACTS_TAB = 0;
    public static final int LOCATION_FAVORITES_TAB = 1;
    public static final int LOCATION_GROUP_CONTACTS = 2;
    public static final int LOCATION_DIALPAD = 3;
    public static final int LOCATION_INSERT_OR_EDIT = 4;
    public static final int CONTACTS_TAB_MASK = 1;
    public static final int FAVORITES_TAB_MASK = 2;
    public static final int GROUPS_TAB_MASK = 8;
    public static final int ALL_TABS_MASK = 11;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.ArrayList<java.lang.Integer> tabsList = null;
    public static final int PHOTO_ADDED = 1;
    public static final int PHOTO_REMOVED = 2;
    public static final int PHOTO_CHANGED = 3;
    public static final int PHOTO_UNCHANGED = 4;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CELL = "CELL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK = "WORK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME = "HOME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OTHER = "OTHER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF = "PREF";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAIN = "MAIN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAX = "FAX";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_FAX = "WORK;FAX";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME_FAX = "HOME;FAX";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGER = "PAGER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOBILE = "MOBILE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HANGOUTS = "Hangouts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QQ = "QQ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JABBER = "Jabber";
    public static final int ON_CLICK_CALL_CONTACT = 1;
    public static final int ON_CLICK_VIEW_CONTACT = 2;
    public static final int ON_CLICK_EDIT_CONTACT = 3;
    public static final int SHOW_PREFIX_FIELD = 1;
    public static final int SHOW_FIRST_NAME_FIELD = 2;
    public static final int SHOW_MIDDLE_NAME_FIELD = 4;
    public static final int SHOW_SURNAME_FIELD = 8;
    public static final int SHOW_SUFFIX_FIELD = 16;
    public static final int SHOW_PHONE_NUMBERS_FIELD = 32;
    public static final int SHOW_EMAILS_FIELD = 64;
    public static final int SHOW_ADDRESSES_FIELD = 128;
    public static final int SHOW_EVENTS_FIELD = 256;
    public static final int SHOW_NOTES_FIELD = 512;
    public static final int SHOW_ORGANIZATION_FIELD = 1024;
    public static final int SHOW_GROUPS_FIELD = 2048;
    public static final int SHOW_CONTACT_SOURCE_FIELD = 4096;
    public static final int SHOW_WEBSITES_FIELD = 8192;
    public static final int SHOW_NICKNAME_FIELD = 16384;
    public static final int SHOW_IMS_FIELD = 32768;
    public static final int DEFAULT_EMAIL_TYPE = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_HOME;
    public static final int DEFAULT_PHONE_NUMBER_TYPE = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE;
    public static final int DEFAULT_ADDRESS_TYPE = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.TYPE_HOME;
    public static final int DEFAULT_EVENT_TYPE = android.provider.ContactsContract.CommonDataKinds.Event.TYPE_BIRTHDAY;
    public static final int DEFAULT_ORGANIZATION_TYPE = android.provider.ContactsContract.CommonDataKinds.Organization.TYPE_WORK;
    public static final int DEFAULT_WEBSITE_TYPE = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_HOMEPAGE;
    public static final int DEFAULT_IM_TYPE = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_SKYPE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TELEGRAM_PACKAGE = "org.telegram.messenger";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGNAL_PACKAGE = "org.thoughtcrime.securesms";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WHATSAPP_PACKAGE = "com.whatsapp";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<java.lang.Integer> getTabsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.simplemobiletools.contacts.pro.models.LocalContact getEmptyLocalContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getProperText(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean shouldNormalize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.text.SpannableString highlightTextFromNumbers(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String textToHighlight, int adjustedPrimaryColor) {
        return null;
    }
}