package com.example.edwin.labo8;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Thread extends AsyncTask {

    private List<Movie> movies;
    private RecyclerView rv;
    private MoviesAdapter adapter;
    private Appdatabase db;

    public Thread() {
    }
    public Thread(List<Movie> movies,RecyclerView rv, MoviesAdapter adapter, Appdatabase db){
        this.movies = movies;
        this.rv = rv;
        this.adapter = adapter;
        this.db = db;
    }


    @Override
    protected Object doInBackground(Object[] objects) {
        addMovie(movies);
        adapter = new MoviesAdapter(movies);
        rv.setAdapter(adapter);
        return null;
    }
    public void addMovie(List<Movie> movies){
        movies.add(new Movie("Valerian","Sci-fi","Madhouse"));
        movies.add(new Movie("Mama mia","Drama","IDF"));
    }
}
