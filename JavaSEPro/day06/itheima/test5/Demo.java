package com.itheima.test5;

import java.util.LinkedList;

/**
 * @Author:gy
 * @Date: 2025/08/22 17:51
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.removeFirst();
      /*  ll.addFirst("aa");
        ll.addLast("dd");*/
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
        //增删改查遍历
        //ll.remove(2);
      //  ll.set(2,"ff");
      /*  for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }*/
     // ll.forEach(a-> System.out.println(a));
        System.out.println(ll);
    }
}
