package com.itheima.stringbuilder;

/**
 * @author 陈辉
 * @data 2025 16:22
 *
 * StringBuilder练习1： 拼接数组
 */

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        String res = arrayToString(arr);
        System.out.println("res = " + res);
    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length -1) {
                sb.append(arr[i]).append(", ");
            }else{
                sb.append(arr[i]).append("]");
            }
        }

        return sb.toString();
    }
}
