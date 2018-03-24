package com.betsegaw.tenaye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.betsegaw.tenaye.contraceptive.Contraceptive;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CardView contraceptiveCardView = findViewById(R.id.contraceptive);
        final CardView hivCardView = findViewById(R.id.hiv);
        final CardView pregnancyCardView = findViewById(R.id.pregnancy);
        final CardView mentalCardView = findViewById(R.id.mental);


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
                startActivity(new Intent(MainActivity.this, Pregnancy.class));
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
