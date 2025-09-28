package com.itheima.string;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 14:53
 *
 * 字符串的切割  -- split
 */

public class Demo06 {
    public static void main(String[] args) {
        //1. 键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String msg = sc.next();

        //2. 切割字符串：以逗号作为分割点
        // 注意点：对于一些特殊符号，需要进行转义处理
        String[] split = msg.split("\\.");
        //3. 封装学生信息
        Student stu = new Student();
        stu.setName(split[0]);
        stu.setAge(Integer.parseInt(split[1]));
        stu.show();
    }
}

class Student{
    private String name;
    private int age;

    public void show(){
        System.out.println(name + "..." + age);
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

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
