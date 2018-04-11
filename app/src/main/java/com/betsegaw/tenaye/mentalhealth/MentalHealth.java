package com.betsegaw.tenaye.mentalhealth;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.betsegaw.tenaye.MainActivity;
import com.betsegaw.tenaye.R;
import com.betsegaw.tenaye.contraceptive.Contraceptive;
import com.betsegaw.tenaye.hivandotherstis.HivAndSTIs;
import com.betsegaw.tenaye.upregnancy.UnintendedPregnancy;

import java.util.Locale;

/**
 * Created by betsegaw on 4/1/18.
 */

public class MentalHealth extends AppCompatActivity implements TabLayout.OnTabSelectedListener,View.OnClickListener {

    private DrawerLayout mDrawerLayout;

    TabLayout mentalHealthTabLayout;
    ViewPager mentalHealthViewPager;
    MentalHealthViewPagerAdapter mentalHealthViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mentalhealth_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setTitle("");


        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        switch(menuItem.getItemId()){
                            case R.id.nav_home:
                                startActivity(new Intent(MentalHealth.this, MainActivity.class));
                                return true;
                            case R.id.nav_contraceptive:
                                startActivity(new Intent(MentalHealth.this, Contraceptive.class));
                                return true;
                            case R.id.nav_hiv:
                                startActivity(new Intent(MentalHealth.this, HivAndSTIs.class));
                                return true;
                            case R.id.nav_upregnancy:
                                startActivity(new Intent(MentalHealth.this, UnintendedPregnancy.class));
                                return true;
                            case R.id.nav_mhealth:
                                return true;
                            case R.id.nav_amharic:
                                setLocaleLanguage("am");
                                return true;
                            case R.id.nav_english:
                                setLocaleLanguage("gb");
                                return true;
                            default:
                                return true;

                        }

                    }
                });
        init();
    }

    private void init() {

        mentalHealthTabLayout = findViewById(R.id.mh_tab_layout);
        mentalHealthTabLayout.addTab(mentalHealthTabLayout.newTab().setText(R.string.description));
        mentalHealthTabLayout.addTab(mentalHealthTabLayout.newTab().setText(R.string.quiz));
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setLocaleLanguage(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
        Intent intent = new Intent(this, this.getClass());
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
