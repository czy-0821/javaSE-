package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/16 11:14
 * @Description:
 */
public class EagerDemo {
    //饿汉式   不管别人有没有调用 我先创建一个对象再说
    private static final EagerDemo instance = new EagerDemo();
    private EagerDemo() {
    }
    public static EagerDemo getInstance(){
         return instance;
    }
}
