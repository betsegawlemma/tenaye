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

public class MentalListAdapter extends RecyclerView.Adapter<MentalListAdapter.MentalViewHolder> {
    private ArrayList<String> mentalTopics;
    private LayoutInflater mInflater;

    public MentalListAdapter(Context context, ArrayList<String> mentalTopics) {
        this.mentalTopics = mentalTopics;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MentalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.mental_item, parent, false);
        return new MentalViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MentalViewHolder holder, int position) {
        String mCurrent = mentalTopics.get(position);
        holder.mentalItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mentalTopics.size();
    }

    public class MentalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView mentalItemView;
        final MentalListAdapter mAdapter;

        public MentalViewHolder(View mentalView, MentalListAdapter mAdapter) {
            super(mentalView);
            this.mentalItemView = mentalView.findViewById(R.id.mental_topic);
            this.mAdapter = mAdapter;
        }

        @Override
        public void onClick(View v) {

        }
    }
}
