package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/19 16:07
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        String name = Season.SPRING.name();
        System.out.println(name);
        int index1 = Season.SPRING.ordinal();
        int index2 = Season.SUMMER.ordinal();
        int index3= Season.AUTUMN.ordinal();
        int index4 = Season.WINTER.ordinal();
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println("======================");
        int num = Season.WINTER.compareTo(Season.SPRING);
        System.out.println(num);
        System.out.println("=================");
        Season summer = Season.valueOf("SPRING");
        System.out.println(summer);
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
