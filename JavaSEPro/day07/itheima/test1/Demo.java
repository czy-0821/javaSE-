package com.itheima.test1;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 10:30
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<People> tsp = new TreeSet<>();
        People p1 = new People("小帅", 28);
        People p2 = new People("小美", 26);
        People p3 = new People("小华", 28);
        People p4 = new People("小王", 25);
        tsp.add(p1);
        tsp.add(p2);
        tsp.add(p3);
        tsp.add(p4);
        tsp.forEach(s->System.out.println(s));
    }
}
