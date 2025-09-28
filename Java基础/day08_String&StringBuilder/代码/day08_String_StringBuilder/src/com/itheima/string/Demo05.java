package com.itheima.string;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 14:38
 *
 * 字符串的替换方法  -- replace
 */

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("请输入你的评论：（相信你的评论一定一针见血）");
        Scanner sc = new Scanner(System.in);
        String commend = sc.next();     // "这辅助真TMD的坑，居然不出辅助装，还抢我炮车，我TMD的服了..."

        String[] words = {"TMD","tmd","sb","SB","cnm"};

        // 替换方法
        for (int i = 0; i < words.length; i++) {
            commend = commend.replace(words[i], "***");
        }

        System.out.println(commend);
    }
}
