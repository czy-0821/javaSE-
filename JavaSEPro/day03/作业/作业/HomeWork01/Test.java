package com.itheima.HomeWork.HomeWork01;

public class Test {
    public static void main(String[] args) {
        invokeDirect(() ->{
            System.out.println("导演拍电影了");
        });

        invokeDirect(() -> System.out.println("导演拍电影了"));
    }

    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
