package com.itheima.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author:gy
 * @Date: 2025/08/22 16:38
 * @Description:
 */
public class Demo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
       // list.add(2,"fff");
       // list.remove(2);
      //  list.set(2,"fff");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
