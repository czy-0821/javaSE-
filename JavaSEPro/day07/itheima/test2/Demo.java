package com.itheima.test2;

import com.itheima.test1.People;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 11:24
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        /*TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            *//*
               o1表示即将要存入的元素
               o2表示已经存在的元素
            * *//*
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //主要条件
               int result =   o1.getAge()-o2.getAge();
               result = result == 0? o1.getName().compareTo(o2.getName()): result;
               return result;
            }
        });*/
        TreeSet<Teacher> ts = new TreeSet<>((o1,o2)->{
            //主要条件
            int result =   o1.getAge()-o2.getAge();
            result = result == 0? o1.getName().compareTo(o2.getName()): result;
            return result;
        });
        Teacher p1 = new Teacher("小帅", 28);
        Teacher p2 = new Teacher("小美", 26);
        Teacher p3 = new Teacher("小华", 28);
        Teacher p4 = new Teacher("小王", 25);
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.forEach(s-> System.out.println(s));
    }
}
