package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 11:04
 *
 * ArrayList存储自定义类型数据并遍历
 */

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = getStu();
        Student stu2 = getStu();
        Student stu3 = getStu();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            stu.show();
        }

    }

    // 封装一个方法：键盘录入学生信息，封装学生对象并返回
    public static Student getStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        Student stu = new Student(name,age);
        return stu;
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
