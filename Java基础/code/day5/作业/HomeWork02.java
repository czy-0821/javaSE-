package com.itheima.HomeWork;

import java.util.Scanner;

public class HomeWork02 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] list = {10,20,30,40,50,60,70,80};
    public static void main(String[] args) {

        TestSystem();
    }
    public static void TestSystem() {
       lo:while(true){
           System.out.println("---------------------------");

           System.out.println("欢迎来到黑马考试管理系统");
           System.out.println("1-查看成绩" + '\n' + "2-查看最高分" +
                   '\n' + "3-查看最低分" + '\n' + "4-查看平均分" + '\n' +
                   "5-查看不及格人数" + '\n' + "6-退出");

           System.out.println("---------------------------");

           int c = sc.nextInt();
           switch (c) {
               case 1:LookAll();break;
               case 2:LookMax();break;
               case 3:LookMin();break;
               case 4:LookAve();break;
               case 5:LookDown();break;
               case 6:break lo;
           }
       }
    }

    private static void LookDown() {  //查看不及格人数
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]<60)count++;
        }
        System.out.println("不及格人数为:" + count);
    }

    private static void LookMin() {//查看最低分
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i]<min){
                min = list[i];
            }
        }
        System.out.println("最低分为" + min);
    }

    private static void LookAve() {//查看平均分
        int sum=0;
        for (int i = 0; i < list.length; i++) {
            sum+=list[i];
        }
        System.out.println("平均分为" + (sum / list.length));
    }

    private static void LookMax() {//查看最高分
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i]>max){
                max = list[i];
            }
        }
        System.out.println("最高分为" + max);
    }


    public static void LookAll(){  //查看成绩
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            if(i == list.length-1){
                System.out.print(list[i]);
                break;
            }
            System.out.print(list[i]+",");
        }
        System.out.println("]");
    }

}
