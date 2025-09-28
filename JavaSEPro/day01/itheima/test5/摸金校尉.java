package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:51
 * @Description:
 */
public class 摸金校尉 extends 盗墓贼{
    //ctrl+o

    public 摸金校尉() {
    }

    public 摸金校尉(String name, int age) {
        super(name, age);
    }

    @Override
    public void 拿东西() {
        System.out.println("上交国家");
    }

    @Override
    public void 点蜡烛() {
        System.out.println("使用打火机点");
    }

    @Override
    public void 打盗洞() {
        System.out.println("使用洛阳铲");
    }

    @Override
    public void 找墓穴() {
        System.out.println("寻龙点穴");
    }
}
