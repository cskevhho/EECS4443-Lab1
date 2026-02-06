package com.example.eecs4443_lab2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.eecs4443_lab2.R;
import com.example.eecs4443_lab2.model.Cat;
import java.util.List;

// This is used to manage and bind data to views. It will be used to create view holders and bind item data to the views in the RecyclerView.


// Extending RecylerView like this is necessary because we need to write our own adapter to manage the data and views for our iteration of the lab. - Kevin 20260206
public class CatAdapter extends RecyclerView.Adapter<CatAdapter.ViewHolder> {
    private List<Cat> cats;

    public CatAdapter(List<Cat> cats) {
        this.cats = cats;
    }

    // need to override necessary methods for RecyclerView.Adapter below to bind data to views.
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            // init item view here
        }
    }

    // NOTE: @NonNull is used to force a non-null return value to prevent null pointer exceptions.

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // make the view holder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tile, parent, false);
        return new ViewHolder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // bind data to view
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }
}

