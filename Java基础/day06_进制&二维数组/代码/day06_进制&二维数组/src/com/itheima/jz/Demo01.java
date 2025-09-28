package com.itheima.jz;

/**
 * @author 陈辉
 * @data 2025 10:14
 */

public class Demo01 {
    /*
        十进制：Java中，数值默认都是10进制，不需要加任何修饰。
        二进制：数值前面以0b开头，b大小写都可以。
        八进制：数值前面以0开头。
        十六进制：数值前面以0x开头，x大小写都可以。

        注意: 书写的时候, 虽然加入了进制的标识, 但打印在控制台展示的都是十进制数据.
     */
    public static void main(String[] args) {
        System.out.println(10);                           // 十进制
        System.out.println("二进制："+ 0b10);             // 二进制
        System.out.println("八进制："+ 010);              // 八进制
        System.out.println("十六进制："+ 0x10);           // 十六进制
    }
}
