package com.itheima.test5;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author:gy
 * @Date: 2025/08/27 15:20
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");
        //获取男演员的流
        Stream<String> stream1 = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> stream2 = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> concat = Stream.concat(stream1, stream2);
        //concat流装着符合我们需求的一些数据
        concat.forEach(name->{
            Actor actor = new Actor(name);
            System.out.println(actor);
        });
    }
}
