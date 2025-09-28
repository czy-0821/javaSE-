package com.itheima.HomeWork.homeWork02;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", "1102", 12000, 3000);
        Programmers programmers = new Programmers("李四", "1134", 15000);

        manager.work();
        programmers.work();
    }
}
