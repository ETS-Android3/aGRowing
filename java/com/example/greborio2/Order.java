package com.example.greborio2;

import java.util.Date;

public class Order {
    String date;
    String address;
    String product;
    String price;
    String quanity;
    String condition;

    public Order(String date,String address,String product,String price,String condition,String quanity){
        this.date=date;
        this.address=address;
        this.product=product;
        this.price=price;
        this.condition=condition;
        this.quanity=quanity;
    }

    public String getCondition() {
        return condition;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    public String getPrice() {
        return price;
    }

    public String getQuanity() {
        return quanity;
    }
}
