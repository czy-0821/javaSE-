import java.util.Scanner;
public class HomeWork3{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int num1 = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int num2 = sc.nextInt();
		
		int max = num1>num2?num1:num2;
		System.out.println(max+"�����ֵ");
		
	}
	
}