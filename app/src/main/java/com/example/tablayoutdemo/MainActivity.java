package com.example.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    List<String> title = new ArrayList<>();
    List<Fragment> fragmentList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),title,fragmentList);
        viewPager.setAdapter(adapter);
        //为tablayout设viewpager
        tabLayout.setupWithViewPager(viewPager);
        //使用viewpager的适配器
        //tabLayout.setTabsFromPagerAdapter(adapter);


    }

    private void init() {
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        title.add("tab1");
        title.add("tab2");
        title.add("tab3");
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());

    }
}
