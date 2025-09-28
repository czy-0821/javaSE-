package com.itheima.stringbuilder;

/**
 * @author 陈辉
 * @data 2025 16:12
 *
 * StringBuilder的常用方法
 */

public class Demo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*sb.append("hello");
        sb.append(123);
        sb.append("你好");*/

        // 链式编程：本次调用的结果作为下次方法的调用者
        sb.append("hello").append(123).append("你好");
        System.out.println(sb);

        // 需求：将sb内容反转
        sb.reverse();
        System.out.println("反转后：" + sb);
    }
}
