package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:10
 * @Description:
 */
public class Student extends People{
    private String Sid;

    public Student() {
    }

    public Student(String name, int age, String sid) {
        super(name, age);
        Sid = sid;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }
    public void study(){
        System.out.println("学习");
    }
}
