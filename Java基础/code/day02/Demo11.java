import java.util.Scanner;

public class Demo11{
	
	/*
		��Ԫ�����
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
		int c = sc.nextInt();
		
		int tempMax = a > b ? a : b;
		int max = tempMax > c ? tempMax : c;
		
		System.out.println("max:" + max);
	}
	
}