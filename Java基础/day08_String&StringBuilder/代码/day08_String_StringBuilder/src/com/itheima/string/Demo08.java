package com.itheima.string;

/**
 * @author 陈辉
 * @data 2025 15:35
 *
 * 字符串的比较
 */

public class Demo08 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);

        String s3 = "ab";
        String s4 = s3 + "c";
        String s5 = "abc";
        String s6 = "ab" + "c";
        System.out.println(s4 == s5);   // false
        System.out.println(s6 == s5);   // true

    }
}
