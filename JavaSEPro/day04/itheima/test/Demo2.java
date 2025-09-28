package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/19 9:01
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        int [] oldArray = {11,22,33,44};
        //拷贝  我们得有一个新数组  已知长度
        int [] newArray = new int[oldArray.length];
        //手边遍历老数组 复制到新数组中
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        //遍历老数组和新数组  有一个不一样 就说明数组不一样
        boolean flag = true;//假装是一样的数组
        for (int i = 0; i < oldArray.length; i++) {
           if (newArray[i] != oldArray[i]) {
               flag = false;
           }
        }
        if (flag) {
            System.out.println("一样");
        }else{
            System.out.println("不一样");
        }
    }
}
