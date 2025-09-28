package com.itheima.test6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author:gy
 * @Date: 2025/08/22 17:59
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // addArrList();//47
       addLinedList();//189
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void addLinedList() {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            ll.add(i);
        }
    }

    private static void addArrList() {
        ArrayList<Integer> al = new ArrayList<>(1000000);
        for (int i = 0; i < 1000; i++) {
            al.add(i);
        }
    }

}
