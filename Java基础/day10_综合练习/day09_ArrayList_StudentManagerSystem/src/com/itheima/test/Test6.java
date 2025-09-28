package com.itheima.test;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 19:52
 */

public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入一个密码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        boolean res = verifyPassword(password);
        System.out.println(password+"，该密码是否验证通过：" + res);
    }

    private static boolean verifyPassword(String password) {
        if (password.length() <8 || password.length() > 16){
            return false;
        }

        // 包含大写字母和数字
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsNumber = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9'){
                containsNumber = true;
            }else if (ch >= 'A' && ch <= 'Z'){
                containsUpperCase = true;
            }else if (ch >= 'a' && ch <= 'z'){
                containsLowerCase = true;
            }
        }

        if (!containsUpperCase || !containsNumber || !containsLowerCase){
            return false;
        }

        return true;
    }


}
