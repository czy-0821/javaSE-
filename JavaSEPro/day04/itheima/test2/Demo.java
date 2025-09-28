package com.itheima.test2;

import java.util.Arrays;

/**
 * @Author:gy
 * @Date: 2025/08/19 10:00
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[10];
        //System.arraycopy(arr1,1,arr2,2,3);
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
}
