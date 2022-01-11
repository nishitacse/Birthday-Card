package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {


    private TextView view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        view = findViewById(R.id.birthdayGreeting);
        String a = getIntent().getStringExtra("name");
        view.setText("Happy Birthday\n"+a);


    }
}