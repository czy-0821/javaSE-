package com.itheima.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/22 9:24
 * @Description:
 */
public class ScUtils {
    public static int getInt(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个整数:");
                int a = sc.nextInt();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("请输入整数型的数值的数");
            }
        }
    }
    public static double getDouble(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个小数:");
                double a = sc.nextDouble();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("请输入小数型的数值的数");
            }
        }
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        return s;
    }
}
