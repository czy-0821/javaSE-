package com.itheima.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:gy
 * @Date: 2025/08/27 10:00
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(List.of("张三丰","张无忌","赵六","王五","张翠山","谢广坤","刘能","张良"));
        al.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        //method(al);
    }

    private static void method(ArrayList<String> al) {
        //创建一个新集合来存储姓张的人
        ArrayList<String> alNew = new ArrayList<>();
        for (String name : al) {
            if(name.startsWith("张")) {
                alNew.add(name);
            }
        }
        ArrayList<String> alNew1 = new ArrayList<>();
        for (String name : alNew) {
            if(name.length()==3){
                alNew1.add(name);
            }
        }
        for (String s : alNew1) {
            System.out.println(s);
        }
    }
}
