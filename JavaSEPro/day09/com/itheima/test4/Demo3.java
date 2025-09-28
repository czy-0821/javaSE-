package com.itheima.test4;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author:gy
 * @Date: 2025/08/27 11:37
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        //操作流  三个步骤  1.获取流  2.中间方法  3.总结方法
        al.stream().filter(s->s%2==0).forEach(s->System.out.println(s));
        System.out.println("===================");
        al.forEach(s->System.out.println(s));
    }
}
