package com.itheima.test4;

import java.util.HashMap;

/**
 * @Author:gy
 * @Date: 2025/08/25 14:57
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("小帅", 18);
        Student s2 = new Student("小帅", 18);
        Student s3 = new Student("小美", 19);
        Student s4 = new Student("小李", 16);
        hm.put(s1,"北京");
        hm.put(s2,"广州");
        hm.put(s3,"杭州");
        hm.put(s4,"合肥");
        hm.forEach((k,v)->{
            System.out.println("我叫"+k.getName()+",今年"+k.getAge()+"岁,来自"+v);
        });
    }
}
