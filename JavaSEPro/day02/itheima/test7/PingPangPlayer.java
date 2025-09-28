package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/16 16:58
 * @Description:
 */
public class PingPangPlayer extends Person implements Study,SpeckEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃小米粥");
    }

    @Override
    public void study(String name) {
        System.out.println(name+"学习如何发球");
    }

    @Override
    public void speckEnglish() {
        System.out.println("学习英语");
    }
}
