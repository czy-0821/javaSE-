package com.itheima.test4;

import java.math.BigDecimal;

/**
 * @Author:gy
 * @Date: 2025/08/19 11:20
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("10.0");
        BigDecimal b2 = new BigDecimal("4");
         // BigDecimal b3 = b1.add(b2);
         // BigDecimal b3 = b1.subtract(b2);
        //BigDecimal b3 = b1.multiply(b2);
        BigDecimal b3 = b1.divide(b2,40,BigDecimal.ROUND_HALF_UP);
        System.out.println(b3);  //  3.496
    }
}
