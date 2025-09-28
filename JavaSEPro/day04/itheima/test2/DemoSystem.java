package com.itheima.test2;

/**
 * @Author:gy
 * @Date: 2025/08/19 9:54
 * @Description:
 */
public class DemoSystem {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

       /* String s = "";
        for (int i = 0; i < 10000; i++) {
            s+=i;
        }//162*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }//4
        String string = sb.toString();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
