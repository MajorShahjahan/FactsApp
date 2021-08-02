package com.example.factsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txtView);
         String[] myFacts = Facts.getFacts();

         for (String facts : myFacts){


             textView.append(facts + "\n\n");
         }

    }
}