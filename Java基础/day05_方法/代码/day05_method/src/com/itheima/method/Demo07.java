package com.itheima.method;

/**
 * @author 陈辉
 * @data 2025 15:45
 */

public class Demo07 {
    public static void main(String[] args) {

    }
    /*
        方法重载： 同一个类中，多个方法之间，方法名相同，参数不同，与返回值无关。
        参数不同：
            1. 个数不同
            2. 类型不同
            3. 顺序不同
     */
    public static void method(int a){
        System.out.println("第一个方法.....");
    }

    public static void method(double a){
        System.out.println("第二个方法.....");
    }

    public static void method(int a, double b){
        System.out.println("第三个方法.....");
    }
    public static void method(double b,int a){
        System.out.println("第四个方法.....");
    }
}
