package com.itheima.test3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * @Author:gy
 * @Date: 2025/08/24 17:19
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        //提示用户输入5个字符串存到集合中
        ArrayList<String> al = new ArrayList<>();
        //输入键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个字符串:");
            String s = sc.nextLine();
            al.add(s);
        }
        //集合里面就有了五个字符串
         al.removeIf(s-> s.length() <3);
       /* al.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() <3;
            }
        });*/
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            if(s.endsWith("a")){
                //将末尾的a修改为0
                String substring = s.substring(0, s.length() - 1);
               // String newS = substring+"0";
                String newS = substring.concat("0");
                al.set(i, newS);
            }
        }

        //遍历
        al.forEach(s-> System.out.println(s));
    }
}
