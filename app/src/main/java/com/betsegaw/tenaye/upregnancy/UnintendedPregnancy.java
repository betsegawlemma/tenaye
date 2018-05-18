package com.betsegaw.tenaye.upregnancy;

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
import com.betsegaw.tenaye.mentalhealth.MentalHealth;

import java.util.Locale;

public class UnintendedPregnancy extends AppCompatActivity implements TabLayout.OnTabSelectedListener,View.OnClickListener {

    private DrawerLayout mDrawerLayout;

    TabLayout upregnancyTabLayout;
    ViewPager upregnancyViewPager;
    UnintededPregnancyViewPagerAdapter unintededPregnancyViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upregnancy_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setTitle("");


        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
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
                                startActivity(new Intent(UnintendedPregnancy.this, MainActivity.class));
                                return true;
                            case R.id.nav_contraceptive:
                                startActivity(new Intent(UnintendedPregnancy.this, Contraceptive.class));
                                return true;
                            case R.id.nav_hiv:
                                startActivity(new Intent(UnintendedPregnancy.this, HivAndSTIs.class));
                                return true;
                            case R.id.nav_upregnancy:
                                return true;
                            case R.id.nav_mhealth:
                                startActivity(new Intent(UnintendedPregnancy.this, MentalHealth.class));
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

        upregnancyTabLayout = findViewById(R.id.upregnancy_tab_layout);
        upregnancyTabLayout.addTab(upregnancyTabLayout.newTab().setText(R.string.description));
        upregnancyTabLayout.addTab(upregnancyTabLayout.newTab().setText(R.string.quiz));
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
