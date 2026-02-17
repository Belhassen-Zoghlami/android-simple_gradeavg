package com.moyenne.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    public double getdouble(EditText e)
    {
        return Double.parseDouble(e.getText().toString());
    }
    public void intenting (Class a, String m)
    {
        Intent i = new Intent(MainActivity.this, a);
        i.putExtra("msg",m);
        startActivity(i);
    }
    public void calc(View v)
    {
        EditText note1 = findViewById(R.id.note1);
        double n1Val = getdouble(note1);
        EditText note2 = findViewById(R.id.note2);
        double n2Val = getdouble(note2);
        EditText note3 = findViewById(R.id.note3);
        double n3Val = getdouble(note3);
        EditText c1 = findViewById(R.id.c1);
        EditText c2 = findViewById(R.id.c2);
        EditText c3 = findViewById(R.id.c3);
        double c1val = getdouble(c1);
        double c2val = getdouble(c2);
        double c3val = getdouble(c3);
        double moy = (n1Val*c1val +n2Val*c2val+n3Val*c3val)/(c1val+c2val+c3val);


        if (moy >=10)
        {
            message=String.format("congrats you passed: %.2f",moy);

            intenting(Activity_reussi.class, message);

        }
        else
        {
            message=String.format("nt you failed: %.2f",moy);
            intenting(Activity_echec.class, message);
        }
    }
}