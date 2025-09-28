package com.itheima.test;

import java.util.Random;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 8:52
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //随机生成8个10-20的数
        Random rand = new Random();
        //不重复  set
        TreeSet<Integer> ts = new TreeSet<>();
        int count = 1;
        while(ts.size()<8){
            //生成随机数
            int num = rand.nextInt(11)+10;
            System.out.println("第"+(count++)+"次生成的随机数是"+num);
            ts.add(num);
        }
        System.out.println("集合中保存的8个不重复的随机数是"+ts);
    }
}
