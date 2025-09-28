package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 15:54
 */

public class Demo08 {
    public static void main(String[] args) {
        byte a = 10;
        short b = 10;
        System.out.println(compare(a, b));
    }

    public static boolean compare(byte a, byte b){
        System.out.println("....byte....");
        return a == b;
    }

    public static boolean compare(short a, short b){
        System.out.println("....short....");
        return a == b;
    }

    public static boolean compare(int a, int b){
        System.out.println("....int....");
        return a == b;
    }

    public static boolean compare(long a, long b){
        System.out.println("....long....");
        return a == b;
    }
}
