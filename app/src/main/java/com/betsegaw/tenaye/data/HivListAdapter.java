package com.betsegaw.tenaye.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

import java.util.ArrayList;

/**
 * Created by betsegaw on 3/12/18.
 */

public class HivListAdapter extends RecyclerView.Adapter<HivListAdapter.HivViewHolder> {
    private ArrayList<String> hivTopics;
    private LayoutInflater mInflater;

    public HivListAdapter(Context context, ArrayList<String> hivTopics) {
        this.hivTopics = hivTopics;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public HivViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.hiv_item, parent, false);
        return new HivViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(HivViewHolder holder, int position) {
        String mCurrent = hivTopics.get(position);
        holder.hivItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return hivTopics.size();
    }

    public class HivViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView hivItemView;
        final HivListAdapter mAdapter;

        public HivViewHolder(View hivView, HivListAdapter mAdapter) {
            super(hivView);
            this.hivItemView = hivView.findViewById(R.id.hiv_topic);
            this.mAdapter = mAdapter;
        }

        @Override
        public void onClick(View v) {

        }
    }
}
