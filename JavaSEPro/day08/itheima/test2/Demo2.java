package com.itheima.test2;

import java.util.LinkedHashSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 10:50
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("ddd");
        lhs.add("eee");
        lhs.add("aaa");
        lhs.add("bbb");
        lhs.add("aaa");
        lhs.add("ccc");
        lhs.forEach(s->System.out.println(s));

    }
}
