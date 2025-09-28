package com.itheima.ewsz;

/*
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）

    888元的奖金被抽出
    588元的奖金被抽出
    10000元的奖金被抽出
    1000元的奖金被抽出
    2元的奖金被抽出

 */

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //定义一个数组，维护奖池数据
        int[] arr = {2, 588, 888, 1000, 10000};
        //定义一个计数器，用来维护有效抽奖次数
        int count = 0;
        Random r = new Random();
        //开始抽奖
        while (true){
            //当有效抽奖次数 == 奖池中的奖品数量，则表示，所有奖品都被抽完了，那么抽奖程序结束
            if (count == arr.length){
                break;
            }
            //使用随机数，生成数组随机索引，模拟抽奖
            int index = r.nextInt(arr.length);
            if (arr[index] != 0){
                System.out.println(arr[index] + "元的奖金被抽出");
                //将本次抽出的奖品从奖池中移除
                arr[index] = 0;
                //有效抽奖次数+1
                count++;
            }
        }
    }
}
