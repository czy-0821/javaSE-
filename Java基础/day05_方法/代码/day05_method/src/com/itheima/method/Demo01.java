package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 10:02
 *
 * 方法的由来
 */

public class Demo01 {
    public static void main(String[] args) {
        // 需求1：产品经理品如给程序员小张下达需求： 打印3次HelloWorld
        printMsg(3,"HelloWorld");     // 调用方法

        // 需求2：产品经理品如给程序员小张下达需求： 打印2次HelloJava
        printMsg(2,"HelloJava");

        // 需求3：产品经理品如给程序员小张下达需求： 打印3次HelloWorld
        printMsg(3,"HelloWorld");

        // 需求4：产品经理品如给程序员小张下达需求： 打印2次SpringAI
        printMsg(2,"SpringAI");

        // 需求5：产品经理品如给程序员小张下达需求： 打印3次HelloWorld
        printMsg(3,"HelloWorld");
    }

    /*
        发现问题：代码中存在大量的重复操作    -- 代码冗余
        解决问题：将重复的代码逻辑抽取到一个方法中，需要使用这段逻辑时，就调用该方法
        方法的好处：提高了代码复用性
     */
    public static void printMsg(int count,String msg){    //参数列表： int count,String msg
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }
}
