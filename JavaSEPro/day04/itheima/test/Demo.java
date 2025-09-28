package com.itheima.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author:gy
 * @Date: 2025/08/19 8:42
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //定义一个集合装红包
        ArrayList<Integer> redPackets = new ArrayList<>();
        redPackets.add(9);
        redPackets.add(666);
        redPackets.add(188);
        redPackets.add(520);
        redPackets.add(99999);
        //键盘录入对象  需要按任意键
        Scanner scanner = new Scanner(System.in);
        //随机  随机数
        Random rand = new Random();
        while (!redPackets.isEmpty()) {
            System.out.print("按任意键抽奖:");
            scanner.next();
            //集合的长度是可变了  每一次抽完集合的索引会自动变化  0到集合的长度-1
            int index = rand.nextInt(redPackets.size());
            Integer price = redPackets.remove(index);
            System.out.println("恭喜您,您抽中了:"+price);
        }
        System.out.println("活动结束");
    }
}
