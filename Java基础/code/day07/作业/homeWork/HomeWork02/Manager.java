package com.itheima.homeWork.HomeWork02;

public class Manager {
    private String name;
    private  int id;
    private double salary;
    private double bonus;



    public void work(){
        System.out.println("工号为" +
                this.id + "基本工资为" +
                this.salary + "奖金为" +
                this.bonus
                + "的项目经理"+this.name+"正在努力的做着管理工作,分配任务，检查员工提交上来的代码....");
    }



    public Manager() {}

    public Manager(String name,int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
