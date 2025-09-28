package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/16 11:11
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        LazyDemo ld = LazyDemo.getInstance();
        LazyDemo ld1 = LazyDemo.getInstance();
        LazyDemo ld2 = LazyDemo.getInstance();
        ld.getSum();
        System.out.println(ld==ld1);
        System.out.println(ld2==ld1);
    }
}
