package com.itheima.HomeWork.homeWork01;

public class Student extends Person{
    private String school;
    private String stuNumber;

    @Override
    public void work() {
        System.out.println("学生需要学习！");
    }

    public Student(String name, char gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student() {}

}
