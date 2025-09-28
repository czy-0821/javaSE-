package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/16 15:24
 * @Description:
 */
public abstract class Animal {
    private String brand;
    private int age;

    public Animal() {
    }

    public Animal(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
}
