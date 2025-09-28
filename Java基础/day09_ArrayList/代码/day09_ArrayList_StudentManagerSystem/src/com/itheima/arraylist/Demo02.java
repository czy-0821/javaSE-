package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * @author 陈辉
 * @data 2025 10:17
 *
 * ArrayList的常用方法
 */

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("石破天");
        list.add("袁承志");
        list.add("胡一刀");
        list.add("段誉");
        list.add("虚竹");
        list.add("虚竹");
        list.add("乔峰");

        // 1. 需求： 将 虚竹 从集合中移除
        list.remove("虚竹");
        // 2. 需求： 将集合的第二个数据移除
        list.remove(1);
        // 3. 需求： 将集合的第一个人名修改为：扫地僧
        list.set(0,"扫地僧");
        // 4. 需求： 获取集合第三个数据并打印
        System.out.println(list.get(2));
        // 5. 需求： 获取集合的长度并打印
        System.out.println(list.size());

        System.out.println(list);

        System.out.println("--------------");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }



    }
}
