package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:23
 * @Description:
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
