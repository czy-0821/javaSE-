package com.itheima.test1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 陈辉
 * @data 2025 14:31
 */

public class Test1 {
    public static void main(String[] args) {
        // 1. 定义一个数组，收集100个0-9的随机数
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }

        System.out.println("生成的数组内容为："+Arrays.toString(arr));
        System.out.println("---------------------");

        // 2. 统计每个数出现的次数并打印
        for (int i = 0; i <= 9; i++) {
            // 定义一个计数器变量，维护当前数的次数
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]){
                    count++;
                }
            }

            // 打印当前i的次数
            System.out.println(i+ "出现了：" + count + "次!");
        }

    }
}
