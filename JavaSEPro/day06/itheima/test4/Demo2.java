package com.itheima.test4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:gy
 * @Date: 2025/08/22 15:17
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> al = new ArrayList<String>();
        al.add("aaaa");
        al.add("bbbb");
        al.add("cccc");
        al.add("dddd");
        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
       /* //判断当前位置是否有元素可以取出
        System.out.println(it.hasNext());
        //取出当前迭代器所在的位置的元素,同时将迭代器向下一个索引处移动
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());*/

    }
}
