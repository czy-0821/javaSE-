import java.util.Scanner;

public class Demo13{
	
	/*
		if-else
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		
		// ������������[18,75]����������
		if(age >= 18 && age <= 75){
			System.out.println("����������~~~");
		}else{
			System.out.println("���䲻�Ϸ���������������...");
		}
		
		System.out.println("end...");
	}
	
}