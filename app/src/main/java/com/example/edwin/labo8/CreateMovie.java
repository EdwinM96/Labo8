package com.example.edwin.labo8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class CreateMovie extends AppCompatActivity {
    EditText name,studio,category;
    Button btn;
    List<Movie> movies;
    String sname,sstudio,scat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_movie);

        btn=findViewById(R.id.button_submit);
        name=findViewById(R.id.editTxt_name);
        studio=findViewById(R.id.editTxt_studio);
        category=findViewById(R.id.editTxt_category);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname=name.getText().toString();
                sstudio=studio.getText().toString();
                scat=category.getText().toString();
                Appdatabase db= Appdatabase.getAppDatabase(getApplicationContext());
                db.movieDAO().insertMovie(new Movie(sname,sstudio,scat));
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
