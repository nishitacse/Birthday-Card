package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Object MainActivity;
    private EditText name;
    private Button createbirthdaycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.userInput);

        createbirthdaycard  = findViewById(R.id.cardButton);

        createbirthdaycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = name.getText().toString();
                Intent i = new Intent(MainActivity.this, GreetingActivity.class);
                i.putExtra("name" ,input);
                startActivity(i);
            }
        })
            ;


        }
    }




