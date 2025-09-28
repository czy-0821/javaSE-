package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/18 9:58
 * @Description:
 */
public class Outer {
    static int num1 = 10;
    int num2 = 20;
    public void show2(){
        System.out.println("我是外部类的show2方法");
        Inner inner = new Inner();
        inner.show1();

    }
    static class Inner {
        int num3 = 30;
        public void show1(){
            System.out.println(num1);
        }
    }
}
