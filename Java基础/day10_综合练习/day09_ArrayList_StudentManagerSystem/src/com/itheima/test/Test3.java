package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 19:02
 */

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();     // ["A=1","B=0"]
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("请输入第"+i+"个人的成绩：[0,100]");
            int score = sc.nextInt();
            String grade = "";

            // 判断成绩等级
            if (score >= 90 && score <= 100){
                grade = "A";
            }else if (score >= 80 && score < 90){
                grade = "B";
            }else if (score >= 70 && score < 80){
                grade = "C";
            }else if (score >= 60 && score < 70){
                grade = "D";
            }else if (score >= 0 && score < 60){
                grade = "E";
            }else{
                System.out.println("成绩输入有误，请重新输入!");
                i--;
                continue;
            }

            // 判断本次的成绩等级在集合中是否存在
            int count = isExists(grade, list);
            count++;
            if (count == 1) {
                list.add(grade + "=1");
            }else{
                // 将原本记录的移除，记录新的次数
                removeGrade(grade,list);
                list.add(grade+"="+count);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public static void removeGrade(String grade,ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] split = str.split("=");
            if (grade.equals(split[0])){
                list.remove(i);
            }
        }
    }

    // 判断指定成绩在集合中是否存在，并返回对应次数，不存在则返回0
    public static int isExists(String grade, ArrayList<String> list){
        int res = 0 ;       // 假设不存在

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] split = str.split("=");
            if (grade.equals(split[0])){
                res = Integer.parseInt(split[1]);
                break;
            }
        }

        return res;
    }
}
