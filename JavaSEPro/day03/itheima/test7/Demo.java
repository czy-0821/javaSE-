package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/18 15:07
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //传统的模式 war
        CalcImpl calc = new CalcImpl();
        getCalc(calc);
        //匿名内部类
        getCalc(new Calc() {
            @Override
            public int calcing(int a, int b, int c) {
                return a*b*c;
            }
        });
        //lambda
        getCalc((a,b,c)-> a+b*c );

    }
    public static void getCalc(Calc c){
        int a = c.calcing(2,6,3);
        System.out.println(a);
    }
}
