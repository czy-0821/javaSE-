package com.itheima.stringbuilder;

/**
 * @author 陈辉
 * @data 2025 15:54
 *
 *  为什么要学习StringBuilder
 *          用来高效操作字符串的对象!
 */

public class Demo01 {

    public static void main(String[] args) {
        // 需求：拼接1~100
        long start = System.currentTimeMillis();        // 当前系统时间对应的毫秒值
        //method01();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100 ; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();        // 当前系统时间对应的毫秒值
        System.out.println(end - start);
    }

    private static void method01() {   // 40
        String s1 = "";

        for (int i = 1; i <= 100 ; i++) {
            s1 += i;        // s1 = s1 + i;
        }

        System.out.println(s1);
    }


}
