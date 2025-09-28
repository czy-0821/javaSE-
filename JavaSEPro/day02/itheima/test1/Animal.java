package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/16 9:14
 * @Description:
 */
public abstract class Animal {
    /*
    1.抽象类中可以有成员变量嘛?   可以
    2.抽象类中可以有非抽象的方法嘛?  可以
    3.抽象类中可以没有抽象方法嘛?   可以,但是抽象方法一定在抽象类中
    4.抽象类可以有构造方法嘛?  可以
    5.抽象类可以直接创建对象吗?  不可以
    6.那构造方法的意义是什么呢? 子类创建对象时.自动调用父类的构造方法给成员变量初始化
    7.抽象类不能直接创建对象,你怎么使用里面的方法呢?  利用多态
    8.作为抽象类的子类,必须要重写父类的所有抽象方法嘛?  如果子类不是抽象类,就必须要全部重写.
    * */

    public Animal() {
    }

    public Animal(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    int num = 10;
    int num1 = 200;
    public abstract void eat();
    //public abstract void eat1();
    public void sleep(){
        System.out.println("父类睡觉");
    }
}
