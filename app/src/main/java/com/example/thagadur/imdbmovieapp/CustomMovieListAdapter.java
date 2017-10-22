package com.example.thagadur.imdbmovieapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Thagadur on 10/17/2017.
 */


public class CustomMovieListAdapter extends RecyclerView.Adapter<CustomMovieListAdapter.CustomMovieListHolder> {

    Context context;

    public CustomMovieListAdapter(Context context) {
    this.context=context;
    }

    @Override
    public CustomMovieListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row_item,parent,false);
        CustomMovieListHolder myView=new CustomMovieListHolder(view);
        return myView;

    }

    @Override
    public void onBindViewHolder(CustomMovieListHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class CustomMovieListHolder extends RecyclerView.ViewHolder {
        public CustomMovieListHolder(View itemView) {
            super(itemView);
        }
    }
}
