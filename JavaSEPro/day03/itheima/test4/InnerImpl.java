package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/18 10:44
 * @Description:
 */
public class InnerImpl implements Inner{
    @Override
    public void show() {
        System.out.println("实现类show");
    }

    @Override
    public void show2() {
        System.out.println("实现类show2");
    }
}
