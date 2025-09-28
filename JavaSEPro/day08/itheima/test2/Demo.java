package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/25 9:42
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //哈希值  是jdk根据对象地址或者属性值,算出来的一个int类型的整数
        System.out.println("Aa".hashCode());//2112
        System.out.println("BB".hashCode());//2112
        Student student1 = new Student("小美",21);
        Student student2 = new Student("小美",21);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());


    }
}
