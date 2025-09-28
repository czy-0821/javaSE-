package com.itheima.HomeWork.homeWork03;

public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    public void catchMouse(){
        System.out.println("🐱抓老鼠~~");
    }

    @Override
    public void eat(String something) {
        System.out.println("🐱吃" + something + "~~~");
    }
}
