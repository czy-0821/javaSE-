package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/21 11:59
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(getJC(10));
    }
    public static int getJC(int num){
        //给一个出口
        if(num == 1){
            return 1 ;
        }else{
            return num*getJC(num-1);
        }
    }

}
