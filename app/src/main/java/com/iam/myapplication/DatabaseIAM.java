package com.iam.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseIAM extends SQLiteOpenHelper {
    public static final String Etu = "Etudiant";
    public static final String idE = "Id";
    public static final String nomE = "Nom";
    public static final String prenomE = "Prenom";
    public static final String ageE = "age";

    //Nom e base de données
    public static final String database = "databaseiame.db";

    public static final String Etudiant_Table
    = "CREATE TABLE "+Etu+" ("
            + ""+idE+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ""+nomE+" TEXT NOT NULL,"
            + ""+prenomE+" TEXT NOT NULL,"
            + ""+ageE+" INTEGER NOT NULL);";

    public static final String Etudiant_Table_Drop = "DROP TABLE IF EXISTS " + Etu;

//    public DatabaseIAM(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//        // TODO Auto-generated constructor stub }
//    }


    public DatabaseIAM(Context pcontext) {
        super(pcontext, database, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

                db.execSQL(Etudiant_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Etudiant_Table_Drop);
        onCreate(db);
    }
}