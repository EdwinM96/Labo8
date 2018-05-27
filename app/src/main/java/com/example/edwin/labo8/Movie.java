package com.example.edwin.labo8;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "movie")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    private int idMovie;
    @ColumnInfo(name = "nom_movie")
    private String nomMovie;
    @ColumnInfo(name="desc_movie")
    private String descMovie;
    @ColumnInfo(name="nom_category")
    private String nomCategory;
    @ColumnInfo(name="nom_studio")
    private String nomEstudio;

    public Movie(){}
    public Movie(String nomMovie, String nomCategory, String nomEstudio){
        this.nomMovie=nomMovie;
        this.nomCategory = nomCategory;
        this.nomEstudio=nomEstudio;

    }

    public String getNomEstudio() {
        return nomEstudio;
    }

    public String getNomMovie() {
        return nomMovie;
    }

    public void setNomMovie(String nomMovie) {
        this.nomMovie = nomMovie;
    }

    public void setNomEstudio(String nomEstudio) {
        this.nomEstudio = nomEstudio;
    }

    public String getDescMovie() {
        return descMovie;
    }

    public void setDescMovie(String descMovie) {
        this.descMovie = descMovie;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNomCategory() {
        return nomCategory;
    }

    public void setNomCategory(String nomCategory) {
        this.nomCategory = nomCategory;
    }

    public Movie(int idMovie, String nomMovie, String descMovie, String nomCategory, String nomEstudio) {
        this.idMovie = idMovie;
        this.nomMovie = nomMovie;
        this.descMovie = descMovie;
        this.nomCategory = nomCategory;
        this.nomEstudio = nomEstudio;
    }
}
