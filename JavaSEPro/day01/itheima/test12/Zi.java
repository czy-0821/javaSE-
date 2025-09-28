package com.itheima.test12;

/**
 * @Author:gy
 * @Date: 2025/08/15 18:08
 * @Description:
 */
public class Zi extends Fu{
    public Zi() {
        System.out.println("子类的无参构造");
    }
    static{
        System.out.println("子类的静态代码块");
    }
    {
        System.out.println("子类的构造代码块");
    }
}
