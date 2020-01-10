package com.simplemobiletools.contacts.pro.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/simplemobiletools/contacts/pro/interfaces/RefreshContactsListener;", "", "contactClicked", "", "contact", "Lcom/simplemobiletools/contacts/pro/models/Contact;", "refreshContacts", "refreshTabsMask", "", "contacts_debug"})
public abstract interface RefreshContactsListener {
    
    public abstract void refreshContacts(int refreshTabsMask);
    
    public abstract void contactClicked(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.models.Contact contact);
}