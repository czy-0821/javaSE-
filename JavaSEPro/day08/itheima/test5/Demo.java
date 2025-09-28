package com.itheima.test5;

import java.util.HashMap;

/**
 * @Author:gy
 * @Date: 2025/08/25 15:15
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the dark horse to learn java";
        //  将字符串作为key  出现的次数作为 value
        HashMap<String, Integer> hm = new HashMap<>();
        //将大字符串进行切割
        String[] splStr = str.split(" ");
        for (String s : splStr) {
            //map里面包含不包含这个s
            if(!hm.containsKey(s)){
                //说明这个key是第一次出现
                hm.put(s, 1);
            }else{
                //说明已经出现了 并且这个s就是key
                Integer value = hm.get(s);
                hm.put(s, ++value);
            }
        }

        hm.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
