package com.itheima.HomeWork.homeWork02;

public class Programmers extends Woker{
    public Programmers(String name, String wordId, double salary) {
        super(name, wordId, salary);
    }

    public Programmers() {
    }

    @Override
    public void work() {
        System.out.println("程序员-" + getName() + "-" + getWordId() + "-" + getSalary() );
        System.out.println("程序员写代码");
    }
}
