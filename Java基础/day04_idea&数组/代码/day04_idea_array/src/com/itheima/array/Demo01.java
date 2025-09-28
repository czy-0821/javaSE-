package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 11:29
 *
 * 数组动态初始化
 */

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        /*
            [I@3b6eb2ec
            [ : 表示是一个数组
            I : 表示数组中的元素是int类型
            @ ： 固定的分隔符
            3b6eb2ec : 16进制内存模拟地址
         */
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 99;
        arr[1] = 98;
        arr[2] = 97;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
