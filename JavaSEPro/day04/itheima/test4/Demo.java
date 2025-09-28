package com.itheima.test4;

import java.math.BigDecimal;

/**
 * @Author:gy
 * @Date: 2025/08/19 11:06
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        /*
         3.3333333333333335并不是最终的结果,正确的结果应该是3.333无限循环,为什么这里会输出这个结果
         计算机的底层,首先把十进制的数字转换为2进制来进行计算,然后把结果在转成10进制进行展示.如果是整数,没有
         任何问题的,但是如果是小数的话,在转成2进制的时候,由于计算机存储机制的问题,他会造成数据丢失.在这个时候,他会
         使用一个无限接近这个数的二进制来表示这个小数. 虽然误差很小,但是在金融行业,银行行业,做支付类相关牵扯到金钱
         交易的时候,一分一毫都不能查,支付相关业务,精确到小数点后面多少多少位,这个写法肯定不行.BigDecimal
        * */
        //System.out.println(10/3.0);
        BigDecimal b1 = new BigDecimal(10.0);//10
        BigDecimal b2 = new BigDecimal("10.00000");
        System.out.println(b1);
        System.out.println(b2);
    }
}
