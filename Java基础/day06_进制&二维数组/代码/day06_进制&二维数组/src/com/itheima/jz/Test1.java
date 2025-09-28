package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 14:43
 */

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
