package com.itheima.test4;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Author:gy
 * @Date: 2025/08/27 11:27
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("林青霞");
        al.add("迪丽热巴");
        al.add("古力娜扎");
        al.add("杨幂");
        al.add("马尔扎哈");
        al.add("德玛西亚");
        al.add("艾欧尼亚");
        al.stream().forEach(s-> System.out.println(s));
        //统计流中元素的个数
        long count = al.stream().count();
        System.out.println(count);
    }
}
