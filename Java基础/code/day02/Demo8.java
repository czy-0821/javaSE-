import java.util.Scanner;
public class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		int age = sc.nextInt();
		
		if(age>=18&&age<=75)System.out.println("������������");
		else System.out.println("�ؼҰ�");
		
		System.out.println("end.....");
		
	}
}