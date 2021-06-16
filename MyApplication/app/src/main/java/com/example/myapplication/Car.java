package com.example.myapplication;

public class Car {

        public int carID;
        public String carType;
        public String carName;
        public String carInfo;
        public int[] imageName;
        public int price;
        private int views;

        public Car(int carID, String carType, String carName, String carInfo, int[] imageName, int price){
            this.carID = carID;
            this.carType = carType;
            this.carName = carName;
            this.carInfo = carInfo;
            this.imageName = imageName;
            this.price = price;

        }

        public int getCarID(){
            return carID;
        }

        public String getCarType(){
            return carType;
        }

        public String getCarName(){
            return carName; //combine year, brand and model into just name
        }

        public String getCarInfo(){
            return carInfo;
        }

        public int[] getImageName(){
            return imageName;
        }


        public int getPrice(){
            return price;
        }

        public int getViews(){
            return views;
        }

        public void addViews(){
            views++;
        }



}
