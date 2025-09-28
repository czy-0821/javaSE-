package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:54
 * @Description:
 */
public class 搬山术士 extends 盗墓贼{


    public 搬山术士() {
    }

    public 搬山术士(String name, int age) {
        super(name, age);
    }

    @Override
    public void 拿东西() {
        System.out.println("上交国家");
    }

    @Override
    public void 点蜡烛() {
        System.out.println("使用打石点");
    }

    @Override
    public void 打盗洞() {
        System.out.println("使用爆破的模式");
    }

    @Override
    public void 找墓穴() {
        System.out.println("观察自然现象");
    }
}
