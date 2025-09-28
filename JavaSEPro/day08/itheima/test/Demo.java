package com.itheima.test;

import java.util.Random;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 8:44
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //随机生成一个双色球
        Random rand = new Random();
        //先生成一个蓝色球
        int  blueBall = rand.nextInt(16)+1;
        //生成红球 选择set集合来存储红球
        TreeSet<Integer> redBalls = new TreeSet<>();
        while(redBalls.size()<6){
            //先生成一个红球
            int  redBall = rand.nextInt(33)+1;
            redBalls.add(redBall);
        }
        System.out.println("红球:"+redBalls+"蓝球:"+blueBall);
    }
}
