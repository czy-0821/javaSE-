package com.itheima.test4;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author:gy
 * @Date: 2025/08/27 14:39
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("林青霞");
        al.add("迪丽热巴");
        al.add("古力娜扎");
        al.add("杨幂");
        al.add("马尔扎哈");
        al.add("德玛西亚");
        al.add("艾欧尼亚");
        Stream<String> stream = al.stream();
        stream.forEach(s->System.out.println(s));
       // stream.skip(2).forEach(s->System.out.println(s));报错
    }
}
