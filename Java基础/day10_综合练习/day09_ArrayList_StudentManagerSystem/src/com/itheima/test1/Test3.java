package com.itheima.test1;

import java.util.Random;

/**
 * @author 陈辉
 * @data 2025 16:32
 */

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                int redNum = r.nextInt(33) + 1;
                // 判断当前号码是否重复
                boolean exists = isExists(redNum, arr);
                if (!exists) {
                    arr[i] = redNum;
                } else {
                    i--;
                }
            } else {
                int blueNum = r.nextInt(16) + 1;
                arr[i] = blueNum;
            }
        }

        System.out.println("本次机打号码为：");
        System.out.print("红球：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + "  ");
            } else {
                System.out.println(" 蓝球：" + arr[i]);
            }
        }


    }

    public static boolean isExists(int redNum, int[] arr) {
        // 假设不存在
        boolean res = false;

        for (int i = 0; i < arr.length; i++) {
            if (redNum == arr[i]) {
                res = true;
                break;
            }
        }

        return res;
    }
}
