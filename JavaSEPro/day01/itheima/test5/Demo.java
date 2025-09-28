package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:55
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        摸金校尉 m1 = new 摸金校尉("胡八一", 28);
        m1.盗墓();
        搬山术士 b1 = new 搬山术士();
        b1.setName("八一");
        b1.setAge(28);
        System.out.println(m1.getName()+"---"+m1.getAge());
        b1.盗墓();
    }
}
