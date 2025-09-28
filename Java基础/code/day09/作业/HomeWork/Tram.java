package com.itheima.HomeWork;

public class Tram {
    private String breed;
    private  int price;
    private int distance;


    public Tram() {}

    public Tram(String breed, int price, int distance) {
        this.breed = breed;
        this.price = price;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return
                "  电车品牌:" + breed +
                "  价格:" + price +
                "  行驶距离:" + distance
                ;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
