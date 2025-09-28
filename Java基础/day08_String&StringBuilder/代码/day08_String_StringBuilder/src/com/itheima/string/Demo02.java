package com.itheima.string;

/**
 * @author 陈辉
 * @data 2025 11:14
 *
 * 字符串内容比较
 */

public class Demo02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = new String("abc");

        // equals : 比较字符串内容, 区分大小写
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // equalsIgnoreCase : 比较字符串内容, 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
