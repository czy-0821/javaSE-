package com.itheima.string;

import java.util.Scanner;

/*
    设计一个程序，模拟用户登陆，效果如下：
    请输入用户名：
    admin
    请输入密码：
    123123
    用户名或密码错误,今日还剩2次机会!
    请输入用户名：
    admin1
    请输入密码：
    654321
    用户名或密码错误,今日还剩1次机会!
    请输入用户名：
    admin
    请输入密码：
    123456
    恭喜你，登陆成功!
 */
public class Test1 {
    public static void main(String[] args) {
        // 1. 定义两个变量，模拟正确用户名密码
        String username = "admin";
        String password = "123456";

        // 2. 拿到用户输入的用户名密码
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String usernameInput = sc.next();
            System.out.println("请输入密码：");
            String pwdInput = sc.next();

            // 3. 比较数据
            if (username.equals(usernameInput) && password.equals(pwdInput)) {
                System.out.println("恭喜你，登陆成功!");
                break;
            } else {
                if(i == 3){
                    System.out.println("用户名或密码错误，今日次数已用完，明天再试!");
                }else {
                    System.out.println("用户名或密码错误,今日还剩" + (3 - i) + "次机会!");
                }
            }
        }

    }
}
