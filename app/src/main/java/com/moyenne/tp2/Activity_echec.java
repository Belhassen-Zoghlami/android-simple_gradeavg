package com.moyenne.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;

public class Activity_echec extends AppCompatActivity {
    public String m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_echec);
        TextView Ft = findViewById(R.id.FText);
        m = getIntent().getStringExtra("msg");
        Ft.setText(m);
    }
    public void sendsms(View v)
    {
        SmsManager sm = SmsManager.getDefault();
        sm.sendTextMessage("5551234567",null,m,null,null);
    }
}