package com.iam.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO extends DAOBase {

    SQLiteDatabase db;

    public EtudiantDAO(Context pContext) {
        super(pContext);
    }

    public void ajouterEtudiant(Etudiant e){
        db = this.open();
        ContentValues value = new ContentValues();
        value.put(DatabaseIAM.nomE, e.getNom());
        value.put(DatabaseIAM.prenomE, e.getPrenom());
        value.put(DatabaseIAM.ageE, e.getAge());
        db.insert(DatabaseIAM.Etu, null, value);
        db.close();
    }

    public void supprimerEtudiant(long id){
        db = this.open();
        db.delete(DatabaseIAM.Etu, DatabaseIAM.idE + " = ?", new String[] {String.valueOf(id)});
    }

    public void modifierEtudiant(Etudiant e){
        db = this.open();
        ContentValues value = new ContentValues();
        value.put(DatabaseIAM.nomE, e.getNom());
        value.put(DatabaseIAM.prenomE, e.getPrenom());
        value.put(DatabaseIAM.ageE, e.getAge());
        db.update(DatabaseIAM.Etu, value, DatabaseIAM.idE  + " = ?", new String[] {String.valueOf(e.getId())});
        db.close();
    }

    public Etudiant selectionnerEtudiant(long id){
        db=this.open();
        Cursor cursor = db.query(true,DatabaseIAM.Etu,new String[]{DatabaseIAM.idE, DatabaseIAM.nomE,DatabaseIAM.prenomE,DatabaseIAM.ageE}, DatabaseIAM.idE  + " = ?", new String[] {String.valueOf(id)}, null,null, null, null);

        if (cursor != null){
            cursor.moveToFirst();
        }
        Etudiant etudiant = new Etudiant(Long.parseLong(cursor.getString(0)), cursor.getString(1), cursor.getString(2), Integer.parseInt(cursor.getString(3)));

        return etudiant;
    }

    public List<Etudiant> getAllRtudiant(){
        db = this.open();
        List<Etudiant> etudiants = new ArrayList<>();
        Cursor query = db.rawQuery("select * from "+ DatabaseIAM.Etu,null);

        if (query != null){
            query.moveToFirst();
            while (query.moveToNext()){
                Etudiant etudiant = new Etudiant(Long.parseLong(query.getString(0)), query.getString(1), query.getString(2), Integer.parseInt(query.getString(3)));
                etudiants.add(etudiant);
            }

        }
        db.close();
        return etudiants;
    }
}
