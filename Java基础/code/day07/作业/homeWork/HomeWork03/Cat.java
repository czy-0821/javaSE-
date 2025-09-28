package com.itheima.homeWork.HomeWork03;

public class Cat{
    private char color;
    private String breed;


    public void eat() {
        System.out.println(this.getColor() + "色的" + this.getBreed() + "正在吃鱼....");
    }

    public void catchMouse(){
        System.out.println(this.getColor() + "色的" + this.getBreed() + "正在逮老鼠....");
    }


    public Cat(char color, String breed) {
        this.color =color;
        this.breed =breed;
    }

    public Cat(){}


    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
