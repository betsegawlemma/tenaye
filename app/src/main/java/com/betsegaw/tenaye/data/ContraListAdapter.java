package com.betsegaw.tenaye.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

import java.util.ArrayList;

/**
 * Created by betsegaw on 3/12/18.
 */

public class ContraListAdapter extends RecyclerView.Adapter<ContraListAdapter.ContraViewHolder> {
    private ArrayList<String> contraTopics;
    private LayoutInflater mInflater;
    private static final String TAG = "ContraListAdapter";

    public ContraListAdapter(Context context, ArrayList<String> contraTopics) {
        this.contraTopics = contraTopics;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public ContraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.contra_item, parent, false);
        return new ContraViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(final ContraViewHolder holder, final int position) {
        String mCurrent = contraTopics.get(position);
        holder.contraItemView.setText(mCurrent);
        holder.contraItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,String.valueOf(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return contraTopics.size();
    }

    public class ContraViewHolder extends RecyclerView.ViewHolder {

        public final TextView contraItemView;
        final ContraListAdapter mAdapter;

        public ContraViewHolder(View contraView, ContraListAdapter mAdapter) {
            super(contraView);
            this.contraItemView = contraView.findViewById(R.id.contra_topic);
            this.mAdapter = mAdapter;
        }
    }
}
