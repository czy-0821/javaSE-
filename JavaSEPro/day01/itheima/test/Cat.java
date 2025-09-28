package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/15 9:16
 * @Description:
 */
public class Cat extends Animal{
     //成员变量
   int num = 200;
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
    public void show(){
        //局部变量
        int num = 100;
       // System.out.println(num);
       // System.out.println(this+"show");
        super.show1();
    }
    public void show1(){
        System.out.println("子类的show1");
    }
}
