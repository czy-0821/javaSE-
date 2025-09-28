package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/21 16:49
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.setAge(160);
        } catch (AgeisOutOfRangeException e) {
            e.printStackTrace();
        }
        s1.setName("小帅");
        System.out.println(s1);
    }
}
