package com.itheima.test2;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author:gy
 * @Date: 2025/08/27 10:22
 * @Description:
 */
public class test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        HashSet<String> hs = new HashSet<>();
        Stream<String> stream1 = hs.stream();

        //Map怎么创建Stream流  只能间接生成流
        HashMap<String, String> hm = new HashMap<>();
        Stream<String> keyStreams = hm.keySet().stream();
        Stream<String> valueStreams = hm.values().stream();
        Stream<Map.Entry<String, String>> entryStreams = hm.entrySet().stream();

        //数组
        Stream<String> stream2 = Arrays.stream(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"});

        //同种数据类型  创建一个stream流
        Stream<String> stream3 = Stream.of("你好", "haha", "嘻嘻");
        Stream<Integer> stream4 = Stream.of(10,20,30);
    }
}
