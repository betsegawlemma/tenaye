package com.betsegaw.tenaye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(myToolbar);

      //  myToolbar.setLogo(R.drawable.tenayelogo);
      // myToolbar.setSubtitle("ToolBar");

        //database connection
       /* Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name.db")
                .addCallback(new RoomDatabase.Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                       *//* new Thread(()->{
                            db.insert(new Category(1,"HIV","HIV","HIV"));
                        }).start();*//*
                    }
                }).build();*/

        setContentView(R.layout.activity_main);
    }


}
