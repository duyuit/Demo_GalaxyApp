package com.example.billy.galaxy_app;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.PagerAdapter;
import Adapter.Pager_Adapter_Details;

public class Details_Shop extends AppCompatActivity {
    private ViewPager pager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__shop);
        addControl();
    }
    private void addControl() {
        pager = (ViewPager) findViewById(R.id.viewpagerDetails);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs_details);
        FragmentManager manager = getSupportFragmentManager();
        Pager_Adapter_Details adapter = new Pager_Adapter_Details(manager, getBaseContext());
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
}
