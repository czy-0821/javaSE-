package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/18 9:19
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //在测试类中如何访问内部类
        //外部类可以直接创建
        Outer outer = new Outer();
       /*   内部类不是直接创建
           成员内部类  在测试类中创建对象的格式
           外部类名.内部类名  对象名 = 外部类对象.内部类对象
        */
        Outer.Inner oi = new Outer().new Inner();
        oi.show1();
    }
}
