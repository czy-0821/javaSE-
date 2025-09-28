package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/16 8:48
 * @Description:
 */
public class Animal {
    private int age;
    private String color;
    public Animal() {
    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //行为
    public void eat(String something){
        System.out.println("eat"+something);
    }
}
