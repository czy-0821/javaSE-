package com.itheima.homework.homework03;

/**
 * @author 陈辉
 * @data 2025 15:41
 */
// 猫类
public class Cat {
    private String color;       // 毛的颜色
    private String breed;       // 品种

    // 吃饭
    public void eat() {
        System.out.println(color + "的" + breed + "正在吃鱼...");
    }

    // 抓老鼠
    public void catchMouse() {
        System.out.println(color + "的" + breed + "正在逮老鼠...");
    }


    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}


class Dog{
    private String color;       // 毛的颜色
    private String breed;       // 品种

    // 吃饭
    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头...");
    }

    // 看家
    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家...");
    }


    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}