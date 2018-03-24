package com.betsegaw.tenaye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betsegaw.tenaye.data.ContraListAdapter;
import com.betsegaw.tenaye.data.HivListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by betsegaw on 3/12/18.
 */

public class Hiv extends AppCompatActivity {
    RecyclerView hivRecyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> hivTopics;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        hivTopics = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.hiv_array)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiv_list);
        hivRecyclerView = findViewById(R.id.hivrv);
        hivRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HivListAdapter(this, hivTopics);
        hivRecyclerView.setAdapter(adapter);
    }
}
