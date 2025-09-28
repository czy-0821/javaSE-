package com.itheima.array;

import java.util.Random;

/**
 * @author 陈辉
 * @data 2025 15:33
 *
 * 随机点名器
 */

public class Demo06 {
    public static void main(String[] args) {
        String[] names = {"张无忌","周芷若","金毛狮王","灭绝师太","黄裳"};

        System.out.println(names.length);

        //  索引范围：[0, 长度)
        Random r = new Random();
        int index = r.nextInt(names.length);

        System.out.println("本次抽到的幸运同学：" + names[index]);
    }
}
