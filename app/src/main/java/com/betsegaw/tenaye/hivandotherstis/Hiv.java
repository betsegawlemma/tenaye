package com.betsegaw.tenaye.hivandotherstis;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 4/1/18.
 */

public class Hiv extends AppCompatActivity implements TabLayout.OnTabSelectedListener,View.OnClickListener {

    TabLayout hivTabLayout;
    ViewPager hivViewPager;
    HivAndOtherSTIsViewPagerAdapter hivAndOtherSTIsViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiv_main);
        init();
    }

    private void init() {

        hivTabLayout = findViewById(R.id.hiv_tab_layout);
        hivTabLayout.addTab(hivTabLayout.newTab().setText("Content"));
        hivTabLayout.addTab(hivTabLayout.newTab().setText("Quiz"));
        hivTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        hivViewPager = findViewById(R.id.hiv_pager);
        hivAndOtherSTIsViewPagerAdapter = new HivAndOtherSTIsViewPagerAdapter(getSupportFragmentManager(),hivTabLayout.getTabCount());
        hivViewPager.setAdapter(hivAndOtherSTIsViewPagerAdapter);
        hivViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(hivTabLayout));
        hivTabLayout.addOnTabSelectedListener(this);

    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
            hivViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onClick(View v) {

    }
}
