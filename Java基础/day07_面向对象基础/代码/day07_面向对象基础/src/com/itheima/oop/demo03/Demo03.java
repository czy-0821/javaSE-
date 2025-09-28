package com.itheima.oop.demo03;

/**
 * @author 陈辉
 * @data 2025 10:13
 *
 * 测试类
 */

public class Demo03 {
    public static void main(String[] args) {
        // 创建Student类的对象
        Student stu = new Student();
        stu.setName("光头强");
        stu.setAge(23);

        // 使用对象访问成员
        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        stu.study();
    }
}
