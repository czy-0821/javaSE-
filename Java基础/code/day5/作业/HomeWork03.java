package com.itheima.HomeWork;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组大小:");
        int len = sc.nextInt();

        int [] list = new int[len];

        for (int i = 0; i < list.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            list[i] = sc.nextInt();
        }
        int[] maxandmin = MaxAndMin(list);
        System.out.println("数组中最大值:" + maxandmin[0] + ",数组中最小值:" + maxandmin[1]);
    }
    public static int[] MaxAndMin(int[] arr) {
        int[] maxandmin = new int[2];
        maxandmin[0] = arr[0];
        maxandmin[1] = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxandmin[0]) {
                maxandmin[0] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=maxandmin[1]) {
                maxandmin[1] = arr[i];
            }
        }

        return maxandmin;
    }
}
