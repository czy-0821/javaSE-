package com.itheima.test1;

import org.w3c.dom.ls.LSOutput;

/**
 * @Author:gy
 * @Date: 2025/08/18 9:40
 * @Description:
 */
public class Outer {
    int num = 10;
    public void show2(){
        Inner inner = new Inner();
        inner.show1();
    }
    public void getInner(){
        Inner inner = new Inner();
        inner.show1();
    }
    private class Inner{
        int num = 20;
        public void show1(){
            System.out.println("我是私有内部类的show1方法");
        }
    }
}
