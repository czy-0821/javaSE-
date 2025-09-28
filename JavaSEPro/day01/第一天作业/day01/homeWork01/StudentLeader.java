package com.itheima.HomeWork.homeWork01;

public class StudentLeader extends Student{
    private String job;

    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }

    public StudentLeader(String name, char gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public StudentLeader() {}
}
