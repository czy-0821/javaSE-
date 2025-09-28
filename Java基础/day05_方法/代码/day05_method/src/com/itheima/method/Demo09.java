package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 16:02
 */

public class Demo09 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);

        System.out.println("------------");

        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);
        System.out.println("调用change方法后:" + arr[1]);
    }

    // 核心结论： 如果方法调用，传递的是基本数据类型，形参的改变，不会影响实参。
    public static void change(int a) {
        a = 200;
    }


    /*
       方法参数传递为引用数据类型 :
              传入方法中的, 是内存地址.
   */
    // 核心结论： 如果方法调用，传递的是引用数据类型，形参的改变，会影响实参。
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
