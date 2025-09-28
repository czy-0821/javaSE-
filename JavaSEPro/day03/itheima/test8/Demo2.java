package com.itheima.test8;

import java.util.ArrayList;

/**
 * @Author:gy
 * @Date: 2025/08/18 16:22
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        //适配器模式  我们指向用show4方法
      /*  A1 a1 = new A1();
        a1.show4();*/
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //lambda
        list.forEach(a-> System.out.println(a));
    }
}
