package com.betsegaw.tenaye;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.betsegaw.tenaye.contraceptive.Contraceptive;
import com.betsegaw.tenaye.hivandotherstis.Hiv;
import com.betsegaw.tenaye.mentalhealth.MentalHealth;
import com.betsegaw.tenaye.upregnancy.UnintendedPregnancy;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private DrawerLayout mDrawerLayout;

    CardView contraceptiveCardView;
    CardView hivCardView;
    CardView pregnancyCardView;
    CardView mentalCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);

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
                           case R.id.nav_contraceptive:
                               startActivity(new Intent(MainActivity.this, Contraceptive.class));
                               return true;
                           case R.id.nav_hiv:
                               startActivity(new Intent(MainActivity.this, Hiv.class));
                               return true;
                           case R.id.nav_upregnancy:
                               startActivity(new Intent(MainActivity.this, UnintendedPregnancy.class));
                               return true;
                           case R.id.nav_mhealth:
                               startActivity(new Intent(MainActivity.this, MentalHealth.class));
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

        contraceptiveCardView = findViewById(R.id.contraceptive_home_cv);
        hivCardView = findViewById(R.id.hiv_home_cv);
        pregnancyCardView = findViewById(R.id.pregnancy_home_cv);
        mentalCardView = findViewById(R.id.mental_home_cv);

        contraceptiveCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Contraceptive.class));
            }
        });

        hivCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Hiv.class));
            }
        });

        pregnancyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UnintendedPregnancy.class));
            }
        });

        mentalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MentalHealth.class));
            }
        });

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
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}
