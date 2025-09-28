package com.itheima.test;

import java.util.ArrayList;

/**
 * @Author:gy
 * @Date: 2025/08/24 9:46
 * @Description:
 */
public class Dmeo1 {
    public static void main(String[] args) {
        //存储学生对象的 集合
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("张三",22));
        al.add(new Student("李四",26));
        al.add(new Student("张翠山",38));
        al.add(new Student("赵六",19));
        al.add(new Student("张三丰",103));
        al.add(new Student("张无忌",17));
        al.add(new Student("赵敏",16));
        ArrayList<Student> newAl =getStudent(al);
        for (Student student : newAl) {
            System.out.println(student);
        }
    }

    private static ArrayList<Student> getStudent(ArrayList<Student> al) {
        //创建 一个新集合存储符合条件的学生对象
        ArrayList<Student> newAl = new ArrayList<>();
        //对老集合进行判断  筛选出符合条件的学生对象
        for (int i = 0; i < al.size(); i++) {
            Student student = al.get(i);
            if(student.getName().startsWith("张")&&student.getAge()>18){
                newAl.add(student);
            }
        }
        return newAl;
    }
}
