package com.itheima.test1;



/**
 * @Author:gy
 * @Date: 2025/08/15 10:53
 * @Description:
 */
public class Cat extends Animal {
   public Cat() {
        /*系统会在所有类构造方法中的第一行加上super()
        super就是标识调用父类的无参构造
        为什么要这么干?
        构造方法的作用是创建对象,没有构造方法就不能创建对象
        给成员变量初始化赋值,子类继承父类,是有可能会用到父类的成员变量,因为变量在使用前需要先赋值,
        所以赋值操作(初始化,默认值),是有构造方法来解决的,所以创建子类对象之前,需要先给父类的成员变量赋值,所以会先访问父类的无参构造.
        //super();*/
       //this是调用自己的构造方法  他也必须在第一行
       ///System.out.println("k");
       // this("h","d",23);
        super();
        System.out.println("子类的无参构造");
    }

    public Cat(String name, String brand, int age) {
        super(name, brand, age);
    }

    public void CatchMouse(){
        System.out.println("抓老鼠");
    }
}
