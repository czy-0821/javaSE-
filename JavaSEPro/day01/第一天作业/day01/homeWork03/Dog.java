package com.itheima.HomeWork.homeWork03;

public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    public void lookHome(){
        System.out.println("🐕看家~~~");
    }

    @Override
    public void eat(String something) {
        System.out.println("🐕吃"+something+"~~~");
    }
}
