package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 15:02
 */

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        change(arr, 1, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void change(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
