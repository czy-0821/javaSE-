package com.itheima.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author:gy
 * @Date: 2025/08/27 11:44
 * @Description:
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            al.add(i);
        }
        al.add(6);
        al.add(4);
        al.add(12);
        al.add(4);
        //filter是过滤的 在流中进行操作
       // List<Integer> list = al.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
       // list.forEach(s->System.out.print(s+"  "));
        Set<Integer> set = al.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
        set.forEach(num->System.out.println(num));
    }
}
