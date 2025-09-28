package com.itheima.test4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @Author:gy
 * @Date: 2025/08/22 15:54
 * @Description:
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("aaaa");
        al.add("bbbb");
        al.add("cccc");
        al.add("aaaa");
        al.add("aaaa");
        al.add("dddd");
        /*
         增强for循环
         1.String:数据类型必须是集合或者数组中存储的数据的类型
         2.s:仅仅是一个变量名而已,在循环的过程中,依次表示集合/数组中的每一个元素
         3.al: 表示我们需要遍历的数组或者集合的名字
         4.在增强for循环中,无法改变数组或者集合中的元素,我们用这种遍历方式,只做数据的展示,不做对数据的任何其他操作
        * */
        /*for (String s : al) {
            s = "heima";
            System.out.println(s);
        }*/
       // al.forEach(t->System.out.println(t));
        al.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        al.forEach((String s)->{});
        String [] names ={"张三","李四","王五"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(al);
    }
}
