package com.itheima.HomeWork.homeWork02;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Woker {
    private String name;
    private String wordId;
    private double salary;

    public void work(){}
}
