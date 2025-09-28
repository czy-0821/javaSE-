package com.itheima.test11;

/**
 * @Author:gy
 * @Date: 2025/08/15 17:56
 * @Description:
 */
public class A {
    static int count = 0;
    //静态代码块 在类中方法外 被static修饰 只在类加载的时候执行一次
    static {
        //以后我们做一些配置文件的初始化  连接数据库  登录用户名和密码
        System.out.println("我是静态代码块");
    }
    //构造代码块   类中方法外  创建对象的时候会执行一次  统计这个对象创建了多少次
    {
        count ++;
        System.out.println("我是构造代码块");
    }
    public A() {
        System.out.println("我是构造方法");
    }
}
