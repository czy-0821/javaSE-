package com.itheima.homeWork.HomeWork05;

public class Customer {
    private String phoneNumber;
    private String name;
    private String personNumber;
    private String userName;
    private String address;


    public Customer() {
    }

    public Customer(String phoneNumber, String name, String personNumber, String userName, String address) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.personNumber = personNumber;
        this.userName = userName;
        this.address = address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
