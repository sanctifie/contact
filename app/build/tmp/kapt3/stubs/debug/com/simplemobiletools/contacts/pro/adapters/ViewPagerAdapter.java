package com.simplemobiletools.contacts.pro.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/simplemobiletools/contacts/pro/adapters/ViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "activity", "Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "currTabsList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "showTabs", "(Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;Ljava/util/ArrayList;I)V", "getActivity", "()Lcom/simplemobiletools/contacts/pro/activities/SimpleActivity;", "getCurrTabsList", "()Ljava/util/ArrayList;", "getShowTabs", "()I", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "item", "", "getCount", "getFragment", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "contacts_debug"})
public final class ViewPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.contacts.pro.activities.SimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Integer> currTabsList = null;
    private final int showTabs = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
        return false;
    }
    
    private final int getFragment(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.contacts.pro.activities.SimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getCurrTabsList() {
        return null;
    }
    
    public final int getShowTabs() {
        return 0;
    }
    
    public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.contacts.pro.activities.SimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> currTabsList, int showTabs) {
        super();
    }
}