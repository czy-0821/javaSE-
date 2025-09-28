package com.itheima.test5;

import java.util.*;



/**
 * @Author:gy
 * @Date: 2025/08/25 17:03
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个数组
        String [] str = {"篮球","足球","鞋子","安全帽"};
        //生成一个创建取货码的方法
        HashSet<String> hs = creatQuHuoNum();
        System.out.println("产生的取货码是"+hs);
        HashMap<String,String> hm = putValuestoMap(str,hs);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入取货码: 如要退出  请按0");
            String key = sc.next();
            if("0".equals(key)){
                System.out.println("欢迎下次光临");
                return;
            }
            String s = checkKeyForMap(key, hm);
            System.out.println(s);
        }

    }

    private static String checkKeyForMap(String key, HashMap<String, String> map) {
        return map.get(key) == null ? "对不起!取货码有误":map.get(key);
    }

    private static HashMap<String, String> putValuestoMap(String[] arr, HashSet<String> hs) {
        //让数组和取货码产生对应关系
        HashMap<String, String> hm = new HashMap<>();
        int i = 0;
        for (String h : hs) {
            hm.put(h,arr[i]);
            i++;
        }
        return hm;
    }

    private static HashSet<String> creatQuHuoNum() {
        //有一个HashSet存取取货码
        HashSet hs = new HashSet<String>();
        while(hs.size() < 4){
            //生成取货码存入HashSet
           String  num =  creatQuHuoNumStr(6);
           hs.add(num);
        }
        return hs;
    }

    private static String creatQuHuoNumStr(int count) {
        //字符串拼接想到  sb
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        //6个10以内的整数
        for (int i = 0; i < count; i++) {
            int j = random.nextInt(10);
            sb.append(j);
        }
        return sb.toString();
    }
}
