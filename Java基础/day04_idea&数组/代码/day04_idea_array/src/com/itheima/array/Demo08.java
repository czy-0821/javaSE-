package com.itheima.array;

/**
 * @author 陈辉
 * @data 2025 16:01
 * <p>
 * 数组常见操作：求最值
 */

public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};

        // 1. 先让数组中的第一个元素充当最大值  -- 假设
        int max = arr[0];

        // 2. 遍历查找
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        // 3. 打印max即可
        System.out.println("max = " + max);
    }
}
