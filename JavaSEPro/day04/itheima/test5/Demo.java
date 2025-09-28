package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/19 14:38
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //检验qq号是否合法
        String qq = "810a05201";
        boolean b = checkQQ1(qq);
        //Ctrl+Alt+m
        //boolean b = checkQQ(qq);
        if (b){
            System.out.println("合法");
        }else{
            System.out.println("不合法");
        }

    }

    private static boolean checkQQ1(String qq) {
        //18156628868@163.com
        //\^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$
        return qq!=null && qq.matches("[1-9][0-9]{4,10}");
    }

    private static boolean checkQQ(String qq) {
        //判断qq号不能为null qq号的长度  5-11位
        if(qq ==null|| qq.length()<5|| qq.length()>11){
            System.out.println("qq号不合法");
            return false;
        }
        /*如果代码能走到这里 说明满足上面的条件
         1.不能以0开头
         2.并且每一位都是数字
        * */
        if(qq.startsWith("0")){
            return false;
        }
        //如果能走到这里  继续判断后面的规则
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if(!(c>='0' && c<='9')){
                return false;
            }
        }
        //能走到这里  说明都符合条件  合法的qq号
        return true;
    }
}
