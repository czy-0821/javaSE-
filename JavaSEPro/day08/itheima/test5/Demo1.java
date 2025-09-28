package com.itheima.test5;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * @Author:gy
 * @Date: 2025/08/25 15:31
 * @Description:
 */
public class Demo1 {
    /*
         网络投票选出最佳人气歌手  男女各一名
         女歌手  String[] woMan = {"小乔","大乔","那英","王菲"};
         男歌手  String[] man = {"张杰","蔡徐坤","周杰伦","陈楚生"};
         为每位歌手随机生成票数  0-100票(包含0和100)
         分别选出票数最多的两位男女歌手,将得票最高的歌手打印出来
         2025年最佳人气歌手获得者是:xxx,xxx
         同性别的歌手票数不能相同    key:票   value 明星
    * */
    public static void main(String[] args) {
        //考虑将两个数组分别存到男的和女的明星的集合里面
        String[] woManArr = {"小乔","大乔","那英","王菲"};
        String[] manArr = {"张杰","蔡徐坤","周杰伦","陈楚生"};
        //两个明确  参数  返回值类型
        HashMap<Integer,String> woManMap = putValuetoMap(woManArr);
        HashMap<Integer,String> manMap = putValuetoMap(manArr);
        //找出集合中 票数最高的歌手
        String name1 =  getMaxNumFromMap(woManMap);
        String name2 =  getMaxNumFromMap(manMap);
        System.out.println("2025年最佳人气歌手获得者是:"+name1+","+name2);
    }

    private static String getMaxNumFromMap(HashMap<Integer, String> map) {
        System.out.println(map);
        Set<Integer> setNum = map.keySet();
        int maxNum = 0;
        for (Integer num : setNum) {
            if (maxNum < num) {
                maxNum = num;
            }
        }
        return map.get(maxNum);
    }

    private static HashMap<Integer, String> putValuetoMap(String[] arr) {
        HashMap<Integer, String> hm = new HashMap<>();
        //随机票数  随机数
        Random r = new Random();
        //集合的个数如果小数数组的个数   说明我们集合产生的key票数,没满,有明星没有票数
        //如果有相同的票数,明星就被覆盖
        int i = 0;
        while(hm.size()<arr.length){
            int num = r.nextInt(100)+1;
            if(!hm.containsKey(num)){
                hm.put(num,arr[i]);
                i++;
            }
        }
        return hm;
    }
}
