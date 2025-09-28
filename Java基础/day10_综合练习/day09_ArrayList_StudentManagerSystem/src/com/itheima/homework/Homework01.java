package com.itheima.homework;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 陈辉
 * @data 2025 9:05
 */

public class Homework01 {
    public static void main(String[] args) {
        // 1. 创建三个电车对象
        Tram tram1 = new Tram("xiaomi yu7", 20000);
        Tram tram2 = new Tram("xiaomi su7", 15000);
        Tram tram3 = new Tram("xiaomi ultra", 50000);

        ArrayList<Tram> list = new ArrayList<>();
        list.add(tram1);
        list.add(tram2);
        list.add(tram3);
        for (int i = 0; i < list.size(); i++) {
            Tram tram = list.get(i);
            tram.show();
        }

        System.out.println("-------------");

        // 假设没有行驶距离1000以下的
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            Tram tram = list.get(i);
            if (tram.getDistance() < 1000) {
                count++;
                tram.show();
            }
        }

        if (count == 0){
            System.out.println("没有行驶距离在1000以下的电车");
        }

    }
}

class Tram {
    private String brand;
    private int price;
    private int distance;

    public void show() {
        System.out.println("品牌：" + brand + "...价格：" + price + "...行驶距离：" + distance);
    }

    public Tram() {
    }

    public Tram(String brand, int price) {
        this.brand = brand;
        this.price = price;

        // 随机生成行驶距离：[0,2000]
        Random r = new Random();
        int distance = r.nextInt(2001);
        this.distance = distance;
    }

    public Tram(String brand, int price, int distance) {
        this.brand = brand;
        this.price = price;
        this.distance = distance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
