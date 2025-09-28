import java.util.Scanner;
public class HomeWork5{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字:");
		int num = sc.nextInt();
		
		if(num%2==0)System.out.println("你输入的数是偶数");
		else System.out.println("你输入的数是奇数");
		
	}
	
}