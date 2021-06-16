package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import java.util.List;

public class MainActivity extends AppCompatActivity{

    List<Car> topList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarProvider.InitialiseList();
        //top3list



        // Take the user to each appropriate list view based on the type of car they select
        Button button1 = findViewById(R.id.Button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("CarTypeFromMainActivity", "sedan");
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.Button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("CarTypeFromMainActivity", "suv");
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.Button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("CarTypeFromMainActivity", "hatchback");
                startActivity(intent);
            }
        });
    }



}