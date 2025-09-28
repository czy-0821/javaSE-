package com.itheima.HomeWork.HomeWork02;

public class Test {
    public static void main(String[] args) {
        invokeCalc((int x,int y)->{
            return x-y;
        });

        invokeCalc((x,y) -> x-y);
    }

    private static void invokeCalc( Calculator c){
        int num = c.calc(130,120);
        System.out.println("130-120=" + num);
    }
}
