package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button bKeliling, bLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bKeliling = (Button)findViewById(R.id.bKeliling);
        bLuas =(Button) findViewById(R.id.bLuas);
        bLuas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        bKeliling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });


    }


}
