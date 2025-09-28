package com.itheima.homeWork.HomeWork02;

public class HomeWork02 {
    public static void main(String[] args) {

        Manager manager = new Manager("张三",123,15000,6000);

        //new Coder("王麻子",135,10000);
        Coder coder = new Coder();
        coder.setId(135);
        coder.setName("王麻子");
        coder.setSalary(10000);

        manager.work();

        coder.work();
    }
}
