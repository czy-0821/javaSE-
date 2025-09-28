package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:08
 * @Description:
 */
public class People {
    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //父类  共性的内容放在父类
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
