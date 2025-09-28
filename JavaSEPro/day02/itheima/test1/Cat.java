package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/16 9:56
 * @Description:
 */
public class Cat extends Animal{
    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
