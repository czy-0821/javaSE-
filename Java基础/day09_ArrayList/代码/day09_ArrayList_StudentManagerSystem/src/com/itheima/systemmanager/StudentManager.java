package com.itheima.systemmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 11:27
 * <p>
 * 学生信息管理系统
 */
public class StudentManager {
    public static void main(String[] args) {
        // 0. 定义一个集合，用来管理系统所有数据
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            // 1. 搭建功能菜单
            System.out.println("--------欢迎来到学生管理系统--------\n" +
                    "1 添加学生\n" +
                    "2 删除学生\n" +
                    "3 修改学生\n" +
                    "4 查看学生\n" +
                    "5 退出\n" +
                    "请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String option = sc.next();

            switch (option) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    findAllStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用...");
                    // return;
                    System.exit(0);   // 终止当前虚拟机
                default:
                    System.out.println("指令有误!");
                    break;
            }
        }
    }


    // 添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        // 1. 采集用户输入的学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id;
        while (true) {
            id = sc.next();
            // 1.1 校验学号唯一性
            int index = idIsExists(id, list);  // Alt + Enter: 快速补全代码
            if (index == -1) {
                // 不存在：id可用
                break;
            } else {
                // 存在，提示：当前学号已被占用，请重新输入
                System.out.println("当前学号已被占用，请重新输入：");
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();

        // 2. 封装学生对象
        Student stu = new Student(id, name, age, birthday);

        // 3. 将学生对象添加到集合list中
        list.add(stu);
        System.out.println("添加成功!");
    }

    // 查找id在指定集合中是否存在,存在：返回有效索引，不存在，返回：-1
    public static int idIsExists(String id, ArrayList<Student> list) {
        // 标记位：假设不存在
        int index = -1;
        // 遍历查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id.equals(stu.getId())) {
                // 修改标记，记录当前学生对象在集合list中的索引值
                index = i;
                break;
            }
        }

        return index;
    }


    // 查看学生方法
    public static void findAllStudent(ArrayList<Student> list) {
        // 1. 判断当前系统是否有数据
        if (list.size() < 1) {
            // 没有：给出提示即可
            System.out.println("系统暂无信息，请添加后重试!");
        } else {
            // 有：遍历集合，展示数据
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }

    // 删除学生方法
    public static void deleteStudent(ArrayList<Student> list) {
        // 1. 拿到要删除的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String delId = sc.next();

        // 2. 判断delId在集合list中是否存在，存在：删除， 不存在：给出错误提示!
        int index = idIsExists(delId, list);
        if (index == -1){
            System.out.println("查无信息，请重试!");
        }else{
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    // 修改学生方法
    public static void updateStudent(ArrayList<Student> list) {
        // 1. 拿到要删除的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String updateId = sc.next();
        // 2. 判断delId在集合list中是否存在，存在：删除， 不存在：给出错误提示!
        int index = idIsExists(updateId, list);
        if (index == -1){
            System.out.println("查无信息，请重试!");
        }else{
            System.out.println("请输入新姓名：");
            String name = sc.next();
            System.out.println("请输入新年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新生日：");
            String birthday = sc.next();

            // 3. 封装学生对象
            Student newStu = new Student(updateId, name, age, birthday);
            // 4. 拿新的学生对象替换集合中老的学生对象，从而实现修改效果
            list.set(index,newStu);
            System.out.println("修改成功!");
        }
    }

}
