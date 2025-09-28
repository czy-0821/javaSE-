package com.itheima.HomeWork.homeWork03;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("王二", 18);
        Dog dog = new Dog(2, "黑色");
        Cat cat = new Cat(2, "白色");

        person.keepPet(dog,"烤乳猪");
        dog.lookHome();
        person.keepPet(cat,"咸鱼");
        cat.catchMouse();
    }
}
