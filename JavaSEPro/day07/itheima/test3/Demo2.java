package com.itheima.test3;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 14:39
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        /*TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            *//*
            o1即将要存入的元素
            o2已经存在的元素
            * *//*
            @Override
            public int compare(String o1, String o2) {
               int resule =  o1.length()-o2.length();
               return resule == 0?o1.compareTo(o2):resule;
            }
        });*/
        TreeSet<String> ts = new TreeSet<String>((o1,o2)->{
            int resule =  o1.length()-o2.length();
            return resule == 0?o1.compareTo(o2):resule;
        });
        ts.add("aaa");
        ts.add("aa");
        ts.add("cccc");
        ts.add("ddddddd");
        ts.add("ccc");
        ts.add("cc");
        System.out.println(ts);
    }
}
