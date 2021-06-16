package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;

import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.List;

public class ListActivity extends AppCompatActivity{
    CarAdapter carAdapter;
    ListView listView;
    String carType;
    List<Car> carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout); //need to implement whatever XML file

        // Receive info from the main activity
        Intent thisIntent = getIntent();
        carType = thisIntent.getStringExtra("CarTypeFromMainActivity");

        // Set title depending on the car type we got from main activity
        String title = carType.substring(0, 1).toUpperCase() + carType.substring(1); //capitalize
        this.setTitle(title);

        carList = CarProvider.getCarList(carType);

        //get the appropriate list of cars depending on the type of car
        List<Car> carList = CarProvider.getCarList(carType);
        carAdapter = new CarAdapter(this, R.layout.car_view, carList);
        listView = (ListView) findViewById(R.id.listCars);
        listView.setAdapter(carAdapter);

        showDetailsActivity();

        //maybe search bar??

        //maybe add animation
    }

    public void showDetailsActivity(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing album as an extra
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                intent.putExtra("car", (Serializable) carAdapter.getItem(position));


                startActivity(intent);

                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }




}
