package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textView);

        Button red = findViewById(R.id.button);
        red.setOnClickListener(v -> {
            text.setText(red.getText());
            text.setTextColor(getResources().getColor(R.color.red));
        });

        Button yellow = findViewById(R.id.button2);
        yellow.setOnClickListener(v -> {
            text.setText(yellow.getText());
            text.setTextColor(getResources().getColor(R.color.yellow));
        });

        Button green = findViewById(R.id.button3);
        green.setOnClickListener(v -> {
            text.setText(green.getText());
            text.setTextColor(getResources().getColor(R.color.green));
        });


    }
}