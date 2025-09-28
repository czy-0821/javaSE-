package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author 陈辉
 * @data 2025 10:05
 *
 * ArrayList的创建与添加操作
 */

public class Demo01 {
    public static void main(String[] args) {
        // <> 泛型：用来规定集合里存储的元素类型,只支持引用数据类型
        ArrayList<String> list = new ArrayList<>();

        // 排队添加
        list.add("hello");
        list.add("hello");
        list.add("world");
        list.add("java");

        // 插队添加
        list.add(0,"JavaWeb");

        System.out.println(list);
    }
}
