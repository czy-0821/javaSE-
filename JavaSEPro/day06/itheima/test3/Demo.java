package com.itheima.test3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * @Author:gy
 * @Date: 2025/08/22 11:26
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //获取当前的日期
        LocalDate now = LocalDate.now();
        System.out.println(now);
        /*//获取属性字段
        int year = now.getYear();
        System.out.println(year);//年
        int monthValue = now.getMonthValue();
        System.out.println(monthValue);//月
       *//* Month month = now.getMonth();
        System.out.println(month);*//*
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        int dayOfWeek = now.getDayOfWeek().getValue();
        System.out.println(dayOfWeek);
        System.out.println("年"+year);
        System.out.println("月"+monthValue);
        System.out.println("日"+dayOfMonth);
        System.out.println("周几"+dayOfWeek);
        //设置时间   直接修改  with***
        LocalDate localDate = now.withYear(2030);
        System.out.println(now.withMonth(6));
        System.out.println(now.withDayOfMonth(25));
        //加减  plus
        System.out.println(now.plusYears(2));
        System.out.println(now.plusMonths(2));
        System.out.println(now.plusWeeks(2));
        //减  minus
        System.out.println(now.minusYears(2));
        System.out.println(now.minusMonths(2));
        System.out.println(now.minusWeeks(2));*/
        //创建指定日志的对象
       // LocalDate localDate = LocalDate.of(2026, 6, 17);
        LocalDate localDate = LocalDate.ofYearDay(2026, 160);
        System.out.println(localDate);
        //最后一个  判断时间
        LocalDate localDate1 = LocalDate.of(202, 6, 17);
        LocalDate localDate2 = LocalDate.of(2027, 5, 18);
        System.out.println(localDate1.equals(localDate2));
        System.out.println(localDate1.isBefore(localDate2));
        System.out.println(localDate1.isAfter(localDate2));


    }
}
