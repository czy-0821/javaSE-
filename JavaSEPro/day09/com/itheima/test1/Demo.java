package com.itheima.test1;

import java.util.*;

/**
 * @Author:gy
 * @Date: 2025/08/27 9:18
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //menthod();
        // methond2();
        //method3();
        HashMap<String, String> hm = new HashMap<>(Map.ofEntries(
                Map.entry("张三", "北京"),
                Map.entry("李四", "上海"),
                Map.entry("王五", "广州"),
                Map.entry("马六", "杭州")
        ));
        hm.put("钱七","安徽");
        System.out.println(hm);
        
    }

    private static void method3() {
        Map<String, String> map = Map.of("张三","上海","李四","北京","王五","杭州");
        HashMap<String, String> hm = new HashMap<>(map);
        hm.put("马六","广州");
        System.out.println(hm);
    }

    private static void methond2() {
        HashSet<String> hs = new HashSet<>(Set.of("2","3","4","5","1","7","10","9"));
        hs.add("aaa");
        System.out.println(hs);
    }

    private static void menthod() {
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m");
        //  ArrayList<String> al = new ArrayList<>(list);
        //list.add("aaa");
        // list.remove("b");
        ArrayList<String> al = new ArrayList<>(List.of("2","3","4","5","6","7","8","9"));
        al.add("zzz");
        System.out.println(al);
    }
}
