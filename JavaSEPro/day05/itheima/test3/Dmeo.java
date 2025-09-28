package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/21 11:45
 * @Description:
 */
public class Dmeo {
    public static void main(String[] args) {
        //递归是方法调用方法  必须得有一个方法  递归看成类似于死循环,必须得有出口  去结束.
        int sum = getSum(3);
        System.out.println(sum);
    }

    private static int  getSum(int num) {
        //必须得有一个出口
        if(num == 1){
            return 1;
        }else{
            return num + getSum(num-1);
        }

    }
}
