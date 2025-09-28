package com.itheima.HomeWork.homeWork01;

public class Worker extends Person{
    private String unit;
    private int workAge;

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子！");
    }

    public Worker(String name, char gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker() {}
}
