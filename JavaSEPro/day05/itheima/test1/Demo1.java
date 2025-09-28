package com.itheima.test1;

import java.util.Arrays;

/**
 * @Author:gy
 * @Date: 2025/08/21 10:31
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        // 25  14   9  3  16--->3 9 14 16 25
        int [] arr = {25,14,9,3,16,21,23,8};
        //外层循环控制一共冒泡了几次  长度为5 冒泡4次   0 1 2 3
        for (int i = 0; i < arr.length-1; i++) {
            //每一次冒泡几下   0-4   1-3  2--2  3--1
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                //比较和交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
