package com.itheima.string;

/**
 * @author 陈辉
 * @data 2025 15:11
 *
 * 字符串常用方法扩展
 */

public class Demo07 {
    public static void main(String[] args) {
        String s1 = "  good good study, day day up!  ";

        // 将s1内容转大写
        String s2 = s1.toUpperCase();
        System.out.println("s2 = " + s2);

        // 将s2内容转小写
        String s3 = s2.toLowerCase();
        System.out.println("s3 = " + s3);

        // 将s1前后空格消除
        String s4 = s1.trim();
        System.out.println("s4 = " + s4);

        String name = "迪丽热巴-古力娜扎-马尔扎哈";
        // 判断name中是否包含“热巴”
        System.out.println(name.contains("冷巴"));

        // 判断name中是否姓“迪”
        System.out.println(name.startsWith("迪丽"));

        // 判断name是否以“扎哈”结尾
        System.out.println(name.endsWith("扎哈"));
    }
}
