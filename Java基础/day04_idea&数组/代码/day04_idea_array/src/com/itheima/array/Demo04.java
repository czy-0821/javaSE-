package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 15:11
 *
 * 数组静态初始化
 */

public class Demo04 {
    public static void main(String[] args) {
        // 静态初始化完整格式
        int[] arr = new int[]{11, 22, 33, 44};

        //  静态初始化简化格式
        int[] brr = {55, 66, 77};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(brr[2]);
    }
}
