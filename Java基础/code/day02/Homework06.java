import java.util.Scanner;

public class Homework06{
	public static void main(String[] args){
		
		//1. 拿到用户输入的两个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		//2. 判断
		if(10 <= sum && sum <= 200 && sum % 2 == 1){
			System.out.println("符合要求");
		}else{
			System.out.println("不符合要求");
		}
	
	}
	
}