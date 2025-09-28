package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/16 11:17
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        EagerDemo  e1 = EagerDemo.getInstance();
        EagerDemo  e2 = EagerDemo.getInstance();
        EagerDemo  e3 = EagerDemo.getInstance();
        System.out.println(e1 == e2);
        System.out.println(e3 == e2);
    }
}
