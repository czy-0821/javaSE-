package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/16 8:53
 * @Description:
 */
public class Cat extends Animal{
    public Cat() {
    }
    public Cat(int age, String color) {
        super(age, color);
    }
    //Ctrl+o

    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
