package com.betsegaw.tenaye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.betsegaw.tenaye.contraceptive.Contraceptive;
import com.betsegaw.tenaye.hivandotherstis.HivAndOtherSTIs;
import com.betsegaw.tenaye.mentalhealth.MentalHealth;
import com.betsegaw.tenaye.upregnancy.UnintendedPregnancy;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    CardView contraceptiveCardView;
    CardView hivCardView;
    CardView pregnancyCardView;
    CardView mentalCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                startActivity(new Intent(MainActivity.this, HivAndOtherSTIs.class));
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

}
