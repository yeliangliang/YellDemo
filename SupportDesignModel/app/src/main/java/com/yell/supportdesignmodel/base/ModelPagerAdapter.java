package com.yell.supportdesignmodel.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class ModelPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private String[] titles;
    public ModelPagerAdapter(FragmentManager fm, List<Fragment> fragmentList,String[] titles) {
        super(fm);
        this.fragments = fragmentList;
        this.titles =titles;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}