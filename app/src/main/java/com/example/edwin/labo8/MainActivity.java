package com.example.edwin.labo8;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv=findViewById(R.id.rv);
        MoviesAdapter adapter = new MoviesAdapter(movies);
        rv.setLayoutManager(new LinearLayoutManager(this));

        Appdatabase db=Appdatabase.getAppDatabase(getApplicationContext());
        movies=db.movieDAO().getAll();

        new Thread(movies,rv,adapter,db).execute();
        FloatingActionButton fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CreateMovie.class));
            }
        });

    }
}
