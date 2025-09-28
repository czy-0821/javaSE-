package com.itheima.test3;

import java.time.LocalTime;

/**
 * @Author:gy
 * @Date: 2025/08/22 11:50
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        /*LocalTime now = LocalTime.now();
        System.out.println(now);*/
       /* //取值
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        //修改至  with***
        System.out.println(now.withHour(14));
        System.out.println(now.withMinute(14));
        System.out.println(now.withSecond(14));
        System.out.println(now.withNano(14));*/
        //加减时间  plus  minus
      /*  System.out.println(now.plusHours(2));
        System.out.println(now.plusMinutes(2));
        System.out.println(now.plusSeconds(2));
        System.out.println(now.plusNanos(2));*/
        //设置指定时间
        LocalTime localTime1 = LocalTime.of(11, 12, 36, 2563);
        LocalTime localTime2 = LocalTime.of(12, 25, 17, 23);
        //比较
        boolean a = localTime1.isBefore(localTime2);
        boolean  b= localTime1.isAfter(localTime2);
        boolean c = localTime1.equals(localTime2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
