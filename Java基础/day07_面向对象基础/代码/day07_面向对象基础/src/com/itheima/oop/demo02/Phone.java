package com.itheima.oop.demo02;

/**
 * @author 陈辉
 * @data 2025 10:41
 */
public class Phone {

    // 成员变量
    String brand;       // 品牌
    int price;          // 价格

    // 成员方法
    public void call(String name){
        System.out.println(brand);
        System.out.println("给"+name+"打电话....");
    }

    public void sendMsg(){
        System.out.println(brand);
        System.out.println("发短信....");
    }

}
