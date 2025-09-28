package com.itheima.test1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 10:12
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("ddd");
        ts.add("ccc");
        ts.add("ccc");
        ts.add("aaa");
        ts.add("bbb");
        ts.add("bbb");
       // ts.fori  set集合没有索引
        Iterator<String> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================");
        for (String t : ts) {
            System.out.println(t);
        }
        System.out.println("==================");
        ts.forEach(s-> System.out.println(s));
    }
}
