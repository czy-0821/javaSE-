package com.itheima.test4;

import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/21 16:13
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的年龄:");
            String sAge = sc.next();
            //将字符串的age转成int类型的age
            int age = Integer.parseInt(sAge);//NumberFormatException
            System.out.println(age);
            //System.out.println(1/0);//ArithmeticException
            System.out.println("1111");
        } catch (NumberFormatException e) {
            System.out.println("输入的得是数值型的字符串");
        }catch (ArithmeticException e) {
            System.out.println("被除数不能为0");
        }
        System.out.println("2222");
    }
}
