package com.itheima.test4;

/**
 * @Author:gy
 * @Date: 2025/08/21 15:53
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArr(arr);

    }

    private static void printArr(int[] arr) {
        try {
            arr = null;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("bbb");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组不能为空111");
        } catch (NullPointerException e) {
            System.out.println("1111");
        }catch (Exception e) {
            System.out.println("1111");
        }
    }
}
