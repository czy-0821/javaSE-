package com.itheima.homeWork.HomeWork04;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        String[] color={"红色","灰色","银白色","蓝色","绿色"};
        int[]  capacity={5,22,25,30};
        String[] mode={"手动净水","自动净水","过滤净水","抑菌装置净水"};

        Scanner sc =new Scanner(System.in);

        Fridge f = new Fridge(color,capacity,mode);

        System.out.print("机体颜色:  ");
        for(String c:f.getColor())
            System.out.print(c+"  ");
        System.out.println();


        System.out.print("容量:  ");
        for(int p:f.getCapacity())
            System.out.print(p+"L  ");
        System.out.println();


        System.out.print("净水模式:  ");
        for(String m:f.getMode())
            System.out.print(m+"  ");
        System.out.println();

        System.out.println("请选择(输入编号[1,x]):");
        System.out.println("机体颜色:");
        int c = sc.nextInt();
        System.out.println("容量");
        int p = sc.nextInt();
        System.out.println("净水模式");
        int m = sc.nextInt();
        System.out.println("选择数量");
        int number = sc.nextInt();


        frideDemo f1=new frideDemo(f.getColor()[c-1],f.getCapacity()[p-1],f.getMode()[m-1]);

        ShoppingTrolley shoppingTrolley=new ShoppingTrolley(f1,number);
        shoppingTrolley.addAllToShoppingTrolley();
    }
}
