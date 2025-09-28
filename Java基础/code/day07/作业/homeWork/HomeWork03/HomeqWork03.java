package com.itheima.homeWork.HomeWork03;

public class HomeqWork03 {
    public static void main(String[] args) {
        Cat cat = new Cat('花',"波斯猫");
        Dog dog = new Dog();

        dog.setColor('黑');
        dog.setBreed("藏獒");

        cat.eat();
        cat.catchMouse();

        dog.eat();
        dog.lookHome();
    }


}
