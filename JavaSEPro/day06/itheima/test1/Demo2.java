package com.itheima.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:gy
 * @Date: 2025/08/22 10:32
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //字符串的时间--->转成日期的时间---->转成时间毫秒值---判断毫秒值在不在秒杀的毫秒值范围内
        //秒杀开始时间和结束时间
        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";
        //字符串怎么转成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        //小贾和小皮的下单时间 将字符串时间解析成日期
        String xiaoJia = "2020年11月11日 00:03:47";
        String xiaoPi =  "2020年11月11日 00:10:11";
        Date xiaoJiaDate = sdf.parse(xiaoJia);
        Date xiaoPiDate = sdf.parse(xiaoPi);
        //获取所有日期类的毫秒值
        long startL = startDate.getTime();
        long endL = endDate.getTime();
        long xiaoJiaL = xiaoJiaDate.getTime();
        long xiaoPiL = xiaoPiDate.getTime();
        if (xiaoJiaL>=startL&&xiaoJiaL<=endL) {
            System.out.println("小贾参加秒杀成功");
        }else{
            System.out.println("小贾未参加秒杀活动");
        }
        if (xiaoPiL>=startL&&xiaoPiL<=endL) {
            System.out.println("小皮参加秒杀成功");
        }else{
            System.out.println("小pi未参加秒杀活动");
        }
    }
}
