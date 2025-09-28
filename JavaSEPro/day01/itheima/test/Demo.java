package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/15 9:23
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();
        cat.eat();
        dog.eat();
        cat.brand = "波斯猫";
        dog.brand = "博美";
        System.out.println(cat.brand);
        System.out.println(dog.brand);
    }
}
