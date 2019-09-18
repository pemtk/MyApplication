package com.iam.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper sqLiteOpenHelper;
    ArrayList<EtudiantDAO> etudiantDAOArrayList;
    private MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.button);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);
//
//        Button button2 = findViewById(R.id.button2);
//        View.OnClickListener onClickListener2 = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
//                startActivity(intent);
//            }
//        };
//        button2.setOnClickListener(onClickListener2);
//
//        //Extra
//        String extra = "IAM";
//        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
//        intent.putExtra("Valeur", extra);
//        startActivity(intent);

//        Button button = findViewById(R.id.button);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("tel:221781696709");
//                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);

//        Button button = findViewById(R.id.button);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("content://contacts/people");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);

//        Button button = findViewById(R.id.button);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("geo:14,705102,-17,472705");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);
//
//        Button button2 = findViewById(R.id.button2);
//        View.OnClickListener onClickListener2 = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("http://www.google.fr");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        };
//        button2.setOnClickListener(onClickListener2);

        //Préférence

//        Button button = findViewById(R.id.bt_preference);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Preference.class);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);

        /*EditText ed_nom= findViewById(R.id.ed_nom);
        EditText ed_prenom = findViewById(R.id.ed_prenom);
        EditText ed_age = findViewById(R.id.ed_age);


        Button button = findViewById(R.id.bt_ajouter);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EtudiantDAO etudiantDAO = new EtudiantDAO(MainActivity.this);
                    Etudiant etudiant = new Etudiant(2, "Tola", "Prince", 20);
                    etudiantDAO.ajouterEtudiant(etudiant);

                    Toast.makeText(MainActivity.this, "Etudiant Enrégistré avec succes", Toast.LENGTH_SHORT).show();
                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, "Erreur", Toast.LENGTH_SHORT).show();
                }
            }
        };
        button.setOnClickListener(onClickListener);

        Button button_afficher = findViewById(R.id.bt_afficher);
        View.OnClickListener onClickListener_afficher = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EtudiantDAO etudiantDAO = new EtudiantDAO(MainActivity.this);
                    Etudiant etudiant = etudiantDAO.selectionnerEtudiant(2);
                    TextView tv = findViewById(R.id.tv_console);

                   tv.setText(etudiant.getId() +" "+etudiant.getNom()+" "+etudiant.getPrenom()+" "+etudiant.getAge());
                   //setContentView(tv);



                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, "Erreur " + ex, Toast.LENGTH_SHORT).show();
                }
            }

        };
        button_afficher.setOnClickListener(onClickListener_afficher);*/

        //Notification

//        Button button = findViewById(R.id.bt_notification);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
//                startActivity(intent);
//            }
//        };
//        button.setOnClickListener(onClickListener);

        this.activity = this;
        Button button = findViewById(R.id.bt_notification);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                myPopup.setTitle("Salut");
                myPopup.setMessage("Salut à tous c'est Prince");
            }
        };
        button.setOnClickListener(onClickListener);
    }
}
