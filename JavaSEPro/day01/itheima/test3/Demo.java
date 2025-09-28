package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:13
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student("小明", 29, "heima001");
        Teacher teacher = new Teacher();
        teacher.setName("小美");
        teacher.setAge(26);
        teacher.setWid("79028");
        System.out.println(student.getName()+"---"+student.getAge()+"--"+student.getSid());
        teacher.eat();
        teacher.teach();
    }
}
