package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/25 17:39
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
         int a = 1;
         int b = 2;
         int c = 3;
        System.out.println(getSum(3.14,a,14,25,36));
        System.out.println(getSum(a, b));
        System.out.println(getSum(a, b, c));
    }

    public static int getSum(double d ,int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
