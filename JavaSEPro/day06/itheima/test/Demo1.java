package com.itheima.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/22 9:10
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {


        int a;
        int b;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入第一个整数:");//InputMismatchException
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("请输入一个数值型的整数");
            }
        }

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入第二个整数:");
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("请输入一个数值型的整数");
            }
        }
        int c = a / b;
        System.out.println(c);
    }
}


