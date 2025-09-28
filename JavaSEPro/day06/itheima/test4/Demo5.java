package com.itheima.test4;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author:gy
 * @Date: 2025/08/22 16:12
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aaa");
        al.add("aawfa");
        al.add("afgaa");
        al.add("aada");
        al.add("heima");
        al.add("maj");
        al.add("fgdf");
        al.add("nba");
        al.add("aaaggg");
        al.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3?true:false;
            }
        });
        //将元素长度为3的进行删除
        al.removeIf(s-> s.startsWith("a")?true:false);
        System.out.println(al);
    }
}
