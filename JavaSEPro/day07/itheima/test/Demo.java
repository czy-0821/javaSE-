package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:gy
 * @Date: 2025/08/24 9:14
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        List<String> broker = new ArrayList<>();

        /*往牌盒里装牌
         * ♦♣♥♠
         * */
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};

        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //拼接让每个花色都有13张从2-A的牌
        for (String color : colors) {
            for (String number : numbers) {
                broker.add(color + number);
            }
        }

        //加入大小王
        broker.add("小王");
        broker.add("大王");

        // 洗牌，打乱集合中的元素
        Collections.shuffle(broker);

        // 补全代码  定义三个玩家  三个集合
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //发牌 broker集合发给三个人
        for (int i = 0; i < broker.size(); i++) {
            //存进去是什么  取出来就是什么  取出来就是每一张牌
            String poker = broker.get(i);
            if(i>=broker.size()-3){
                dipai.add(poker);
            }else if(i%3==0){
                player01.add(poker);
            }else if(i%3==1){
                player02.add(poker);
            }else if(i%3==2){
                player03.add(poker);
            }
        }
        lookPoker("玩家一",player01);
        lookPoker("玩家二",player02);
        lookPoker("玩家三",player03);
        lookPoker("底牌",dipai);

    }

    private static void lookPoker(String name, ArrayList<String> dipai) {
        System.out.print(name+"的牌是:");
        for (String poker : dipai) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
