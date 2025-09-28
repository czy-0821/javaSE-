package com.itheima.test4;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author:gy
 * @Date: 2025/08/27 11:05
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> al = new ArrayList<>();
        al.add("林青霞");
        al.add("迪丽热巴");
        al.add("古力娜扎");
        al.add("杨幂");
        al.add("马尔扎哈");
        al.add("德玛西亚");
        al.add("艾欧尼亚");
        //获取流
        al.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("==============");
        al.stream().skip(3).forEach(s-> System.out.println(s));
        System.out.println("==========================");
        //需求   跳过两个元素,将剩下的元素中的前2个元素在控制台输出
        al.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println("==============");
        //跳过前两个元素
        Stream<String> stream1 = al.stream().skip(2);
        //跳过两个元素,将剩下的元素中的前2个元素
        Stream<String> stream2 = al.stream().skip(2).limit(2);
        Stream.concat(stream1,stream2).distinct().forEach(s-> System.out.println(s));
    }
}
