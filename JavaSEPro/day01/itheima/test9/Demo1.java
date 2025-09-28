package com.itheima.test9;

/**
 * @Author:gy
 * @Date: 2025/08/15 16:49
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student(PeiZhi.SCHOOL, "小美");
        Student s2 = new Student(PeiZhi.SCHOOL, "小明");
        Student s3 = new Student(PeiZhi.SCHOOL, "小帅");
        System.out.println(s1.getSchool());
        System.out.println(s2.getSchool());
        System.out.println(s3.getSchool());
    }
}
