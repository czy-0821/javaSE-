import java.util.Scanner;

public class Demo12{
	
	/*
		��if���
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		
		// ������������[18,75]����������
		if(age >= 18 && age <= 75){
			System.out.println("����������~~~");
		}
		
		System.out.println("end...");
	}
	
}