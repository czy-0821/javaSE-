package com.itheima.test;

/**
 * @Author:gy
 * @Date: 2025/08/22 9:04
 * @Description:
 */
public class Demo {
    public static void main(String[] args){
        int[] arr = new int[0];
        //提示:下面这一行代码会导致方法内抛出“空指针异常”,需要你补充一些代码,使让程序继续执行
        try {
            int n1 = getMax(null);
        } catch (NullPointerException e) {
            System.out.println("数组的地址不能为空");
        }
        //提示:下面这一行代码会导致方法内抛出“索引越界异常”,需要你补充一些代码,使让程序继续执行
        try {
            int n2 = getMax(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组的索引不能超过长度");
        }
        int[] arr2 = {1,2,4,24,32,5324,32};
        int n3 = getMax(arr2);
        System.out.println("程序终于执行完了...");
    }
    //获取数组最大值
    public static int getMax(int[] args){
        int max = args[0];
        for(int i = 1 ; i < args.length ; i++){
            if(max < args[i]){
                max = args[i];
            }
        }
        return max;
    }
}
