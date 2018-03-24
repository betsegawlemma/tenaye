package com.betsegaw.tenaye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betsegaw.tenaye.data.ContraListAdapter;
import com.betsegaw.tenaye.data.PregListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by betsegaw on 3/12/18.
 */

public class Pregnancy extends AppCompatActivity {
    RecyclerView pregRecyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> pregTopics;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        pregTopics = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.pregnancy_array)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregnancy_list);
        pregRecyclerView = findViewById(R.id.pregnancyrv);
        pregRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PregListAdapter(this, pregTopics);
        pregRecyclerView.setAdapter(adapter);
    }
}
