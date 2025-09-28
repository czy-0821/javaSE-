package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/21 9:39
 * @Description:
 */
public class Demo4 {
    public static void main(String[] args) {
        /*String s = "100";
        int i = 200;
        System.out.println(s+i);//100200*/
        //String---int
        String s1 = "100";
        int i = 200;
        //想让他们直接想加  不去做链接  将字符串100变成int的100
        int i1 = Integer.parseInt(s1);
        System.out.println(i+i1);
        //int---String
        int num = 58;
        /*String s = String.valueOf(58);*/
        String s = num+"";
        System.out.println(s);

    }
}
