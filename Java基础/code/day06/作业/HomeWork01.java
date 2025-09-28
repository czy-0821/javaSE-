package com.itheima.homework;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        String[] list = {
            "第一章：废物的诞生",
            "第二章：莫欺少年穷",
            "第三章：莫欺中年穷",
            "第四章：莫欺老年穷",
           "第五章：死者为大",
            "第六章：被撬动的棺材",
            "第七章：盗墓者的眼泪"
        };
        Scanner sc = new Scanner(System.in);

        positiveSequence(list);
        while(true){

            System.out.println("请输入选择的排序方式 1.正序  2.倒序   3.退出");
            switch(sc.nextInt()){
                case 1:positiveSequence(list);break;
                case 2:reverseSequence(list);break;
                case 3:
                    System.out.println("谢谢使用!");return;
                default:
                    System.out.println("输入有误，请重新输入!");break;
            }
        }

    }

    public static void positiveSequence(String[] list){   //正序输出
        System.out.println("---------------------------------");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("---------------------------------");
    }


    public static void reverseSequence(String[] list){   //逆序输出
        System.out.println("---------------------------------");
        for(int i=list.length-1;i>=0;i--){
            System.out.println(list[i]);
        }
        System.out.println("---------------------------------");
    }
}
