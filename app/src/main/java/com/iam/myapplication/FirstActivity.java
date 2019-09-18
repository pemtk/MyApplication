package com.iam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        /*TextView tv = new TextView(this);

        String applicationName = getApplicationContext().getResources().getString(R.string.app_name);

        applicationName = "IAM Android Application";
        tv.setText(applicationName)"";
        setContentView(tv);*/

        /*Button button3 = findViewById(R.id.button3);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };
        button3.setOnClickListener(onClickListener);*/

        //Extra
        /*Intent intent = getIntent();
        String affichage = intent.getStringExtra("Valeur");

        TextView tv = new TextView(this);

        tv.setText(affichage);
        setContentView(tv);
        */


    }
}
