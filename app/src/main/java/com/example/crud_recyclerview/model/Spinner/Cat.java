package com.example.crud_recyclerview.model.Spinner;

public class Cat {
    private int img;
    private String name,descripe;
    private Double price;

    public Cat() {

    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cat(int img, String name, String descripe, Double price) {
        this.img = img;
        this.name = name;
        this.descripe = descripe;
        this.price = price;
    }
}
