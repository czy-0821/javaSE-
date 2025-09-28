package com.itheima.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        int[][] income={{11,22,33},{44,55,66},{77,88,99},{11,22,33}};
        for (int i=0;i<income.length;i++){
            int sum=0;
            for(int j:income[i]){
                sum+=j;
            }
            System.out.println("第" + (i + 1) + "个季度的营业额为:" + sum);
        }
    }
}
