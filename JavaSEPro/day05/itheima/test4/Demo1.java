package com.itheima.test4;

import java.text.ParseException;

import static com.itheima.test4.Demo.show;

/**
 * @Author:gy
 * @Date: 2025/08/21 15:15
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args)  {
        method();
    }

    private static void method() {
        int [] arr = null;
        if(null == arr){
          /*System.out.println("数组地址不能为空");
          return;*/
            /*就是做判断的时候,错误的内容是不能访问我们的代码,之前我们在控制台
            此时如果上线了,我们是没有控制台可以看的,所以我们才用抛异常的方式,
            既终止了代码,也让这个错误记录在日志中.
             */
            throw new NullPointerException("数组不能为空");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
