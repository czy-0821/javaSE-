package com.itheima.test3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author:gy
 * @Date: 2025/08/22 11:59
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2025, 12, 25, 11, 25, 36, 23);
        LocalDateTime ld2 = LocalDateTime.of(2026, 11, 24, 12, 32, 18, 232);
        System.out.println(ld1);
        System.out.println(ld2);
        LocalDate localDate = ld1.toLocalDate();
        LocalTime localTime = ld2.toLocalTime();
        LocalDateTime ld3 = LocalDateTime.of(localDate, localTime);


    }
}
