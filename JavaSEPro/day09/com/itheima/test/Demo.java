package com.itheima.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author:gy
 * @Date: 2025/08/27 8:55
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1930","乌拉圭");
        hm.put("1934","意大利");
        hm.put("1938","意大利");
        hm.put("1950","乌拉圭");
        hm.put("1954","德国");
        hm.put("1958","巴西");
        hm.put("1962","巴西");
        hm.put("1966","英格兰");
        hm.put("1970","巴西");
        hm.put("1974","德国");
        hm.put("1978","阿根廷");
        hm.put("1982","意大利");
        hm.put("1986","阿根廷");
        hm.put("1990","德国");
        hm.put("1994","巴西");
        hm.put("1998","法国");
        hm.put("2002","巴西");
        hm.put("2006","意大利");
        hm.put("2010","西班牙");
        hm.put("2014","德国");
        //根据年份找冠军
        getChampionFromYear(hm);
        //根据冠军找年份
        getYearsFromChampion(hm);
    }

    private static void getYearsFromChampion(HashMap<String, String> hm) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的球队国家名称:");
        String team = sc.next();
        //获取所有的年份
        Set<String> yrars = hm.keySet();
        boolean flag = false;
        for (String yrar : yrars) {
            //得到每一年的冠军
            String  champion= hm.get(yrar);
            if(champion.equals(team)){
                System.out.println(team+"获得"+yrar+"年的冠军");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("该队没有获得世界杯冠军");
        }
    }

    private static void getChampionFromYear(HashMap<String, String> hm) {
        //用户输入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的年份:");
        String year = sc.next();
        String value = hm.get(year);
        if(value != null) {
            System.out.println(year+"年的世界杯冠军是"+value);
        }else{
            System.out.println("该年没有举办世界杯");
        }

    }
}
