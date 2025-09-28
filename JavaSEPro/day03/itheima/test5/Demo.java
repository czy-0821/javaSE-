package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/18 11:11
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //传统的模式 接口不能创建对象 利用多态的形式 创建一个接口子类的对象
        Swim s = new SwimImpl();
        goSwim(s);
        System.out.println("=======");
        goSwim(new Swim() {
            @Override
            public void Swimming() {
                System.out.println("匿名内部类的形式");
            }
        });
        System.out.println("=====================");
        goSwim(()->System.out.println("lambda的游泳"));
    }
    //有一个方法
    public static void goSwim(Swim s){
             s.Swimming();
    }
}
