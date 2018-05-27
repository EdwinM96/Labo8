package com.example.edwin.labo8;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Dao;
import java.util.List;
import com.example.edwin.labo8.Movie;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;
@Dao
public interface MovieDAO {
    @Query("SELECT * FROM MOVIE")
    List<Movie> getAll();

    @Insert(onConflict = REPLACE)
    void insertMovie(Movie movie);

}
