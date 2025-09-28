package com.itheima.test4;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author:gy
 * @Date: 2025/08/22 14:42
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("b");
        al.add("c");
        al.add("g");
        //集合都是由不同的数据结构去设计的  存取有序  1 5 4 ---> 1 5 4  内部无序
        //集合都是由不同的数据结构去设计的  存取无序  1 5 4 ---> 1 4 5  内部有序
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
