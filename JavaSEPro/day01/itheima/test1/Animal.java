package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/15 10:53
 * @Description:
 */
public class Animal {
    public Animal() {
    }

    public Animal(String name, String brand, int age) {
        this.name = name;
        this.brand = brand;
        this.age = age;
    }

    String name;
    String brand;
    int  age;

    public  void eat(){
        System.out.println("吃饭");
    }
}
