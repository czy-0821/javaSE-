package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/24 11:23
 * @Description:
 */
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        int result = o.age - this.age;
        result = o.age - this.age == 0?o.name.compareTo(this.name):result;
        return result;
    }
}
