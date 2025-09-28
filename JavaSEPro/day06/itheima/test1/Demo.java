package com.itheima.test1;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @Author:gy
 * @Date: 2025/08/22 9:52
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
      /*  //获取当前的时间
        Date date = new Date();
        System.out.println(date);
        //有参构造
        long l = System.currentTimeMillis();
        //表示明天的此时此刻
        Date date1 = new Date(l+24*60*60*1000);
        System.out.println(date1);
        //getTime():获取日期的毫秒值
        long time = date.getTime();
        System.out.println(time);
        System.out.println(l);*/
        //设置时间的毫秒值   setTime();   new Date + setTime() = new Date(time);
        Date date = new Date();
        long l = System.currentTimeMillis();
        date.setTime(l+24*60*60*1000);
        //我们习惯的看时间的方式  年-月-日  时:分:秒
        System.out.println(date);
    }
}
