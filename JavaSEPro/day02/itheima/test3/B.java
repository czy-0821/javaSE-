package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/16 15:00
 * @Description:
 */
public class B implements A{
    public B() {
        super();//Objece
    }

    @Override
    public void show1() {
        System.out.println("show1");
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }
}
