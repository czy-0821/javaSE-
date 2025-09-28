import java.util.Scanner;

/*
	switch 注意事项：
		1. case穿透： 如果case语句，省略break，就会发生向下穿透现象。
					  如果多个case条件，处理逻辑相同，则推荐使用case穿透，从而提高代码复用性!
		2. switch小阔号中的值类型只支持：
					   byte,short,int,char, jdk1.5开始支持枚举， jdk1.7开始支持字符串String
	    3. case 后面的值不能重复!
*/
public class Demo02{
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
			case 5:
			case 6:
			case 7:
				System.out.println("动感单车");
				break;
			default:
				System.out.println("星期数有误!");
				break;
		}
	
	}
	
}