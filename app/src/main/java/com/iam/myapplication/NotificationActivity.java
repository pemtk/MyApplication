package com.iam.myapplication;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends Activity {


    int id_notification = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Button button = findViewById(R.id.bt_notif);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int icon = R.mipmap.ic_launcher;
                String tickerText = "Notification IAM";
                long when = System.currentTimeMillis();

                Intent intent = new Intent(NotificationActivity.this, NotificationActivity.class);

                //Pending qui envoie l'intent
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this, 0, intent,0);
                Notification.Builder builder = new Notification.Builder(NotificationActivity.this)
                        .setSmallIcon(icon)
                        .setContentTitle(tickerText)
                        .setWhen(when)
                        .setContentIntent(pendingIntent);

                Notification notification = builder.getNotification();
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                manager.notify(id_notification, notification);
            }
        };
        button.setOnClickListener(onClickListener);
    }
}
