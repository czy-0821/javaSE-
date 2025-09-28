package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author 陈辉
 * @data 2025 10:39
 */

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");

        // 需求：删除list中所有"hello"
   /*     for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("hello")){
                list.remove(i);
                i--;
            }
        }*/

        System.out.println("-------------");

        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.get(i);
            if (s.equals("hello")){
                list.remove(i);
            }
        }


        System.out.println(list);
    }
}
