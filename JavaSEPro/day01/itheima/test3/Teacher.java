package com.itheima.test3;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:12
 * @Description:
 */
public class Teacher extends People{
    private String Wid;

    public Teacher() {
    }

    public Teacher(String name, int age, String wid) {
        super(name, age);
        Wid = wid;
    }

    public String getWid() {
        return Wid;
    }

    public void setWid(String wid) {
        Wid = wid;
    }
    public void teach(){
        System.out.println("教学");
    }
}
