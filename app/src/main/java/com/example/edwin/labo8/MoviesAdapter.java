package com.example.edwin.labo8;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    List<Movie> movies;
    public MoviesAdapter(List<Movie> movies) {
        this.movies=movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent,false);
        MovieViewHolder mvh = new MovieViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.nameTxt.setText(movies.get(position).getNomEstudio());
        holder.categoryTxt.setText(movies.get(position).getNomCategory());
        holder.studioTxt.setText(movies.get(position).getNomEstudio());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView nameTxt,studioTxt,categoryTxt;
        CardView cv;

        public MovieViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cardview);
            nameTxt = itemView.findViewById(R.id.txtView_movie_name);
            studioTxt=itemView.findViewById(R.id.txtView_studio);
            categoryTxt=itemView.findViewById(R.id.txtView_category);
        }
    }
}
