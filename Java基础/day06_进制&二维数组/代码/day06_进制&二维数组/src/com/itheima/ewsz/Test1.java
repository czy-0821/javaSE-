package com.itheima.ewsz;

/**
 * @author 陈辉
 * @data 2025 15:59
 *
 * 斐波那契数列
 * 不死神兔：
 *      假设有一对兔子，它们永远不死。  它们从第三个月开始，每个月生一对小兔子。
 *      生下来的小兔子也是这么玩。 问：第20个月一共有多少对兔子？
 *
 *      1       --  1
 *      2       --  1
 *      3       --  2
 *      4       --  3
 *      5       --  5
 *      ...
 */

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        //从第三个月开始产生规律： 当前月兔子数量 = 前两个月兔子数量和
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("第20个月兔子数量："+ arr[19]);
    }
}
