package com.itheima.test;

import java.util.ArrayList;

/**
 * @Author:gy
 * @Date: 2025/08/24 10:01
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("aee");
        al.add("bff");

        for (int i = 0; i < al.size(); i++) {
            String o = al.get(i);
            if(o.startsWith("a")){
                System.out.println(o);
            }
        }
    }
}
