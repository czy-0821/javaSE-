package com.itheima.test1;



/**
 * @Author:gy
 * @Date: 2025/08/15 10:53
 * @Description:
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String brand, int age) {
        super(name, brand, age);
    }

    public void lookHome(){
        System.out.println("看家");
    }
    //注解  Override 作用是检测当前这个方法是否是一个正确的重写方法,如果不是,则报错 强烈建议加上
    //推荐一个快捷键  Ctrl+o

   @Override
    public  void eat() {
        System.out.println("还要吃骨头");
    }
}
