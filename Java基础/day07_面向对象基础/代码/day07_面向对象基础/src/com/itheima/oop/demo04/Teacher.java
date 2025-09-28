package com.itheima.oop.demo04;

/**
 * @author 陈辉
 * @data 2025 11:56
 *
 *  构造方法注意事项：
 *      1. 当一个类中没有构造时，jvm会自动赠送一个无参构造给我们
 *      2. 当一个类中有构造时，jvm不会再赠送无参构造给我们
 *      3. 未来定义标准的JavaBean类时，应该既定义无参构造，也要手动定义满参构造!
 */

public class Teacher {
    private String name;
    private int age;

    // 构造方法
    // 作用：用来结合new关键字创建对象使用的!
    public Teacher(){
        System.out.println("无参构造执行了....");
    }

    // 满参构造作用：创建对象的同时，给所有属性完成赋值。
    public Teacher(String name,int age){
        System.out.println("满参构造执行了....");
        this.name = name;
        this.age = age;
    }

    // 快速生成get/set方法： 右键 --> generate --> getter and setter
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
        this.age = age;
    }
}

// 测试类
class Demo04{
    public static void main(String[] args) {
        // 一个对象只能执行一次构造方法，在一开始被创建时
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setAge(23);
        System.out.println(t1.getName() + "..." + t1.getAge());


        Teacher t2 = new Teacher("李四",24);
        System.out.println(t2.getName() + "..." + t2.getAge());
    }
}
