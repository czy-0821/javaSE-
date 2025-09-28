package com.itheima.test4;



/**
 * @Author:gy
 * @Date: 2025/08/16 15:24
 * @Description:
 */
public class Chicken extends Animal implements Fly,Jump{
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void fly() {
        System.out.println("鸡会飞");
    }

    @Override
    public void jump() {
        System.out.println("鸡会跳高");
    }
}
