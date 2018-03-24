package com.betsegaw.tenaye;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* final ImageButton contraImgBtn = findViewById(R.id.contra);
        final ImageButton pregImgBtn = findViewById(R.id.preg);
        final ImageButton hivImgBtn = findViewById(R.id.hiv);
        final ImageButton mentalImgBtn = findViewById(R.id.mental);

        contraImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Contraceptive.class));
            }
        });
        pregImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pregnancy.class));
            }
        });
        hivImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Hiv.class));
            }
        });
        mentalImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MentalHealth.class));
            }
        });
   */
    }

}
