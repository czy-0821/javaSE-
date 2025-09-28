package com.itheima.test12;

/**
 * @Author:gy
 * @Date: 2025/08/15 18:08
 * @Description:
 */
public class Fu {
    public Fu() {
        System.out.println("父类的无参构造");
    }
    static{
        System.out.println("父类的静态代码块");
    }
    {
        System.out.println("父类的构造代码快");
    }
}
