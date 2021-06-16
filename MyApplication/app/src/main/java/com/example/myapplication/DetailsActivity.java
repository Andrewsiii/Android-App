package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class DetailsActivity extends AppCompatActivity {
    CarouselView carouselView;
    int[] sampleImages = {};
    private TextView carName;
    private TextView carType;
    private TextView carDescription;
    private TextView carPrice;
    Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specific_car_view); //whatever xml file - need to implement

        carName = (TextView) findViewById(R.id.specific_text_name);
        carType = (TextView) findViewById(R.id.specific_text_type);
        carDescription = (TextView) findViewById(R.id.specific_text_description); //access the TextView item for the model description
        carPrice = (TextView) findViewById(R.id.specific_text_price);
        carouselView = (CarouselView) findViewById(R.id.carouselView) ;//needs implementation


        Intent thisIntent = getIntent();
        car = (Car) thisIntent.getSerializableExtra("car");
        loadCar(car);


        //image still needs to be done

    }
    private void loadCar(Car car) {
        this.setTitle(car.getCarName());

        // Gather all images of album for carousel
        int[] id = new int[3];
        for (int i = 0; i < car.imageName.length; i++) {
            id[i] = this.getResources().getIdentifier(
                    String.valueOf(car.getImageName()[i]), "drawable",
                    this.getPackageName());
        }

        // Set values
        carName.setText(car.getCarName());
        carDescription.setText(car.getCarInfo());
        carPrice.setText(car.getPrice());
        sampleImages = id;
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}
