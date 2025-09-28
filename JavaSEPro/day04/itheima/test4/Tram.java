package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/19 11:50
 * @Description:
 */
public class Tram {
    //属性  行为
    //品牌
    private String brand;
    //价格
    private int price;
    //行驶公里数
    private int km;

    public Tram() {
    }

    public Tram(String brand, int price, int km) {
        this.brand = brand;
        this.price = price;
        this.km = km;
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", km=" + km +
                '}';
    }
}
