package com.itheima.oop.demo02;

/**
 * @author 陈辉
 * @data 2025 10:42
 */

public class Demo02 {
    public static void main(String[] args) {
        int a = 10;     // 局部变量
        System.out.println(a);

        Phone p1 = new Phone();
        p1.brand = "华为 P50";
        p1.price = 6666;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        p1.call("光头强");
        p1.sendMsg();

        System.out.println("----------");
        //Phone p2 = new Phone();
        Phone p2 = p1;
        p2.brand = "苹果16 Pro Max";
        p2.price = 5999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        System.out.println("----------");
        System.out.println(p1.brand);
        System.out.println(p1.price);

        p2.call("熊大");
        p2.sendMsg();
    }
}
