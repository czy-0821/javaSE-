package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 11:38
 *
 * 方法练习
 */

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {98, 102, 11, 44, 255, 66, 33};

        int max = getMaxInArray(arr);
        System.out.println("max = " + max);
    }

    // 需求1： 定义一个方法，获取指定int数组中的最大值并返回
    public static int getMaxInArray(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

}
