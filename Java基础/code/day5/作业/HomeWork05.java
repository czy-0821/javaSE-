package com.itheima.HomeWork;

import java.util.Scanner;

/*定义一个方法，该方法可以判断两个数组是否完全一致（长度一致，内容一致，顺序一致，称
之为完全一致。） 例如：{1,2,3} 和{1,2,3} 是完全一致的。{1,2,3} 和{3,2,1} 不是完全一致的
*/
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[]list1 = {1,2,3,4,5};
        int[]list2 = {1,2,3,4,5};

        IsSame(list1, list2);
    }

    public static void IsSame(int[] list1, int[] list2) {
        boolean flag = false;
        if(list1.length == list2.length){
            for (int i = 0; i < list1.length; i++) {
                if(list1[i] != list2[i]){break;}
            }
            flag = true;
        }

        System.out.printf("两个数组相同" + flag);
    }
}
