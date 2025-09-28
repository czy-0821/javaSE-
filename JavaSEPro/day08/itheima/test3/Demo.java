package com.itheima.test3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:gy
 * @Date: 2025/08/25 11:03
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("heima001","小帅");
        hm.put("heima002","小美");
        hm.put("heima003","小明");
        hm.put("heima004","小华");
        hm.put("heima005","小华");
        hm.put("heima006","小钱");
        //hm.remove("heima002");
      // hm.clear();
      //  System.out.println(hm.containsKey("heima005"));
        //System.out.println(hm.containsValue("小李"));
      //  System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        System.out.println(hm);
    }
}
