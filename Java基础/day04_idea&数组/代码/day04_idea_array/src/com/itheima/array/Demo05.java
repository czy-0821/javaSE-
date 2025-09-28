package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 15:17
 *
 * 数组使用常见的两个小问题
 */

public class Demo05 {
    public static void main(String[] args) {
        // 1. 索引越界: 访问不存在的索引
        int[] arr = new int[3];
        System.out.println(arr[2]);  // ArrayIndexOutOfBoundsException

        // 2. 空指针异常：NullPointerException
        arr = null;             // null 赋值给任意引用类型变量
        System.out.println(arr[0]);
    }
}
