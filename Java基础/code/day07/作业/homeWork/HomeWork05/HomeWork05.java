package com.itheima.homeWork.HomeWork05;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Customer c1 = new Customer("15083693875","张三",
                "360381195508212356","学员一号","123456");
        Customer c2 = new Customer("19583693875","李四",
                "360381195508213356","学员二号","123456");
        customers.add(c1);
        customers.add(c2);

        CustomerSystem cs = CustomerSystem.createInstance(customers);

        // 正确的输入方式
        System.out.print("请输入手机号:");
        String phonenumber = sc.next();
        System.out.print("请输入姓名:");
        String name = sc.next();
        System.out.print("请输入身份证号:");
        String personnumber = sc.next();
        System.out.print("请输入用户名:");
        String username = sc.next();
        System.out.print("请输入地址:");
        String address = sc.next();

        Customer c3 = new Customer(phonenumber, name, personnumber, username, address);

        // 使用同一个CustomerSystem实例
        while (!cs.addCustomer(c3)) { // 假设CustomerSystem有addCustomer(Customer)方法
            System.out.println("--------------------");
            System.out.println("创建失败，请重新输入！！！");
            System.out.println("--------------------");

            System.out.print("请输入手机号:");
            phonenumber = sc.next();
            System.out.print("请输入姓名:");
            name = sc.next();
            System.out.print("请输入身份证号:");
            personnumber = sc.next();
            System.out.print("请输入用户名:");
            username = sc.next();
            System.out.print("请输入地址:");
            address = sc.next();

            // 更新Customer对象的属性
            c3.setPhoneNumber(phonenumber);
            c3.setName(name);
            c3.setPersonNumber(personnumber);
            c3.setUserName(username);
            c3.setAddress(address);
        }

        System.out.println("程序运行完毕!!");
    }
}
