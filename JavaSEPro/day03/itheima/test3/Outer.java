package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/18 10:11
 * @Description:
 */
public class Outer {
    int num= 10;
    //局部 内部类  定义在类中方法里的类
    /*
    局部内部类可以直接访问外部类的成员也可以访问方法内的局部变量
    外部类想访问内部类怎么办?
         1.外部类没有办法直接访问
         2.必须调用局部内部类所在的方法,只能用这种方法简介的访问
    * */
    public void show1(){
        show2();
    }
    public void show2(){
        int num1= 20;
        //内部类 局部内部类不能加修饰符 局部两个字就是限制
         class Inner{
             int num = 30;
              public void show1(){
                  System.out.println("局部内部类的show1方法"+num1);
            }
        }
        Inner inner = new Inner();
         inner.show1();
    }
}
