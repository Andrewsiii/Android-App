package com.example.myapplication;


import java.util.*;

public class CarProvider {
    private static List<Car> CarList = new ArrayList<>(); // list of all the phones(products)
    static int[] imageList0 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList1 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList2 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList3 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList4 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList5 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList6 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList7 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList8 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList9 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images

    static int[] imageList10 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList11 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList12 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList13 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList14 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList15 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList16 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList17 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList18 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList19 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images

    static int[] imageList20 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList21 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList22 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList23 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList24 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList25 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList26 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList27 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList28 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images
    static int[] imageList29 = {R.drawable.s001, R.drawable.s002, R.drawable.s003}; //to show 3 images


    public static void InitialiseList() {
        CarList.add(new Car(0, "Sedan", "2009 Skyline 3", "This is a Nissan Skyline 3", imageList0, 50000));
        CarList.add(new Car(1, "Sedan", "2011 Honda Civic", "This is a Honda Civic", imageList1, 40000));
        CarList.add(new Car(2, "Sedan", "2011 Mitsubishi Galant", "This is a Mitsubishi Galant", imageList2, 50000));
        CarList.add(new Car(3, "Sedan", "2011 benz c200", "This is a benz c200", imageList3, 50000));
        CarList.add(new Car(4, "Sedan", "2012 benz c200", "This is a benz c200", imageList4, 30000));
        CarList.add(new Car(5, "Sedan", "2012 Volvo s60", "This is a Volvo s60", imageList5, 60000));
        CarList.add(new Car(6, "Sedan", "2013 mazda 6", "This is a mazda 6", imageList6, 50000));
        CarList.add(new Car(7, "Sedan", "2014 audi a6", "This is a audi a6", imageList7, 50000));
        CarList.add(new Car(8, "Sedan", "2016 bmw 330e", "This is a bmw 330e", imageList8, 50000));
        CarList.add(new Car(9, "Sedan", "2011 benz c200", "This is a benz c200", imageList9, 50000));

        CarList.add(new Car(10, "hatchback", "2007 mini cooper", "This is a mini cooper", imageList10, 50000));
        CarList.add(new Car(11, "hatchback", "2008 benz b170", "This is a benz b170", imageList11, 50000));
        CarList.add(new Car(12, "hatchback", "2008 honda fit", "This is a honda fit", imageList12, 50000));
        CarList.add(new Car(13, "hatchback", "2008 Volkswagen polo", "This is a volkswagen polo", imageList13, 50000));
        CarList.add(new Car(14, "hatchback", "2010 Volkswagen golf", "This is a Volkswagen golf", imageList14, 50000));
        CarList.add(new Car(15, "hatchback", "2011 Toyota Blade", "This is a Toyota Blade", imageList15, 50000));
        CarList.add(new Car(16, "hatchback", "2013 Audi A1", "This is a Audi A1", imageList16, 50000));
        CarList.add(new Car(17, "hatchback", "2013 Hyundai I30", "This is a Hyundai I30", imageList17, 50000));
        CarList.add(new Car(18, "hatchback", "2013 peugeot 308", "This is a Peugeot 308", imageList18, 50000));
        CarList.add(new Car(19, "hatchback", "2017 Hyundai Ascent", "This is a Hyundai Ascent", imageList19, 50000));

        CarList.add(new Car(20, "SUV", "2007 Audi Q7", "This is a Audi Q7", imageList20, 50000));
        CarList.add(new Car(21, "SUV", "2008 Mitsubishi Outlander", "This is a Mitsubishi Outlander", imageList21, 50000));
        CarList.add(new Car(22, "SUV", "2011 Peugeot 3008", "This is a Peugeot 3008", imageList22, 50000));
        CarList.add(new Car(23, "SUV", "2012 BMW X1", "This is a BMW X1", imageList23, 50000));
        CarList.add(new Car(24, "SUV", "2012 Audi Q7", "This is a BMW X5", imageList24, 50000));
        CarList.add(new Car(25, "SUV", "2013 Jeep Grand", "This is a Jeep Grand", imageList25, 50000));
        CarList.add(new Car(26, "SUV", "2017 Mazda CX9", "This is a Mazda CX9", imageList26, 50000));
        CarList.add(new Car(27, "SUV", "2017 Subaru Forester", "This is a Subaru Forester", imageList27, 50000));
        CarList.add(new Car(28, "SUV", "2017 Toyota RAV4", "This is a Toyota RAV 4", imageList28, 50000));
        CarList.add(new Car(29, "SUV", "2019 Toyota Land", "This is a Toyota Land", imageList29, 50000));


    }
    // generates all the phones(products) of the required brand(category)
    public static List<Car> getCarList (String carType){

        List<Car> newList = new ArrayList<>();

        for (int i = 0; i < CarList.size(); i++) {
            if (CarList.get(i).getCarType().equals(carType)) {
                newList.add(CarList.get(i));
            }
        }

        return newList;
    }
}
