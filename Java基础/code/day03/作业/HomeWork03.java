

import java.util.Scanner;
public class HomeWork03{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您取走的金额(最少100，最高10000，必须是100的倍数)：");
		while(true){
			
			
			
			int money = sc.nextInt();
			
			if(money<100||money>10000||money%100!=0){
				System.out.println("输入错误，请重新输入:");
				continue;
			}
			
			System.out.println("请取走您的现金:"+money);
			break;
		}
		
	}
}