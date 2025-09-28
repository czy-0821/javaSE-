package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:26
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog("小爆", 12);
        Cat cat = new Cat();
        cat.setName("xiaomei");
        cat.setAge(10);
        System.out.println(d.getName()+"---"+d.getAge());
        cat.eat();
        cat.catchMouse();
    }
}
