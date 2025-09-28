package com.itheima.test2;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author:gy
 * @Date: 2025/08/22 11:06
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //通过静态方法获取对象
        Calendar cd = Calendar.getInstance();
        System.out.println(cd);
        //获取日志  日历转成日期
        Date time = cd.getTime();
        System.out.println(time);
        //获取毫秒值
        long timeInMillis = cd.getTimeInMillis();
        System.out.println(timeInMillis);
        //set  修改日历中的某个信息
        cd.set(Calendar.MONTH,9);
        System.out.println(cd.getTime());
        System.out.println("=============================");
        //对日历进行增加或者减少
        cd.add(Calendar.YEAR,-2);
        System.out.println(cd.getTime());
        System.out.println("===================");
        cd.set(2030,2,12);
        System.out.println(cd.getTime());
    }
}
