package com.itheima.test2;

import java.util.HashSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 10:10
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //现在我认为 名字和年龄相同  应该就是一个人
        Student s1 = new Student("小帅", 23);
        Student s2 = new Student("小帅", 23);
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.forEach(student -> System.out.println(student));
    }
}
