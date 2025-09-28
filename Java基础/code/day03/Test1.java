import java.util.Scanner;

/*
	需求：键盘录入月份，匹配对应的季节并打印，要求使用case穿透。效果如下：
	请输入月份：
	12
	12月是冬季
	
	请输入月份：
	3
	3月是春季
	
	请输入月份：
	4
	4月是春季
	
	switch case只适用情况有限的等值匹配！
*/
public class Test1{
	public static void main(String[] args){
		//1. 录入星期数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		
		// 2. switch 匹配
		switch(month){
			case 12:
			case 1:
			case 2:
				System.out.println(month+"月是冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month+"月是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"月是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"月是秋季");
				break;
			default:
				System.out.println("输入有误！");
				break;
		}
	
	}
	
}