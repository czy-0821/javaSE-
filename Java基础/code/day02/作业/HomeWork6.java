import java.util.Scanner;
public class HomeWork6{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int num1 = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int num2 = sc.nextInt();
		
		if((num1+num2)<=200&&(num1+num2)>=10){
			if((num1+num2)%2!=0)System.out.println("����Ҫ��");
			else System.out.println("������Ҫ��");
		}else System.out.println("������Ҫ��");
		
	}
	
}