package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/16 16:59
 * @Description:
 */
public class BasketballCoach extends Person implements Teach{
    @Override
    public void eat() {
        System.out.println("吃海参");
    }

    @Override
    public void teach() {
        System.out.println("教如何发球");
    }
}
