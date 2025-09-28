package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/25 9:02
 * @Description:
 */
public class Book implements Comparable<Book>{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int result = this.price - o.price;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }

}
