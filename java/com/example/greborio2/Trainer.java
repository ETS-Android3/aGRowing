package com.example.greborio2;

public class Trainer {
    private String name;
    private double price;
    private int mImageDrawable;
    private String location;
    private String speciality;

    public Trainer (String name,double price,int mImageDrawable,String location,String speciality){
        this.name=name;
        this.price=price;
        this.mImageDrawable=mImageDrawable;
        this.location=location;
        this.speciality=speciality;
    }

    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getImg(){return mImageDrawable;}
    public String getLocation(){return location;}


    public String getSpeciality() { return speciality;}
}
