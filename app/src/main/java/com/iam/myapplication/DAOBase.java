package com.iam.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DAOBase {
    protected SQLiteDatabase sqllitedb;
    protected DatabaseIAM dbiam;

    public DAOBase() {

    }

//    public DAOBase(SQLiteDatabase sqllitedb, DatabaseIAM dbiam) {
//        this.sqllitedb = sqllitedb;
//        this.dbiam = dbiam;
//    }


    public DAOBase(Context pContext) {
        this.dbiam = new DatabaseIAM(pContext);
    }

    public SQLiteDatabase open() {
        sqllitedb = dbiam.getWritableDatabase();
        return sqllitedb;
    }

    public void close() {
        sqllitedb.close();
    }

    public SQLiteDatabase getDb() {
        return sqllitedb;
    }

}
