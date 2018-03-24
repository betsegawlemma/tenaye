package com.betsegaw.tenaye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betsegaw.tenaye.data.ContraListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by betsegaw on 3/12/18.
 */

public class Contraceptive extends AppCompatActivity {
    RecyclerView contraRecyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> contraTopics;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        contraTopics = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.contraceptive_array)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contraceptive_list);
        contraRecyclerView = findViewById(R.id.contrarv);
        contraRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ContraListAdapter(this,contraTopics);
        contraRecyclerView.setAdapter(adapter);
    }
}
