package com.example.myapplication;

public class CarType {
    private int type;
    private String name;
    private String imageName;

    public CarType(int type, String name, String imageName){
        this.type = type;
        this.name = name;
        this.imageName = imageName;
    }

    public int getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public String getImageName(){
        return this.imageName;
    }

}
