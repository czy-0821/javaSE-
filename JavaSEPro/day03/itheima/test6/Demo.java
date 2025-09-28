package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/18 14:54
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //传统的方式
        SwimImpl s = new SwimImpl();
        swim(s);
        //匿名内部类的方法
        swim(new Swim() {
            @Override
            public void swimming(String name) {
                System.out.println("匿名内部类的"+name+"去游泳了");
            }
        });
        //lanbda表达式
        swim(name-> System.out.println("lambda的"+name+"去游泳了"));
    }
    public static void swim(Swim s){
        s.swimming("张三");
    }
}
