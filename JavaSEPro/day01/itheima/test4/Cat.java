package com.itheima.test4;



/**
 * @Author:gy
 * @Date: 2025/08/15 15:23
 * @Description:
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
