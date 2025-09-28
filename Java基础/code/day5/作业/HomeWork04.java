package com.itheima.HomeWork;

import java.util.Random;

/*随机产生10个不同的数(15-30),放在长度为10的数组里.*/
public class HomeWork04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            int num = rand.nextInt(16)+15;
            int i1=0;
            for (; i1 < i; i1++) {
                if(list[i1] == num){
                    i--;
                    break;
                }
            }
            if(i1==i)list[i] = num;

        }

        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            if(i==list.length-1) {
                System.out.print(list[i]);
                break;
            }
            System.out.printf(list[i]+",");
        }
        System.out.printf( "]");
    }
}

