package com.betsegaw.tenaye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betsegaw.tenaye.data.ContraListAdapter;
import com.betsegaw.tenaye.data.MentalListAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by betsegaw on 3/12/18.
 */

public class MentalHealth extends AppCompatActivity {
    RecyclerView mentalRecyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> mentalTopics;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        mentalTopics = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.mental_array)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mental_list);
        mentalRecyclerView = findViewById(R.id.mentalrv);
        mentalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MentalListAdapter(this, mentalTopics);
        mentalRecyclerView.setAdapter(adapter);
    }
}
