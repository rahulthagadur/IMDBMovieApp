package com.example.thagadur.imdbmovieapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView movieRecyclerView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation of Layout Items
        initialisatonOfID();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        movieRecyclerView.setLayoutManager(layoutManager);
        CustomMovieListAdapter customMovieListAdapter = new CustomMovieListAdapter(context);
        movieRecyclerView.setAdapter(customMovieListAdapter);
    }

    public void initialisatonOfID() {

        movieRecyclerView = (RecyclerView) findViewById(R.id.movie_recyler_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
