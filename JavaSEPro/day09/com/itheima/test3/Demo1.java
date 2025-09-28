package com.itheima.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author:gy
 * @Date: 2025/08/27 10:40
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(List.of("张三丰","张无忌","赵六","王五","张翠山","谢广坤","刘能","张良"));
        //集合获取流
        Stream<String> stream = al.stream();
        /*
        filter获取流中的每一个数据的意思
        test方法中表示每一个数据
        我们只需要对s进行判断集合
        返回的true,此时的s就留下
        如果是false,此时的s数据就不要
        * */
        al.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        });
        al.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
