package com.example.edwin.labo8;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Movie.class}, version=1)
public abstract class Appdatabase extends RoomDatabase {
    private static Appdatabase INSTANCE;
    public abstract MovieDAO movieDAO();

    public static Appdatabase getAppDatabase(Context context){
        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),Appdatabase.class,"movies-database").allowMainThreadQueries().build();
        }

        return  INSTANCE;
    }
}
