package com.itheima.HomeWork.homeWork01;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private char gender;
    private int age;
    private String nationality;


    public void eat(){}

    public void sleep(){}

    public void work(){}
}
