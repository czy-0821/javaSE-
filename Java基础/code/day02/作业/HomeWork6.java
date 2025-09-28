import java.util.Scanner;
public class HomeWork6{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个数字:");
		int num2 = sc.nextInt();
		
		if((num1+num2)<=200&&(num1+num2)>=10){
			if((num1+num2)%2!=0)System.out.println("符合要求");
			else System.out.println("不符合要求");
		}else System.out.println("不符合要求");
		
	}
	
}