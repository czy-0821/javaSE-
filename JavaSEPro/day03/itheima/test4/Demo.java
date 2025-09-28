package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/18 10:37
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        /*
        前提:是一个Inner接口,希望实现它,想用他的抽象方法
        1.创建了实现类,去实现这个接口
        2.重写了show方法
        3.在测试类中创建实现类的对象
        4.调用重写的show方法
        但是我们用匿名内部类可以简化这四步,简化为一步到位
        * */
        InnerImpl inner = new InnerImpl();
        inner.show();
        inner.show2();
        System.out.println("========================");
        //匿名内部类的本质就是一个实现了Inner接口的实现类对象
        /*
         new:创建对象的意思  肯定创建了一个对象
         Inner():接口创建不了对象的,但是这段代码没报错,所以创建的肯定是这个接口的实现类对象
           {
                方法的重写
            }
            .show():调用重写后的方法
        * */
        new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类show");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类show2");
            }
        }.show();
    }
}
