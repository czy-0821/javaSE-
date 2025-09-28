package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 10:25
 *
 * 无参数无返回值方法的定义和调用
 */

public class Demo02 {
    public static void main(String[] args) {
        // 调用方法
        method01();
        System.out.println("------------------");
        method01();
    }


    // 定义方法
    // 需求：定义一个方法，方法内实现循环打印1~100
    public static void method01(){
        // 方法体逻辑代码
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
