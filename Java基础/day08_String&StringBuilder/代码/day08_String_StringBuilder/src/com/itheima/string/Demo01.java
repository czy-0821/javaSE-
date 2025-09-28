package com.itheima.string;

/*
    String常用创建方式：
            public String() : 创建一个空白字符串对象，不含有任何内容
            public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
            public String(byte[] bys) : 根据字节数组的内容，来创建字符串对象
            public String(String original) : 根据传入的字符串内容，来创建字符串对象
            String s = “abc”;  直接赋值的方式创建字符串对象，内容就是abc
 */

public class Demo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1 = " + s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2 = " + s2);

        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3 = " + s3);

        String s4 = new String(s3);
        System.out.println("s4 = " + s4);

        String s5 = "abc";
        System.out.println("s5 = " + s5);

        String s6 = "abc";
        System.out.println("s6 = " + s6);
        System.out.println(s6 == s5);
        System.out.println(s6 == s4);
    }
}
