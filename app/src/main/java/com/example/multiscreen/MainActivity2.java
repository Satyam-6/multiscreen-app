package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        T1=findViewById(R.id.textView);
        Intent intent= getIntent();
        String name1 = intent.getStringExtra(MainActivity.EXTRA_NAME);
        T1.setText(name1 + "  is a King ");
    }




}