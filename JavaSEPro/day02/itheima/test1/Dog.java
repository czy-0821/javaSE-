package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/16 9:14
 * @Description:
 */
public class Dog extends Animal{
    int num = 20;
    int num2 = 2000;
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
