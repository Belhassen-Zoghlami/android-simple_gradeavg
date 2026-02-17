package com.moyenne.tp2;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_reussi extends AppCompatActivity {
    public String m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reussi);
        TextView sucT = findViewById(R.id.SuccT);
        m = getIntent().getStringExtra("msg");
        sucT.setText(m);
    }

    public void sendsms(View v)
    {
        SmsManager sm = SmsManager.getDefault();
        sm.sendTextMessage("5551234567",null,m,null,null);
    }
}