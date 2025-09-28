package com.itheima.test;

import java.math.BigDecimal;

/**
 * @Author:gy
 * @Date: 2025/08/21 8:54
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        //我们想到的是先求和  在除以长度
        //int sum = 0;
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < arr.length; i++) {
            //sum+=i;
            sum = sum.add(new BigDecimal(arr[i]));
        }
        //此时的sum 就是一个精确的值
        BigDecimal avg = sum.divide(new BigDecimal(arr.length), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(avg);
    }
}
