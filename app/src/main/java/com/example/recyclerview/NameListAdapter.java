package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {
    private ArrayList<String> nameArrayList;
    private LayoutInflater layoutInflater;

    public NameListAdapter(Context context, ArrayList<String> nameArrayList) {
        this.nameArrayList = nameArrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NameListAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.namelist_item, parent, false);
        return new NameViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull NameListAdapter.NameViewHolder holder, int position) {
        //gan gia tri
        String mCurrent = nameArrayList.get(position);
        holder.nameItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return nameArrayList.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{
        TextView nameItemView;
        NameListAdapter nameListAdapter;
        public NameViewHolder(@NonNull View itemView, NameListAdapter adapter) {
            super(itemView);
            nameItemView = itemView.findViewById(R.id.tvName);
            this.nameListAdapter = adapter;
        }
    }
}
