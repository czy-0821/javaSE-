import java.util.Scanner;
public class HomeWork4{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int num1 = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int num2 = sc.nextInt();
		
		System.out.println("���������������:");
		int num3 = sc.nextInt();
		
		int max = num1>num2?num1:num2;
		
		max = max>num3?max:num3;
		System.out.println(max+"�����ֵ");
		
	}
	
}