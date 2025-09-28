package com.itheima.test4;

import java.util.ArrayList;

/**
 * @Author:gy
 * @Date: 2025/08/22 17:07
 * @Description:
 */
public class Demo7 {
    public static void main(String[] args) {
        /*
        他的默认容量是10,也就是说我们一开始只能存储10个元素的,但是我们存储了100个元素,也没有没有
        因为他会自动扩懂
        1.创建一个长度更长的数组   1.5倍的数组
        2.将旧数组的元素拷贝复制过去
        3.jdk之后会在第一次添加元素的时候,创建一个长度为10的数组
        * */
        ArrayList<String> al = new ArrayList<>();//创建了一个空数组
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//
        al.add("a");//


    }
}
