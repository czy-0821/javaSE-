package com.itheima.test3;

import java.util.Objects;

/**
 * @Author:gy
 * @Date: 2025/08/19 10:16
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("小美",28);
        student1 = null;
        Student student2 = new Student("小美",21);
      /*  boolean equals = student1.equals(student2);
        System.out.println(equals);*/
        //System.out.println(student1==student2);
       /* String string = Objects.toString(student1,"你好");
        System.out.println(string);*/
        /*boolean aNull = Objects.isNull(student1);
        boolean bNull = Objects.isNull(student2);*/
        boolean aNull = Objects.nonNull(student1);
        boolean bNull = Objects.nonNull(student2);
        System.out.println(aNull);
        System.out.println(bNull);
    }
}
