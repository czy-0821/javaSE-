package com.itheima.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author:gy
 * @Date: 2025/08/21 14:43
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
               show();
    }
    public static void show() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse("2025-12-12");
    }
}
