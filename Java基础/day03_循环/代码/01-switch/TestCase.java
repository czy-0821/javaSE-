/*
	需求:
		键盘录入一个月份, 程序输出对应月份的季节,实现如下效果:
		请输入月份:
		1
		1月是冬季.
		请输入月份:
		2
		2月是冬季.
		请输入月份:
		12
		12月是冬季.
		
		请输入月份:
		3
		3月是春季.
		请输入月份:
		13
		13月是春季.
*/
import java.util.Scanner;

public class TestCase{
	public static void main(String[] args){
		//1. 键盘录入一个月份
		System.out.println("请输入月份【1-12】:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//2. 基于switch  case匹配月份对应的季节
		switch(month){  // byte,short,int , char, 枚举, 字符串
			case 1:
			case 2:
			case 12:
				System.out.println(month+"月是冬季");
				break;
			default:
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
		}
		
	}
}