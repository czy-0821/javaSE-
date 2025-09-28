package com.itheima.HomeWork.Practice02;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1983");

        for (int i = 0; i < sb.length(); i++) {
            int num = Integer.parseInt(sb.charAt(i)+"");
            num = (num+5)%10;
            sb.setCharAt(i,String.valueOf(num).charAt(0));
        }

        sb.reverse();

        System.out.println("加密后的密码为:" + sb.toString());
    }
}
