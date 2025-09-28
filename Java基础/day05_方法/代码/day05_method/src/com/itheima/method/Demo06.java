package com.itheima.method;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 14:39
 * <p>
 * return的用法
 */

public class Demo06 {
    public static void main(String[] args) {
        String[] students = new String[5];


        while (true) {
            System.out.println("-----------------欢迎来到学生信息管理系统----------------");
            System.out.println("1. 添加学生信息");
            System.out.println("2. 删除学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查看学生信息");
            System.out.println("5. 退出");
            Scanner sc = new Scanner(System.in);
            String option = sc.next();

            switch (option) {
                case "1":
                     addStudent(students);
                    break;
                case "2":
                    System.out.println("删除学生逻辑....");
                    break;
                case "3":
                    System.out.println("删除学生逻辑....");
                    break;
                case "4":
                    findAllStudent(students);
                    break;
                case "5":
                    System.out.println("感谢你的使用，再见!");
                    //break;
                    return;   // 结束方法
                default:
                    System.out.println("指令有误!");
                    break;
            }

        }
    }

    //添加功能
    public static void addStudent(String[] students){

    }

    //查看功能
    public static void findAllStudent(String[] students){

    }

    // 当方法的返回值类型不是void时，方法体内必须要有return， 而且return后面必须要跟一个符合返回值类型的数据!
    public static int method01(int age) {
        if (age >= 18 && age <= 25) {
            return 10;
        } else if (age > 25 && age <= 35) {
            return 20;
        }
        return 100;
    }


    // 当方法的返回值类型为void ，方法体内可以写return（非必须），如果写的话，return只能单独存在，表示结束当前方法
    public static void method02(){
        System.out.println("hello~~~");
        return;

    }
}
