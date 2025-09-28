package com.itheima.test1;

import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 10:24
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.forEach(s->System.out.println(s));
    }
}
