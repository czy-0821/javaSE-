package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/16 8:59
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("小美", 18);
        Cat c1 = new Cat(6, "橘黄");
        Dog d1 = new Dog(7, "白色");
        p1.keepPet(c1,"鱼");
        p1.keepPet(d1,"骨头");
    }
}
