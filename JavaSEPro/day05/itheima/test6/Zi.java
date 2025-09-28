package com.itheima.test6;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author:gy
 * @Date: 2025/08/21 17:14
 * @Description:
 */
public class Zi extends Fu{
    @Override
    public void show1() throws RuntimeException{

    }

    @Override
    public void show2() throws ArithmeticException {

    }

    @Override
    public void show3() {

    }

    @Override
    public void show4() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM-dd");
        try {
            simpleDateFormat.parse("2025-12-01");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
