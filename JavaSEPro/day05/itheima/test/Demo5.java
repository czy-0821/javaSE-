package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/21 9:45
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        //有一个字符串: "91 27 46 38 50",将其中的每一个数取出来存到数组中并求和.
        String s = "91 27 46 38 50";
        //切割
        String[] s1 = s.split(" ");
        int [] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            //取出来的是字符串  将字符串变成int
            arr[i] = Integer.parseInt(s1[i]);
        }

        //int类型的数组就有值
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("和是"+sum);
    }
}
