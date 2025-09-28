package com.itheima.test8;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * @Author:gy
 * @Date: 2025/08/18 16:10
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        double [] arr = {1.0,2.0,3.0,4.0,5.0};
       /* Arrays.setAll(arr, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                //value其实表示的是索引  将数组每个元素扩大两倍
                return arr[value]+2;
            }
        });*/
        //lambda
        Arrays.setAll(arr,index-> arr[index]+2);
        System.out.println(Arrays.toString(arr));
    }
}
