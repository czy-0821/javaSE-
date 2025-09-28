package com.itheima.homeWork.HomeWork01;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Phone {
    private  String breand;
    private  double price;

    public void call(){
        System.out.println("正在使用价格为" + this.price + "的" + this.breand + "品牌的手机打电话.....");
    }

    public void sendMessage(){
        System.out.println("正在使用价格为" + this.price + "的" + this.breand + "品牌的手机发短信.....");
    }

    public void playGame(){
        System.out.println("正在使用价格为" + this.price + "的" + this.breand + "品牌的手机玩游戏.....");
    }


    public Phone() {}

    public Phone(String breand, double price) {
        this.breand = breand;
        this.price = price;
    }

    public String getBreand() {
        return breand;
    }

    public void setBreand(String breand) {
        this.breand = breand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
