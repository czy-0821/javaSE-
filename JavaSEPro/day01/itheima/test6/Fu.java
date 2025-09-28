package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/15 16:12
 * @Description:
 */
public class Fu {
    public void show1(){
        System.out.println("show1");
    }
    protected void show2(){
        System.out.println("show2");
    }
    void show3(){
        System.out.println("show3");
    }
    private void show4(){
        System.out.println("show4");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
    }
}
