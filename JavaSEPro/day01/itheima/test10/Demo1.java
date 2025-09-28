package com.itheima.test10;

/**
 * @Author:gy
 * @Date: 2025/08/15 17:13
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.discipline = "杭州师范";
        Teacher.discipline = "浙江理工";
        t1.setDiscipline("javaEE");
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        System.out.println(t1.getDiscipline());
        System.out.println(t2.getDiscipline());
        System.out.println(t3.getDiscipline());
    }
}
