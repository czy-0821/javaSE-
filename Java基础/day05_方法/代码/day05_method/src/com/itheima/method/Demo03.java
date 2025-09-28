package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 10:45
 */

public class Demo03 {
    public static void main(String[] args) {
        isEventNumber(20);
        isEventNumber(21);
    }

    // 方法需求：判断一个数是奇数还是偶数
    public static void isEventNumber(int num){ // int num = 21;

        if (num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
    }
}
