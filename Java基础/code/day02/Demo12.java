import java.util.Scanner;

public class Demo12{
	
	/*
		单if语句
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		
		// 条件：年龄在[18,75]可以上网吧
		if(age >= 18 && age <= 75){
			System.out.println("可以上网吧~~~");
		}
		
		System.out.println("end...");
	}
	
}