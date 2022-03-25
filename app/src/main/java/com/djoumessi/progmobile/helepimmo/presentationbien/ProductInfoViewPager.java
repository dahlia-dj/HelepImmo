package com.djoumessi.progmobile.helepimmo.presentationbien;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoViewPager extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private List<String> titles;
    public ProductInfoViewPager(@NonNull FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        titles = new ArrayList<>();
        titles.add("Description");
        titles.add("Photos");
        titles.add("Contact");
        fragments.add(new DescriptionFragment());
        fragments.add(new PhotosFragment());
        fragments.add(new ContactFragment());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
