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

public class PregListAdapter extends RecyclerView.Adapter<PregListAdapter.PregViewHolder> {
    private ArrayList<String> pregTopics;
    private LayoutInflater mInflater;

    public PregListAdapter(Context context, ArrayList<String> pregTopics) {
        this.pregTopics = pregTopics;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public PregViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.pregnancy_item, parent, false);
        return new PregViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(PregViewHolder holder, int position) {
        String mCurrent = pregTopics.get(position);
        holder.pregItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return pregTopics.size();
    }

    public class PregViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView pregItemView;
        final PregListAdapter mAdapter;

        public PregViewHolder(View pregView, PregListAdapter mAdapter) {
            super(pregView);
            this.pregItemView = pregView.findViewById(R.id.pregnancy_topic);
            this.mAdapter = mAdapter;
        }

        @Override
        public void onClick(View v) {

        }
    }
}
