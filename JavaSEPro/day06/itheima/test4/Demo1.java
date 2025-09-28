package com.itheima.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author:gy
 * @Date: 2025/08/22 15:02
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> al = new ArrayList<>();
        //编译看父类 运行看子类
        //存储数据
        al.add("java01");
        al.add("java02");
        al.add("java03");
        /*//获取集合的长度
        int size = al.size();
        System.out.println(size);
        //删除元素
         al.remove("java02");
         //判断是否存在某个元素
        System.out.println(al.contains("java01"));
        System.out.println(al.contains("java05"));
        //清空集合
        al.clear();
        System.out.println(al.size()==0);
        System.out.println(al.isEmpty());*/
       /* //集合转数组
        String[] array = (String[]) al.toArray();
        //数组转集合
        List<String> list = Arrays.asList(array);*/
    }
}
