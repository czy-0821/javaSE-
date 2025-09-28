package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 11:17
 */

public class Demo02 {
    public static void main(String[] args) {
        byte b1 = (byte)130;
        System.out.println("b1 = " + b1);

        /*
                0000 0110
            &   0000 0010
            -----------------------
                0000 0010
         */
        System.out.println(6 & 2);

        /*
                0000 0110
            |   0000 0010
            -----------------------
                0000 0110
         */
        System.out.println(6 | 2);

        /*
                0000 0110
            ^   0000 0010
            -----------------------
                0000 0100
            特点：一个数被另一个数异或两次，等于原数本身!
         */
        System.out.println(2 ^ 6 ^ 2);

        /*
            ~ 取反 : 全部取反, 0变1, 1变0  (也包括符号位)
                 ~   0000 0110
                -----------------------
             补码:   1111 1001
             反码：  1111 1000
             源码：  1000 0111
         */
        System.out.println(~6);
    }
}
