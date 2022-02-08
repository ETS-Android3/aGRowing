package com.example.greborio2;

class Add_Model {
    Integer Photo;
    String Name;
    String description;

    public Add_Model(Integer photo,String name,String description){
        this.Photo=photo;
        this.Name=name;
        this.description=description;
    }

    public Integer getPhoto(){
        return Photo;
    }

    public String getName(){
        return Name;
    }

    public String getDescription(){
        return description;
    }

}
