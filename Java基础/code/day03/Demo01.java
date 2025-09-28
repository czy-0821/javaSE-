import java.util.Scanner;

/*
	switch case
*/
public class Demo01{
	public static void main(String[] args){
		//1. 录入星期数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入今天是星期几：");
		int week = sc.nextInt();
		
		//2. 基于week值来进行减肥计划的匹配
		switch(week){
			case 1:
				System.out.println("跑步");
				break;
			case 2:
				System.out.println("游泳");
				break;
			case 3:
				System.out.println("慢走");
				break;
			case 4:
				System.out.println("动感单车");
				break;
			case 5:
				System.out.println("动感单车");
				break;
			case 6:
				System.out.println("动感单车");
				break;
			case 7:
				System.out.println("动感单车");
				break;
			default:
				System.out.println("星期数有误!");
				break;
		}
	
	}
	
}