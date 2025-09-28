package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/19 8:52
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //密码--->加密--->数据库
       int passWord = 1983;
       //求每位数   个十百千
       int ge =  passWord/1%10;
       int shi =  passWord/10%10;
       int bai =  passWord/100%10;
       int qian =  passWord/1000%10;
       ge = (ge+5)%10;
       shi = (shi+5)%10;
       bai = (bai+5)%10;
       qian = (qian+5)%10;
       //反转
        int  endPassWord = ge*1000+shi*100+bai*10+qian;
        System.out.println(endPassWord);
    }
}
