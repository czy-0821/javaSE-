package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/16 16:08
 * @Description:
 */
public interface A {
    public default void show(){
        System.out.println("A的show");
    }
}
