package com.itheima.test9;

import java.sql.Array;
import java.util.*;

/**
 * @Author:gy
 * @Date: 2025/08/18 16:51
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        /*a.1.用户录入    2.随机产生   3.退出
          b.1.6个红球(用户录入  随机) 1个篮球(用户录入 随机)
          c.红球和篮球 按照指定格式输出  红球:[5,9,11,21,23,26],蓝球[5]

          Ctrl+Alt+t
        */
        Scanner sc = new Scanner(System.in);
        out:while (true) {
            System.out.println("请输入您的选择 1.用户录入 2.随机机打 3.按其他键退出");
            //键盘录入  Scanner
            String choic = sc.next();
            switch (choic) {
                case "1":
                   // System.out.println("用户录入");
                   ArrayList<Integer> redBalls =  inputRedBalls();
                   int blueBall = inpurBlueBall(sc);
                    System.out.println("您输入的双色球彩票为红球是"+redBalls+",篮球是"+blueBall);
                   break;
                case "2":
                    //System.out.println("随机机打");
                    ArrayList<Integer> redBalls1 =  RandomRedBalls();
                    int blueBall1 = randomBlueBall();
                    System.out.println("您输入的双色球彩票为红球是"+redBalls1+",篮球是"+blueBall1);
                    break;
                default:
                    System.out.println("退出");
                   break out;
                   // return;
                   // System.exit(0);
           }
        }
    }

    private static int randomBlueBall() {
        Random random = new Random();
        return random.nextInt(16)+1;
    }

    private static ArrayList<Integer> RandomRedBalls() {
        ArrayList<Integer> redBalls = new ArrayList<>();
        Random random = new Random();
        //指定  随机1-33
        while(redBalls.size()<6){
            int redBall = random.nextInt(33)+1;
            if(!redBalls.contains(redBall)){
                redBalls.add(redBall);
            }
        }
        //将集合排序后返回
        Collections.sort(redBalls);
        return redBalls;
    }

    private static int inpurBlueBall(Scanner sc) {
      /*  boolean flag = false;//假装输入的篮球不符法
        int blueBall = 0;
        while(!flag){
            System.out.println("请输入一个蓝色:(1-16之间)");
            blueBall = sc.nextInt();
            if(blueBall>=1&&blueBall<=16){
                flag = true;
            }else{
                System.out.println("您输入的蓝色不符合条件");
            }
        }*/
        while(true){
            System.out.println("请输入一个蓝色:(1-16之间)");
            int blueBall = sc.nextInt();
            if(blueBall>=1&&blueBall<=16){
               return blueBall;
            }else{
                System.out.println("您输入的蓝色不符合条件");
            }
        }
    }

    private static ArrayList<Integer> inputRedBalls() {
        //红球需要存在集合中
        ArrayList<Integer> redBalls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(redBalls.size() < 6){
            System.out.println("请输入第"+(redBalls.size()+1)+"个球个红球号码(1-33)之间,不能重复");
            int redball = sc.nextInt();
            //希望有一个方法判断这个红球是都合法  不重复 并且  1-33之间
           if(isValidRed(redball,redBalls)){
               redBalls.add(redball);
           }else{
               System.out.println("您输入的无效,请重新输入");
           }
        }
        //将集合排序后返回
        Collections.sort(redBalls);
        return redBalls;
    }

    private static boolean isValidRed(int redball, ArrayList<Integer> al) {
       return redball>=1&&redball<=33&&!al.contains(redball);
    }
}
