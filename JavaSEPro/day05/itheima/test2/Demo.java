package com.itheima.test2;

import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/21 10:58
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //二分查找有一个前提  前提是必须有序
        int [] arr = {2,6,9,12,15,36,75,96};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数字:");
        int number = sc.nextInt();
        int index = getIndex(arr, number);
        if(index!=-1){
            System.out.println("该数字在数组中的索引是"+index);
        }else{
            System.out.println("没有找到该索引");
        }

    }
    private static int getIndex(int[] arr, int number) {
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
           //计算出mid的值
           int mid = (max+min)/2;
           if(arr[mid]> number){
                max = mid-1;
           }else if(arr[mid]< number){
               min = mid+1;
           }else{
               return mid;
           }
        }
        return -1;
    }
}
