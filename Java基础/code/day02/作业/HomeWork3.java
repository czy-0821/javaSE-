import java.util.Scanner;
public class HomeWork3{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个数字:");
		int num2 = sc.nextInt();
		
		int max = num1>num2?num1:num2;
		System.out.println(max+"是最大值");
		
	}
	
}