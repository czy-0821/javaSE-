package com.itheima.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 陈辉
 * @data 2025 19:36
 */

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("一等奖");
        list.add("二等奖");
        list.add("三等奖");
        list.add("四等奖");
        list.add("谢谢参与");

        Random r = new Random();
        while (list.size() != 0) {
            int index = r.nextInt(list.size());   //[0,list.size()-1]
            String res = list.get(index);
            System.out.println("本次抽到的是：" + res);

            //将本次抽到的奖项移除
            list.remove(index);
        }
    }
}
