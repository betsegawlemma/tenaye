package com.betsegaw.tenaye.mentalhealth;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 4/1/18.
 */

public class MentalHealth extends AppCompatActivity implements TabLayout.OnTabSelectedListener,View.OnClickListener {

    TabLayout mentalHealthTabLayout;
    ViewPager mentalHealthViewPager;
    MentalHealthViewPagerAdapter mentalHealthViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mentalhealth_main);
        init();
    }

    private void init() {

        mentalHealthTabLayout = findViewById(R.id.mh_tab_layout);
        mentalHealthTabLayout.addTab(mentalHealthTabLayout.newTab().setText("Content"));
        mentalHealthTabLayout.addTab(mentalHealthTabLayout.newTab().setText("Quiz"));
        mentalHealthTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        mentalHealthViewPager = findViewById(R.id.mh_pager);
        mentalHealthViewPagerAdapter = new MentalHealthViewPagerAdapter(getSupportFragmentManager(), mentalHealthTabLayout.getTabCount());
        mentalHealthViewPager.setAdapter(mentalHealthViewPagerAdapter);
        mentalHealthViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mentalHealthTabLayout));
        mentalHealthTabLayout.addOnTabSelectedListener(this);

    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
            mentalHealthViewPager.setCurrentItem(tab.getPosition());
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
