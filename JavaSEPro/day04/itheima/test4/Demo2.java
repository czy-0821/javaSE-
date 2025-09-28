package com.itheima.test4;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:gy
 * @Date: 2025/08/19 11:34
 * @Description:
 */
public class Demo2 {
    /*
          1.定义一个电车类  Tram   品牌  价格  行驶公里
          2.创建三个电车类   品牌 价格自拟  行驶公里数  随机产生1-3000公里
          3.将电车存入集合,遍历集合,将1000公里以内的电车打印出来,如果没有1000公里以内的,就打印没有没有1000公里以内的电车
    * */
    //得有一个存电车的集合
    public static void main(String[] args) {
        ArrayList<Tram> trams = new ArrayList<>();
        Random random = new Random();
       // int km = random.nextInt(3000) + 1;
        Tram tram1 = new Tram("小刀",3999, random.nextInt(3000) + 1);
        Tram tram2 = new Tram("卫士",4999, random.nextInt(3000) + 1);
        Tram tram3 = new Tram("绿源",4999, random.nextInt(3000) + 1);
        trams.add(tram1);
        trams.add(tram2);
        trams.add(tram3);
        //以上叫数据源  从数据库拿的
        //标记  随便打
      //  int a = 10;
        boolean flag = true;
        for (int i = 0; i < trams.size(); i++) {
            //集合存进去的是什么,取出来就是什么
            Tram tram = trams.get(i);
            //对象里面有属性
            if(tram.getKm()<=1000){
                System.out.println(tram.getBrand()+"电动车的价格是"+tram.getPrice()+",行驶"+tram.getKm()+"公里");
               flag = false;
            }
        }
        if(flag){
            System.out.println("没有行驶1000公里以下的车");
        }
    }
}
