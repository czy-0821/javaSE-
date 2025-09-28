import java.util.Scanner;
public class HomeWork4{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个数字:");
		int num2 = sc.nextInt();
		
		System.out.println("请输入第三个数字:");
		int num3 = sc.nextInt();
		
		int max = num1>num2?num1:num2;
		
		max = max>num3?max:num3;
		System.out.println(max+"是最大值");
		
	}
	
}