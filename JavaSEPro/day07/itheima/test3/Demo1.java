package com.itheima.test3;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/24 11:48
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("b");
        al.add("A");
        al.add("A");
        al.add("c");
        al.add("A");
        al.add("f");
        al.add("A");
        al.add("c");
        al.add("d");
        al.add("d");
        al.add("e");
        //将List集合去重  定义一个set集合
        TreeSet<String> ts = new TreeSet<>();
        for (String s : al) {
            ts.add(s);
        }
        //此时ts里面已经去重了  需要将list先清空  在将set的元素重新存回去
        al.clear();
        for (String t : ts) {
            al.add(t);
        }
        System.out.println(al);
    }
}
