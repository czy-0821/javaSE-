package com.itheima.test4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:gy
 * @Date: 2025/08/22 15:46
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        Collection<String> al = new ArrayList<String>();
        al.add("aaaa");
        al.add("bbbb");
        al.add("cccc");
        al.add("aaaa");
        al.add("aaaa");
        al.add("dddd");
        Iterator<String> it = al.iterator();
        //我想删除bbbb
        while (it.hasNext()) {
            String s = it.next();
            //我们用迭代器遍历集合的时候,如果集合的结构发生了变化,那么迭代器就会失效,就需要重新获取
            //但是我们没有获取,那么就会报并发修改异常.
            //解决办法是:用迭代器自己的删除方法 迭代器删除自后会i--.相当于获取了一个新迭代器
            if ("aaaa".equals(s)) {
                //
                it.remove();
            }
        }
        System.out.println(al);
    }
}
