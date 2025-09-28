package com.itheima.string;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 11:50
 *
 * 字符串的截取
 *      substring(int beginIndex, int endIndex):  从beginIndex（包含）位置开始截，一直截到endIndex（不包含）
 *      substring(int beginIndex):  从beginIndex（包含）位置开始截，一直截到末尾
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String phoneNumber = sc.next();

        // 先截取前三位
        String prefix = phoneNumber.substring(0, 3);

        // 再截取后四位
        String suffix = phoneNumber.substring(phoneNumber.length() - 4);

        // 拼接脱敏最终效果
        System.out.println(prefix + "****" + suffix);
    }
}
