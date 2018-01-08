package com.example.tablayoutdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8/008.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private List<String> title;
    private List<Fragment> fragmentList;


    public MyAdapter(FragmentManager fm, List<String> title, List<Fragment> fragmentList) {
        super(fm);
        this.title = title;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
