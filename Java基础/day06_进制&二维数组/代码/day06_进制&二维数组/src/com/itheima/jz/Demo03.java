package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 12:01
 */

public class Demo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //交换 a 和 b 的值？
        /*
            int temp = a;       // temp = 10;
            a = b;              // a = 20;
            b = temp;           // b = 10;
        */

        System.out.println("交换前：a = " + a);
        System.out.println("交换前：b = " + b);

        //需求：不容许使用第三个变量，实现a和b的交换?
        a = a ^ b;          // a = 10 ^ 20
        // 特点：一个数被另一个数异或两次，等于原数本身!
        b = a ^ b;          // b = 10 ^ 20 ^ 20   -->  b = 10
        a = a ^ b;          // a = 10 ^ 20 ^10    -->  a = 20

        System.out.println("交换后：a = " + a);
        System.out.println("交换后：b = " + b);

    }
}
