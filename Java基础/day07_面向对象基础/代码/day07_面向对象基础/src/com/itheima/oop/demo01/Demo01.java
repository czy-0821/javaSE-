package com.itheima.oop.demo01;

/**
 * @author 陈辉
 * @data 2025 10:13
 *
 * 测试类
 */

public class Demo01 {
    public static void main(String[] args) {
        // 创建Student类的对象
        Student stu = new Student();

        // 使用对象访问成员
        System.out.println(stu.name);  // null
        System.out.println(stu.age);   // 0

        stu.study();
    }
}
