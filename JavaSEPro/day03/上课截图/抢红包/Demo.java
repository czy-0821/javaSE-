package com.itheima.HomeWork.Practice01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> redEnvelopes = new ArrayList<>();
        redEnvelopes.add(9);
        redEnvelopes.add(666);
        redEnvelopes.add(188);
        redEnvelopes.add(520);
        redEnvelopes.add(99999);

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (!redEnvelopes.isEmpty()){
            System.out.print("请按任意键完成抽奖:");
            String s =sc.next();
            System.out.println("恭喜您，您抽中了:" + redEnvelopes.remove(r.nextInt(redEnvelopes.size())));
        }

        System.out.println("活动结束。。。。。");
    }
}
