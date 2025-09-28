package com.itheima.test8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/19 17:26
 * @Description:
 */
public class Demo {
    //获取日志类的对象 工厂设计模式  从工厂里面拿  面向对象  Spring  面向切面编程
   private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        //记录的时候  类似于打印日志
        LOGGER.debug("用户开始输入信息了");
        String name = sc.nextLine();
        LOGGER.info("用户输入的姓名是"+name);
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        //System.out.println("用户输入的年龄是"+age);
        LOGGER.debug("用户输入的年龄是"+age);
    }
}
