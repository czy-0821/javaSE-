package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/16 8:55
 * @Description:
 */
public class Person {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
    //行为
    public void keepPet(Dog dog,String something){
         dog.eat(something);
    }
    public void keepPet(Cat cat,String something){
        cat.eat(something);
    }

}
