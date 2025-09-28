package com.itheima.test5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:gy
 * @Date: 2025/08/19 15:26
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        String s = "来黑马程序员学习Java，\\n\" +\n" +
                "                \"        电话：1866668888，18699997777\\n\" +\n" +
                "                \"        或者联系邮箱：boniu@itcast.cn，\\n\" +\n" +
                "                \"        座机电话：01036517895，010-98951256\\n\" +\n" +
                "                \"        邮箱：bozai@itcast.cn，\\n\" +\n" +
                "                \"        邮箱：dlei0009@163.com，\\n\" +\n" +
                "                \"        热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        //制定一个规则:  手机号或者邮箱或者400号码
        String regex = "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})"
                + "|(400-?\\d{3,7}-?\\d{3,7})";
        //用到 Pattern  Compile的方法将我们写的正则表达式编译为一个模式
        Pattern pattern = Pattern.compile(regex);
        //创建一个匹配器
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
