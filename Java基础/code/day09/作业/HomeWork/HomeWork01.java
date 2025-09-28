package com.itheima.HomeWork;

import java.util.ArrayList;

public class HomeWork01 {
    public static int index = 0;
    public static void main(String[] args) {

        ArrayList<Tram> trams = new ArrayList<>();
        trams.add(new Tram("小米",240000,(int)(Math.random()*2001)));
        trams.add(new Tram("比亚迪",200000,(int)(Math.random()*2001)));
        trams.add(new Tram("特斯拉",340000,(int)(Math.random()*2001)));




        trams.forEach(HomeWork01::searchDistanceOver);
        if(index==3) System.out.println("没有行驶距离在1000以下的电车");
    }

    public static void searchDistanceOver(Tram t){
        if(t.getDistance()>=1000){
            index++;
        }else System.out.println(t.toString());

    }
}
