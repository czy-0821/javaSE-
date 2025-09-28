package com.itheima.test9;

/**
 * @Author:gy
 * @Date: 2025/08/15 17:08
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        //被final修饰的引用数据类型  指的是地址不可变
       final int [] arr = {1,2,3,4,5};
       arr[1] = 20;
      // arr = new int[10];  报错
    }
}
