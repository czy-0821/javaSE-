package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/21 16:46
 * @Description:
 */
public class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=150){
            this.age = age;
        }else{
           // System.out.println("年龄输入错误....");
            throw new AgeisOutOfRangeException("年龄超过了范围");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
