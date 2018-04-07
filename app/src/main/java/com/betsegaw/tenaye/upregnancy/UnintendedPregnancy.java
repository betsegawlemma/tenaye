package com.betsegaw.tenaye.upregnancy;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.betsegaw.tenaye.R;

public class UnintendedPregnancy extends AppCompatActivity implements TabLayout.OnTabSelectedListener,View.OnClickListener {

    TabLayout upregnancyTabLayout;
    ViewPager upregnancyViewPager;
    UnintededPregnancyViewPagerAdapter unintededPregnancyViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upregnancy_main);
        init();
    }

    private void init() {

        upregnancyTabLayout = findViewById(R.id.upregnancy_tab_layout);
        upregnancyTabLayout.addTab(upregnancyTabLayout.newTab().setText("Content"));
        upregnancyTabLayout.addTab(upregnancyTabLayout.newTab().setText("Quiz"));
        upregnancyTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        upregnancyViewPager = findViewById(R.id.upregnancy_pager);
        unintededPregnancyViewPagerAdapter = new UnintededPregnancyViewPagerAdapter(getSupportFragmentManager(), upregnancyTabLayout.getTabCount());
        upregnancyViewPager.setAdapter(unintededPregnancyViewPagerAdapter);
        upregnancyViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(upregnancyTabLayout));
        upregnancyTabLayout.addOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        upregnancyViewPager.setCurrentItem(tab.getPosition());
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
