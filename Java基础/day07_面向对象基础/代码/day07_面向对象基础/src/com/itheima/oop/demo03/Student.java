package com.itheima.oop.demo03;

/**
 * @author 陈辉
 * @data 2025 10:11
 */

public class Student {
    // 属性：有什么   -- 成员变量
    private String name;
    private int age;


    public void setName(String name){
        /*
            java中有就近访问原则： 局部优先
            要打破这种就近原则，就得使用this关键字
            使用this.变量名指代的就是成员变量!
         */
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age < 0 || age > 150){
            System.out.println("年龄数据不合法!");
        }else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    // 行为：能做什么   -- 成员方法
    public void study(){
        System.out.println("好好学习，天天向上!");
    }
}
