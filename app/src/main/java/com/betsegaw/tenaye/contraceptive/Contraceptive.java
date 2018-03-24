package com.betsegaw.tenaye.contraceptive;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betsegaw.tenaye.R;
import com.betsegaw.tenaye.data.ContraListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by betsegaw on 3/12/18.
 */

public class Contraceptive extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    TabLayout contraceptiveTabLayout;
    ViewPager contraceptiveViewPager;
    ContraceptiveViewPagerAdapter contraceptiveViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contraceptive_main);
        init();
    }

    private void init() {

        contraceptiveTabLayout = findViewById(R.id.contraceptive_tab_layout);
        contraceptiveTabLayout.addTab(contraceptiveTabLayout.newTab().setText("Contraceptive Content"));
        contraceptiveTabLayout.addTab(contraceptiveTabLayout.newTab().setText("Contraceptive Quiz"));
        contraceptiveTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        contraceptiveViewPager = findViewById(R.id.contraceptive_pager);
        contraceptiveViewPagerAdapter = new ContraceptiveViewPagerAdapter(getSupportFragmentManager(),contraceptiveTabLayout.getTabCount());
        contraceptiveViewPager.setAdapter(contraceptiveViewPagerAdapter);
        contraceptiveViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(contraceptiveTabLayout));
        contraceptiveTabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
          contraceptiveViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
