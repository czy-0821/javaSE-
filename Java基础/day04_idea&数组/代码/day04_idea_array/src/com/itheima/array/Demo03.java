package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 14:55
 *
 * 多个数组指向相同
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] brr = arr;
        brr[0] = 33;
        brr[2] = 44;
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(brr[2]);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
