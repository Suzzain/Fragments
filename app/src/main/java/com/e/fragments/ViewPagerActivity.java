package com.e.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ViewPagerAdapter;
import fragments.CelsiusFragment;
import fragments.FarenheitFragment;
import fragments.FirstFragment;
import fragments.SIFragment;
import fragments.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        viewPager= findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FirstFragment(),"Sum");
        adapter.addFragment(new SecondFragment(),"Area of Circle");
        adapter.addFragment(new SIFragment(),"Simple Interest");
        adapter.addFragment(new CelsiusFragment(),"F to C");
        adapter.addFragment(new FarenheitFragment(),"C to F");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}