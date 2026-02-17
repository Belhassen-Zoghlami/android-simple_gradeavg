package com.moyenne.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;

public class Activity_echec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_echec);
        TextView Ft = findViewById(R.id.FText);
        String m = getIntent().getStringExtra("msg");
        Ft.setText(m);
    }
    public void sendsms(View v)
    {
        //+1 555-123-4567
        send
    }
}