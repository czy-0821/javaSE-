package com.itheima.test;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author:gy
 * @Date: 2025/08/25 9:02
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        //键盘录入书名和价格
        Scanner sc = new Scanner(System.in);
        //存到我们的set集合中
        TreeSet<Book> ts = new TreeSet<>();
        int i = 1;
        while (true) {
            System.out.println("请输入第"+i+"本书的名称:");
            String bookName = sc.next();
            System.out.println("请输入第"+(i++)+"本书的价格(整数):");
            int bookprice= sc.nextInt();
            Book book = new Book(bookName, bookprice);
            ts.add(book);
            System.out.println("添加"+bookName+"书已经成功,继续添加请输入1.输入其他数字将结束!");
            int anInt = sc.nextInt();
            if(anInt!=1){
                break;
            }
        }

        System.out.println("你一共添加了"+ts.size()+"本书,分别是:");
        for (Book t : ts) {
            System.out.println(t);
        }

    }
}
