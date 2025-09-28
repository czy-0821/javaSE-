package com.itheima.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        String codList = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random r  = new Random();
        Scanner sc = new Scanner(System.in);

        String code = "";
        StringBuilder code1 =new StringBuilder();
        for(int i=0;i<5;i++){
            code1.append(codList.charAt(r.nextInt(codList.length())));
        }
        code = code1.toString();
        System.out.println("您好，你的验证码是:" + code);

        System.out.println("========================================");

        System.out.println("请输入您的验证码");
        String inpuCode="";
        for(int i=0;i<5;i++){
            inpuCode=sc.next();
            if(inpuCode.equals(code)){
                System.out.println("输入正确！");
                break;
            }
            System.out.println("输入错误！！您还有" + (4 - i) + "次机会！！请重新输入");
        }


    }
}
