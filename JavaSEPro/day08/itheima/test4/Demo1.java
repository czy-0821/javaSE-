package com.itheima.test4;

import java.util.Comparator;
import java.util.TreeMap;


/**
 * @Author:gy
 * @Date: 2025/08/25 16:20
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
      /*  TreeMap<Student,String> tm = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() -o1.getAge();
                return result != 0 ? result : o2.getName().compareTo(o1.getName());
            }
        });*/
        TreeMap<Student,String> tm = new TreeMap<>((o1,o2)->{
            int result = o2.getAge() -o1.getAge();
            return result != 0 ? result : o2.getName().compareTo(o1.getName());
        });
        Student s4 = new Student("小李", 16);
        Student s1 = new Student("小帅", 18);
        Student s2 = new Student("小帅", 18);
        Student s3 = new Student("小美", 19);
        tm.put(s4,"合肥");
        tm.put(s1,"北京");
        tm.put(s2,"广州");
        tm.put(s3,"杭州");

        tm.forEach((k,v)->{
            System.out.println("我叫"+k.getName()+",今年"+k.getAge()+"岁,来自"+v);
        });

    }
}
