package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 12:19
 */

public class Demo04 {
    public static void main(String[] args) {
        //左移多少位，本质就是乘以2的几次方
        System.out.println( 2 << 1);            // 00000010 << 1  -->  00000100

        //右移多少位，本质就是除以2的几次方
        System.out.println( 2 >> 1);            // 00000010 >> 1  -->  00000001

        // 无符号右移：无论符号位是0还是1，都补0
        // 10000000 00000000 00000000 00000010 >>> 1  -->  01000000 00000000 00000000 00000001
        System.out.println( -2 >>> 1);
    }
}
