package com.itheima.HomeWork;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String data = sc.next();

        StringBuilder data1 = new StringBuilder(data);

        if(data1.reverse().toString().equals(data)){
            System.out.println(data + "->是对称字符串！！");
        }else System.out.println(data + "->不是对称字符串！！");


    }
}
