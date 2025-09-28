package com.itheima.homework.homework03;

/**
 * @author 陈辉
 * @data 2025 15:47
 */

public class Homework03 {
    public static void main(String[] args) {
        // 创建对象
        Cat cat = new Cat();
        cat.setColor("花色");
        cat.setBreed("波斯猫");
        cat.eat();
        cat.catchMouse();


        Dog dog = new Dog("黑色","藏獒");
        dog.eat();
        dog.lookHome();
    }
}
