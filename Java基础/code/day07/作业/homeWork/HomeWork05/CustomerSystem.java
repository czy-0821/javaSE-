package com.itheima.homeWork.HomeWork05;

import java.util.ArrayList;

public class CustomerSystem {
    private final ArrayList<Customer> list;


    private CustomerSystem(ArrayList<Customer> list) {
        this.list = list;
    }

    public static CustomerSystem createInstance() {
        return new CustomerSystem(new ArrayList<Customer>());
    }

    // 如果需要传入已有的客户列表
    public static CustomerSystem createInstance(ArrayList<Customer> customers) {
        return new CustomerSystem(customers);
    }

    //查找是否存在该用户名，存在返回true，不存在返回false
    public boolean findCustomer(String username){
        if(this.list.isEmpty())return false;
        for(Customer customer:this.list){
            if(customer.getUserName().equals(username))return true;
        }
        return false;
    }

    //向系统中添加customer对象，判断系统中是否存在重复的用户名，添加成功就返回true
    public boolean addCustomer(Customer c){

        if(!findCustomer(c.getUserName())){
            this.list.add(c);
            return true;
        }
        return false;
    }
}
