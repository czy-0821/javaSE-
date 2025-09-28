package com.itheima.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author:gy
 * @Date: 2025/08/27 14:41
 * @Description:
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(List.of("张三,23", "李四,24", "王五,25"));
        //生成一个流
        Map<String, String> map = al.stream().filter(s -> {
            String[] split = s.split(",");
            int age = Integer.parseInt(split[1]);
            return age >= 24;
            // collect(Collectors.toMap(s->s.split(",")[0],s->s.split(",")[1]));
        }).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[1];
            }
        }));
        map.forEach((k, v) -> System.out.println(k+"---------"+v));
    }
}
