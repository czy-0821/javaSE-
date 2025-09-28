package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 15:51
 *
 * 数组常用操作：遍历
 */

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};

        // 数组通用遍历格式
        // 快捷写法： 数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
