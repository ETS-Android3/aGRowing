package com.example.greborio2;


public class Item {
    private String name;
    private double price;
    private int mImageDrawable;
    private double quanity;
    private double cartquanity;


    public Item(String name,double price,int mImageDrawable,double quanity){
        this.name=name;
        this.price=price;
        this.mImageDrawable=mImageDrawable;
        this.quanity=quanity;
        this.cartquanity=0;
    }

    public Item(String name,double price,int mImageDrawable,double quanity,double cartquanity){
        this.name=name;
        this.price=price;
        this.mImageDrawable=mImageDrawable;
        this.quanity=quanity;
        this.cartquanity=cartquanity;
    }



    public int getmImageDrawable(){
        return mImageDrawable;
    }
    public String getName(){ return name; }
    public double getPrice(){
        return price;
    }
    public double getQuanity() {return quanity;}
    public double getCartquanity() {return cartquanity;}
    public double getCost(){return cartquanity*price;}

    public void setCartquanity(double Cartquanity){this.cartquanity=Cartquanity;}
    public void setIm(int im){ mImageDrawable=im; }
    public void setPrice(double pr){
        price=pr;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setQuanity(double quanity){this.quanity=quanity;}
}
