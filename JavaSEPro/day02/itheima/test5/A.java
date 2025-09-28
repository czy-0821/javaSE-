package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/16 15:56
 * @Description:
 */
public interface A {
    /*
    这里已经写了2000个接口,几十万的公司实现了这个接口  开源  SDK
    * */
     default void zhibo(){
        System.out.println("直播");
     }
    public static void shangsheng(){
        System.out.println("商城");
        hexin();
        System.out.println("结束");
    }
    private static void hexin(){
        System.out.println("一段核心代码逻辑");
    }
}
