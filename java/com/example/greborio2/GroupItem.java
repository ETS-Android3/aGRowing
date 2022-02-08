package com.example.greborio2;

import android.graphics.drawable.Drawable;

public class GroupItem {
    private String name;
    private String type;
    private int image;


    public GroupItem(String name,String type){
        this.name=name;
        this.type=type;
        image=0;
    }

    public GroupItem(String name,String type,int image){
        this.name=name;
        this.type=type;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getType() {
        return type;
    }
}
