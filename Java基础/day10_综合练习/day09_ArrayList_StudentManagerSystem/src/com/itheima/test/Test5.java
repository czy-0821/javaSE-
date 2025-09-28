package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 19:42
 */

public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入5个单词，每个单词间用空格隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] split = str.split(" ");

        // 定义一个集合用来统计每个单词次数
        ArrayList<String> list = new ArrayList<>(); //{"hello=1"}

        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            int count = isExists(word,list);
            count++;
            if (count == 1) {
                list.add(word + "=1");
            }else{
                // 将原本记录的移除，记录新的次数
                removeGrade(word,list);
                list.add(word+"="+count);
            }

        }

        // 找出最长单词
        String max = split[0];
        for (int i = 1; i < split.length; i++) {
            if (split[i].length() > max.length()){
                max = split[i];
            }
        }


        System.out.println("统计结果如下：");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("其中长度最长的单词为：" + max);
    }

    public static void removeGrade(String word,ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] split = str.split("=");
            if (word.equals(split[0])){
                list.remove(i);
            }
        }
    }

    // 判断指定成绩在集合中是否存在，并返回对应次数，不存在则返回0
    public static int isExists(String word, ArrayList<String> list){
        int res = 0 ;       // 假设不存在

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] split = str.split("=");
            if (word.equals(split[0])){
                res = Integer.parseInt(split[1]);
                break;
            }
        }

        return res;
    }
}
