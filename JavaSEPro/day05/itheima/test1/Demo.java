package com.itheima.test1;

import java.util.Arrays;

/**
 * @Author:gy
 * @Date: 2025/08/21 10:00
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        // 25  14   9  3  16--->3 9 14 16 25
        int [] arr = {25,14,9,3,16,21,23,8};
        //外层循环控制哪些索引需要往后比
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环控制每一次从哪个索引开始比
            for (int j = i+1; j < arr.length; j++) {
                 //拼接
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
