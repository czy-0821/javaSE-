package com.itheima.HomeWork.homeWork02;

public class Manager extends Woker{
    private double bonus;

    public Manager(String name, String wordId, double salary, double bonus) {
        super(name, wordId, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理-" + getName() + "-" + getWordId() + "-" + getSalary() + "-" + getBonus());
        System.out.println("经理管理程序员~~");
    }
}
