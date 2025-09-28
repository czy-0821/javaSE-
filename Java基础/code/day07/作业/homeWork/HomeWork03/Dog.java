package com.itheima.homeWork.HomeWork03;

public class Dog {
    private char color;
    private String breed;

    public void eat() {
        System.out.println(this.getColor() + "色的" + this.getBreed() + "正在啃骨头....");
    }

    public void lookHome(){
        System.out.println(this.getColor() + "色的" + this.getBreed() + "正在看家....");
    }

    public Dog(char color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Dog() {
    }

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
