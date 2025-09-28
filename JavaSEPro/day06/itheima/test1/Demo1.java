package com.itheima.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:gy
 * @Date: 2025/08/22 10:09
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        //生成指定格式的日期模板
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //将日期进行格式化
        String date1 = sdf.format(new Date());
        System.out.println(date1);
        System.out.println("==================================");
        //将字符串转成日期
        String str = "2020/8/22/ 10:16:25";
        //将字符串解析成日期  有一个解析模板
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        Date parse = sdf1.parse(str);
        System.out.println(parse);
    }
}
