package com.itheima.test10;

/**
 * @Author:gy
 * @Date: 2025/08/15 17:11
 * @Description:
 */
public class Teacher {
    static String discipline = "java";
    int age;
    public static void method(){
       // System.out.println(age);
        System.out.println(discipline);
    }
    public Teacher() {
    }

    public Teacher(String discipline, int age) {
        this.discipline = discipline;
        this.age = age;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
