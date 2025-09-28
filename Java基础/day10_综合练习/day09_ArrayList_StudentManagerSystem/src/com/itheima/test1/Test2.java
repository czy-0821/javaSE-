package com.itheima.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 15:41
 */

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三","heima001",66.6);
        Student stu2 = new Student("李四","heima002",77.7);
        Student stu3 = new Student("王五","heima003",55.5);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        System.out.println("集合信息如下：");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }

        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }
        System.out.println("平均成绩为：" +(sum / list.size()));


        Student max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getScore() > max.getScore()){
                max = stu;
            }
        }
        System.out.println("成绩最高的学生信息如下：");
        max.show();

        System.out.println("请输入一个分数：");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getScore() >= score){
                if (++count == 1){
                    System.out.println("分数高于"+score+"的学生信息如下：");
                }

                stu.show();
            }
        }

        if (count == 0){
            System.out.println("当前集合中没有分数高于"+ score+"的学生!");
        }


    }
}

class Student{
    private String name;
    private String id;
    private double score;

    public void show(){
        System.out.println(name + "..." + id + "..." + score);
    }


    public Student() {
    }

    public Student(String name, String id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
