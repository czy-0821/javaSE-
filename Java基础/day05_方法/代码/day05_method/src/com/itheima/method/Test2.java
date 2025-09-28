package com.itheima.method;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 14:39
 * <p>
 * 考试管理系统
 */

public class Test2 {
    public static void main(String[] args) {
        // 1. 定义一个数组，管理系统所有学生成绩
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80};

        while (true) {
            System.out.println("-----------------欢迎来到黑马考试管理系统----------------");
            System.out.println("1. 查看成绩");
            System.out.println("2. 查看最高分");
            System.out.println("3. 查看最低分");
            System.out.println("4. 查看平均分");
            System.out.println("5. 查看不及格人数");
            System.out.println("6. 退出");
            Scanner sc = new Scanner(System.in);
            String option = sc.next();

            switch (option) {
                case "1":
                    findAllScores(scores);
                    break;
                case "2":
                    getMaxScore(scores);
                    break;
                case "3":
                    getMinScore(scores);
                    break;
                case "4":
                    getAvgScore(scores);
                    break;
                case "5":
                    getBjgCount(scores);
                    break;
                case "6":
                    System.out.println("感谢你的使用，再见!");
                    return;   // 结束方法
                default:
                    System.out.println("指令有误!");
                    break;
            }

        }
    }

    //1. 查看成绩
    public static void findAllScores(int[] scores){
        System.out.println("学生成绩为：");
        System.out.print("[");
        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length - 1){
                System.out.println(scores[i] + "] ");
            }else{
                System.out.print(scores[i] + ", ");
            }
        }
    }

    //2. 查看最高分
    public static void getMaxScore(int[] scores){

        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("最高分为：" + max);
    }

    //3. 查看最高分
    public static void getMinScore(int[] scores){

        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        System.out.println("最低分为：" + min);
    }

    //4. 查看平均分
    public static void getAvgScore(int[] scores){
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
           sum += scores[i];
        }

        System.out.println("平均分为：" + (sum / scores.length));
    }

    //5. 查看不及格人数
    public static void getBjgCount(int[] scores){

        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                count++;
            }
        }

        System.out.println("不及格人数为：" + count);
    }

}
