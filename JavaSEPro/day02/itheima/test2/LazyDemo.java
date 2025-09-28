package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/16 11:05
 * @Description:
 */
public class LazyDemo {
    private static LazyDemo instance;
    //懒汉式  懒加载的模式  延迟加载
    private LazyDemo() {
    }
    //对外提供一个可以创建对象的方法
    public static synchronized LazyDemo getInstance(){
        //健壮性判断  判断当前这个对象是否被创建  线程不安全的问题
        if(instance==null){
            instance = new LazyDemo();
        }
        return instance;
    }

    public void getSum(){
        System.out.println("sum");
    }
}
