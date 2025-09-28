package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/16 10:00
 * @Description:
 */
public class Pig extends Animal implements Fly{
    @Override
    public void eat() {
        System.out.println("猪吃泔水");
    }

    @Override
    public void flyying() {
        System.out.println("猪起飞了");
    }
}
