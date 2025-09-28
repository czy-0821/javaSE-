package com.itheima.test;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 18:37
 */

public class Test1 {
    /*
    简易计算器

        创建一个简单的控制台计算器程序，可以：

        - 让用户选择加、减、乘、除运算
        - 输入两个数字
        - 输出运算结果
        - 使用方法来组织不同的运算操作
     */
    public static void main(String[] args) {
        System.out.println("-----------黑马计算器---------");
        System.out.println("1. ＋");
        System.out.println("2. －");
        System.out.println("3. ×");
        System.out.println("4. ÷");
        System.out.println("请选择算法：");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        switch (option){
            case "1":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "2":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "3":
                System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
                break;
            case "4":
                System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("输入有误!");
                break;
        }
    }
}
