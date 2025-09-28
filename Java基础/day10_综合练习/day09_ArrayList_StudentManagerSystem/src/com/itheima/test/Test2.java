package com.itheima.test;

import java.util.Scanner;

/**
 * @author 陈辉
 * @data 2025 18:47
 */

public class Test2 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("三国演义","罗贯中",188);
        books[1] = new Book("西游记","吴承恩",288);
        books[2] = new Book("红楼梦","曹雪芹",198);

        System.out.println("------------------");

        // 显示所有图书信息
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            book.show();
        }

        System.out.println("------------------");
        // 找出价格最高的
        Book maxPrice = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice() > maxPrice.getPrice() ){
                maxPrice = books[i];
            }
        }
        System.out.println("价格最高的书为："+ maxPrice.getName()+"，售价：" + maxPrice.getPrice());

        // 计算所有书的平均价格
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        System.out.println("所有图书平均价格为：" + (sum / books.length));

        // 让用户输入一个价格，输出所有高于该价格的书籍
        System.out.println("请输入一个价格：");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        // 假设没有高于输入的价格的书本
        int count = 0;

        for (int i = 0; i < books.length; i++) {
            if(books[i].getPrice() > price){
                if (++ count == 1){
                    System.out.println("售价高于"+ price+"的图书信息如下：");
                }
                books[i].show();
            }
        }

        if (count == 0){
            System.out.println("暂无图书售价高于"+ price);
        }
    }
}

class Book{
    private String name;
    private String author;
    private int price;

    public void show(){
        System.out.println(name + "..." + author + "..." + price);
    }


    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
