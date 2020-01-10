package com.simplemobiletools.contacts.pro.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004RD\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010%\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001eR$\u0010(\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR$\u0010+\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR$\u0010.\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR$\u00101\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R$\u00104\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001e\u00a8\u00068"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/Config;", "Lcom/simplemobiletools/commons/helpers/BaseConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ignoreContactSources", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "ignoredContactSources", "getIgnoredContactSources", "()Ljava/util/HashSet;", "setIgnoredContactSources", "(Ljava/util/HashSet;)V", "lastUsedContactSource", "getLastUsedContactSource", "()Ljava/lang/String;", "setLastUsedContactSource", "(Ljava/lang/String;)V", "onContactClick", "", "getOnContactClick", "()I", "setOnContactClick", "(I)V", "showCallConfirmation", "", "getShowCallConfirmation", "()Z", "setShowCallConfirmation", "(Z)V", "showContactFields", "getShowContactFields", "setShowContactFields", "showContactThumbnails", "getShowContactThumbnails", "setShowContactThumbnails", "showDialpadButton", "getShowDialpadButton", "setShowDialpadButton", "showDialpadLetters", "getShowDialpadLetters", "setShowDialpadLetters", "showOnlyContactsWithNumbers", "getShowOnlyContactsWithNumbers", "setShowOnlyContactsWithNumbers", "showPhoneNumbers", "getShowPhoneNumbers", "setShowPhoneNumbers", "showTabs", "getShowTabs", "setShowTabs", "startNameWithSurname", "getStartNameWithSurname", "setStartNameWithSurname", "Companion", "contacts_debug"})
public final class Config extends com.simplemobiletools.commons.helpers.BaseConfig {
    public static final com.simplemobiletools.contacts.pro.helpers.Config.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<java.lang.String> getIgnoredContactSources() {
        return null;
    }
    
    public final void setIgnoredContactSources(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> ignoreContactSources) {
    }
    
    public final boolean getShowContactThumbnails() {
        return false;
    }
    
    public final void setShowContactThumbnails(boolean showContactThumbnails) {
    }
    
    public final boolean getShowPhoneNumbers() {
        return false;
    }
    
    public final void setShowPhoneNumbers(boolean showPhoneNumbers) {
    }
    
    public final boolean getShowOnlyContactsWithNumbers() {
        return false;
    }
    
    public final void setShowOnlyContactsWithNumbers(boolean showOnlyContactsWithNumbers) {
    }
    
    public final boolean getStartNameWithSurname() {
        return false;
    }
    
    public final void setStartNameWithSurname(boolean startNameWithSurname) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUsedContactSource() {
        return null;
    }
    
    public final void setLastUsedContactSource(@org.jetbrains.annotations.NotNull()
    java.lang.String lastUsedContactSource) {
    }
    
    public final int getOnContactClick() {
        return 0;
    }
    
    public final void setOnContactClick(int onContactClick) {
    }
    
    public final int getShowContactFields() {
        return 0;
    }
    
    public final void setShowContactFields(int showContactFields) {
    }
    
    public final int getShowTabs() {
        return 0;
    }
    
    public final void setShowTabs(int showTabs) {
    }
    
    public final boolean getShowCallConfirmation() {
        return false;
    }
    
    public final void setShowCallConfirmation(boolean showCallConfirmation) {
    }
    
    public final boolean getShowDialpadButton() {
        return false;
    }
    
    public final void setShowDialpadButton(boolean showDialpadButton) {
    }
    
    public final boolean getShowDialpadLetters() {
        return false;
    }
    
    public final void setShowDialpadLetters(boolean showDialpadLetters) {
    }
    
    public Config(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/simplemobiletools/contacts/pro/helpers/Config$Companion;", "", "()V", "newInstance", "Lcom/simplemobiletools/contacts/pro/helpers/Config;", "context", "Landroid/content/Context;", "contacts_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.contacts.pro.helpers.Config newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}