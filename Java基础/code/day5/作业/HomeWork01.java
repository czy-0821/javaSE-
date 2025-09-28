package com.itheima.HomeWork;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            list[i] = sc.nextInt();
        }
        int min = FindMin(list[0], list[1], list[2]);
        System.out.println("三个数中最小数为:" + min);
    }
    public static int FindMin(int num1,int num2,int num3){
        int min=num1;

        min= Math.min(num1, num2);

        min= Math.min(min, num3);

        return min;
    }
}
