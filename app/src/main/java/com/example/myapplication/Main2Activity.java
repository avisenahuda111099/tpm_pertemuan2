package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText eJari;
    Button bLuas;
    TextView tHasil;
    public static double jari, volume;
    public String volume2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eJari=(EditText) findViewById(R.id.eJari);
        tHasil=(TextView) findViewById(R.id.tHasil);
        bLuas = (Button) findViewById(R.id.bLuas);
        bLuas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                jari =Double.parseDouble(eJari.getText().toString());
                volume=3.14*jari*jari;
                volume2=String.valueOf(volume);
                tHasil.setText(volume2);
            }
        });
    }


}
