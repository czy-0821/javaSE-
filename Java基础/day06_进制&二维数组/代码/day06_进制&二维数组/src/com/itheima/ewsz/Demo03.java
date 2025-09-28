package com.itheima.ewsz;

/**
 * @author 陈辉
 * @data 2025 15:39
 *
 * 创建一个二维数组，用来维护班级两组同学的成绩信息：
 * 已知1组： 11， 22， 33
 * 已知2组： 44， 55， 66
 *
 * 根据以上信息，使用静态初始化完成二维数组的创建
 */

public class Demo03 {
    public static void main(String[] args) {
        int[][] arr = {{22, 66, 44},{77, 33, 88},{25, 45, 65},{11, 66, 99}};


        int sum = 0;
        //遍历二维数组
        //循环嵌套： 内层循环跑一圈，外层循环走一步
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
               sum += arr[i][j];
            }
        }

        System.out.println("sum = " + sum);

    }
}
