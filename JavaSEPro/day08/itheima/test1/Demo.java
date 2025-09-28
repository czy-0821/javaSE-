package com.itheima.test1;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 9:18
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("add");
        hs.add("hello");
        hs.add("hello");
        hs.add("World");
        hs.add("ccc");
        hs.add(null);
        //TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add(null);
        //遍历
        hs.forEach(s-> System.out.println(s));
    }
}
