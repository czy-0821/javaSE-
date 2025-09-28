package com.itheima.stringbuilder;

/**
 * @author 陈辉
 * @data 2025 16:18
 *
 * StringBuilder与String之间的相互转换
 */

public class Demo04 {

    public static void main(String[] args) {
        // String  --> StringBuilder
        String s1 = "abc";
        StringBuilder sb = new StringBuilder(s1);
        System.out.println("sb = " + sb);


        // StringBuilder  --> String
        String s2 = sb.toString();
        System.out.println("s2 = " + s2);

    }
}
