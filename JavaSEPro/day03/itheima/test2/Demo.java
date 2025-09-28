package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/18 10:02
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
       //创建内部类对象  外部类名.内部类名 对象名 = new 外部类名.内部类名()
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
    }
}
