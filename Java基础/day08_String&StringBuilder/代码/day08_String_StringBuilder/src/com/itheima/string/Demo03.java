package com.itheima.string;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 11:39
 * <p>
 * 字符串的遍历
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        // 方式一遍历： length() + charAt() 相结合
        for (int i = 0; i < str.length(); i++) {
            // 获取当前索引位置的字符
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        System.out.println("------------");

        // 方式二遍历： toCharArray()
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
