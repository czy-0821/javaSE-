package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 11:17
 */

public class Demo04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        print(a, b);                          // 实际参数，简称实参

        print(30, 40);
    }

    public static void print(int n, int m){   // 形式参数，简称形参     实参就是给形参赋值用的。
        for (int i = n; i <= m ; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
