package com.itheima.HomeWork.Practice03;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] list = {11,22,33};

        int[] newlist = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }

        System.out.println("原数组:" + Arrays.toString(list)+"  地址:"+list.toString());
        System.out.println("复制的数组:" + Arrays.toString(newlist)+"  地址:"+newlist.toString());
    }
}
