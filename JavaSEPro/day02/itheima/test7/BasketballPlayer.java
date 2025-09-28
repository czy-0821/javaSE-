package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/16 16:58
 * @Description:
 */
public class BasketballPlayer extends Person implements Study{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃海参");
    }

    @Override
    public void study(String name) {
        System.out.println(name+"学如何投篮");
    }
}
