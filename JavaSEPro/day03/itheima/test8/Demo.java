package com.itheima.test8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:gy
 * @Date: 2025/08/18 15:47
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        int [] arr = {80,30,70,40,50,60};
        //引用数据类型形式参数的改变影响实际参数的值  字符串除外
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(arr));
       // int[] ints = Arrays.copyOfRange(arr, 1, 3);
       // int[] ints = Arrays.copyOf(arr, 10);
      //  System.out.println(Arrays.toString(ints));
    }
}
