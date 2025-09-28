package com.itheima.test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @Author:gy
 * @Date: 2025/08/25 11:28
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("一号丈夫", "一号妻子");
        hm.put("二号丈夫", "二号妻子");
        hm.put("三号丈夫", "三号妻子");
        hm.put("四号丈夫", "四号妻子");
        //遍历   得到所有的key之后  根据key再去查value
       Set<String> keys = hm.keySet();
       /* Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }*/
       /* for (String key : keys) {
            String value = hm.get(key);
            System.out.println(key+"---"+value);
        }*/
      //  keys.forEach(key-> System.out.println(key + ":" + hm.get(key)));
        //得到一个键值对的对象的set集合
       Set<Map.Entry<String, String>> entries = hm.entrySet();
        /*for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"------"+value);
        }*/
       // entries.forEach(entry->System.out.println(entry.getKey()+"---"+entry.getValue()));
        hm.forEach((key,value)->{
            System.out.println(key+"----"+value);
        });
    }
}
