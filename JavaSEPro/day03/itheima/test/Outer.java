package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/18 8:59
 * @Description:
 */
public class Outer {
     private int num1  = 10;
     private int num2 = 20;
     private void show2(){
         System.out.println("我是外部类的show2方法");
         Inner inner = new Inner();
         inner.show1();
     }
     public class Inner{
         /*
           外部类想访问内部类的时候,创建对象
           内部类想访问外部类的时候,属性还是行为,可以直接访问
         * */
         private int num3 = 10;
         private int num4 = 20;
         public void show1(){
             System.out.println("我是内部类的show1方法"+num2);
         }
     }
}
