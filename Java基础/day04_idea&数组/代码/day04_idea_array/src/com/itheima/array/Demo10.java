package com.itheima.array;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 16:35
 */

public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        // 1. 键盘录入要查找的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int num = sc.nextInt();
        // 2. 标记位思想： 先假设一种情况
        // 2.1 假设录入的num在数组arr中不存在
        int index = -1;
        // 2.2 遍历查找
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                //修改标记
                index = i;
                break;
            }
        }
        // 3. 根据index来判定要查找的元素是否存在
        if (index == -1) {
            System.out.println(num + "在数组中不存在!");
        } else {
            System.out.println(num + "在数组中存在,索引位置：" + index);
        }

    }
}
