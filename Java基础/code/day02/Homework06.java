import java.util.Scanner;

public class Homework06{
	public static void main(String[] args){
		
		//1. �õ��û��������������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ���������");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		//2. �ж�
		if(10 <= sum && sum <= 200 && sum % 2 == 1){
			System.out.println("����Ҫ��");
		}else{
			System.out.println("������Ҫ��");
		}
	
	}
	
}