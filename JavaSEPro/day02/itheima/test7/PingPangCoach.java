package com.itheima.test7;

/**
 * @Author:gy
 * @Date: 2025/08/16 16:59
 * @Description:
 */
public class PingPangCoach extends Person implements SpeckEnglish,Teach{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃小米粥");
    }

    @Override
    public void speckEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void teach() {
        System.out.println("教如何发球");
    }
}
