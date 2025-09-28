package com.itheima.test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/21 11:29
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        int [] arr = {2,6,9,12,15,36,75,96};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数字:");
        int number = sc.nextInt();
        int i = Arrays.binarySearch(arr, number);
        System.out.println(i);
    }
}
