package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/15 15:47
 * @Description:
 */
public  class 盗墓贼 {
    private String name;
    private int age;
    public 盗墓贼() {
    }
    public 盗墓贼(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //盗墓  制定规则
    public final void 盗墓(){
        找墓穴();
        打盗洞();
        点蜡烛();
        拿东西();
    }

    public void 拿东西() {
        System.out.println("拿东西");
    }

    public void 点蜡烛() {
        System.out.println("点蜡烛");

    }

    public void 打盗洞() {
        System.out.println("打盗洞");

    }
    public void 找墓穴() {
        System.out.println("找墓穴");
    }
}
