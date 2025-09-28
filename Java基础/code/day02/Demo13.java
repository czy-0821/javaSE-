import java.util.Scanner;

public class Demo13{
	
	/*
		if-else
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		
		// 条件：年龄在[18,75]可以上网吧
		if(age >= 18 && age <= 75){
			System.out.println("可以上网吧~~~");
		}else{
			System.out.println("年龄不合法，不可以上网吧...");
		}
		
		System.out.println("end...");
	}
	
}