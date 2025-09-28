package com.itheima.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = "";
        while (true){
            System.out.println("请输入一个电话号码:");
            phoneNumber = scanner.next();
            if(phoneNumber.charAt(0)!='1'){
                System.out.println("号码开头有误！");
                continue;
            }else if(phoneNumber.length()!=11){
                System.out.println("电话号码位数有误!!");
                continue;
            } else if (phoneNumber.charAt(1)=='1'||phoneNumber.charAt(1)=='2'||phoneNumber.charAt(1)=='0') {
                System.out.println("第二位数字有误!!");
                continue;
            }
            int i=0;
            for(;i<phoneNumber.length();i++)
                if(phoneNumber.charAt(i)>'9'||phoneNumber.charAt(i)<'0'){
                    System.out.println("电话号码必须全为数字!!!");
                    break;
                }

            if(i>=phoneNumber.length())break;
        }


        System.out.println("您的电话号码为:" + phoneNumber);

    }
}
