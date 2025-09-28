package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 11:26
 *
 * 带返回值方法的定义和调用
 */

public class Demo05 {

    public static void main(String[] args) {
        // 可以这么玩，但是不推荐
        getMax(5, 10);

        // 注意：如果方法有返回，那么应该拿该类型的变量接收返回的结果
        int res = getMax(10,20);
        System.out.println("res = " + res);

        /*for (int i = 0; i < res; i++) {

        }*/


        // 如果只是希望打印方法的返回结果，那么可以直接打印调用
        System.out.println(getMax(30, 40));
    }


    // 需求： 设计一个方法，获取两个int数中的较大值并返回
    public static int getMax(int a, int b){
        int max = a > b ? a : b;

        return max;
    }
}













