package com.itheima.api;

/*
    关于Scanner键盘录入字符串的两种玩法：
        1. next(): 好处是可以和其他nextXxx()兼容使用， 弊端是：不识别空格
        2. nextLine(): 好处是可以识别空格， 弊端是：不和其他nextXxx()兼容
 */

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        //String name = sc.next();
        String name = sc.nextLine();


        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println(name + "你好，您今年：" + age + "岁!");
    }
}
