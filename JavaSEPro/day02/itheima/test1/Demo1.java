package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/16 9:57
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        feed(cat);
        feed(dog);
        feed(pig);
        feed(new Monkey());*/
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        feed(cat);
        feed(dog);
        feed(pig);

    }

    public static void feed(Animal a){
        /*对象   instanceof   类名
            作用是判断左侧的对象是否是右侧的实例,如果是则返回true,如果不是,则返回false
            实例就是对象的意思
        * */
        //如果传过来的参数是Dog这个类的对象,就是true,否则就是false
        if(a instanceof Dog){
            Dog dog = (Dog)a;
            dog.eat();
            dog.lookHome();
        }else if(a instanceof Cat){
            Cat cat = (Cat)a;
            cat.eat();
            cat.catchMouse();
        }else{
            a.eat();
        }
    }
    //定义喂养狗的方法
  /*  public static void feed(Dog dog){
        dog.eat();
    }
    //定义喂养猫的方法
    public static void feed(Cat cat){
        cat.eat();
    }
    //定义喂养猪的方法
    public static void feed(Pig pig){
        pig.eat();
    }*/
}
