package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/16 17:04
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer("小帅", 19);
        ppp.speckEnglish();
        ppp.study(ppp.getName());
        System.out.println("我叫"+ppp.getName()+",今年"+ppp.getAge()+"岁");
        BasketballCoach bbc = new BasketballCoach();
        bbc.setName("小美");
        bbc.setAge(25);
        bbc.eat();
        System.out.println("我叫"+bbc.getName()+",是篮球教练,今年"+bbc.getAge()+"岁了");
    }
}
