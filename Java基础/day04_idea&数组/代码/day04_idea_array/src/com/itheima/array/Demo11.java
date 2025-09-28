package com.itheima.array;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 16:54
 *
 * 综合案例：评委打分
 */

public class Demo11 {
    public static void main(String[] args) {
        //1. 定义一个数组，用来记录评委的分数
        int[] arr = new int[6];

        //2. 遍历数组，给每个索引位置键盘录入赋值
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i + 1) +"个评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                arr[i] = score;
            }else{
                System.out.println("分数不合法，请重新输入：[0,100]");
                i--;
            }
        }

        //3. 获取数组总分，最高分，最低分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        // 4. 计算平均分
        int result = (sum - max - min) / (arr.length -2);

        System.out.println("result = " + result);
    }
}
