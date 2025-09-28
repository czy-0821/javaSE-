package com.itheima.array;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 16:11
 *
 * 数组常见操作：求和
 *
 * 请输入第1个数[1, 10]：
 * 11
 * 输入的数据不在有效范围内，请重新输入：
 * 请输入第1个数[1, 10]：
 * 22
 * 输入的数据不在有效范围内，请重新输入：
 * 请输入第1个数[1, 10]：
 * 5
 * 请输入第2个数[1, 10]：
 * 10
 * ...
 */

public class Demo09 {
    public static void main(String[] args) {
        //1. 定义一个数组，用来存储5个数
        int[] arr = new int[5];

        //2. 遍历数组，往每个索引位置键盘录入元素
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            int num = sc.nextInt();

            if(num >= 1 && num <= 10) {
                arr[i] = num;
            }else{
                System.out.println("输入的数据不在有效范围内，请重新输入：");
                i--;   // 循环回退
            }
        }

        // 3. 数组元素求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
    }
}
