package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/21 9:19
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        jdk1.5的特性
          自动装箱
          装箱:把一个基本数据类型变成对应的包装类型
          自动:java底层会自动调用valueof方法
          自动拆箱: 把一个包装类型  变成对应的基本数据类型
        * */
        Integer i = 100;  //int  i  = 100;
       // i = null;
        i+=200;  //i = i + 200
        System.out.println(i);
    }
}
