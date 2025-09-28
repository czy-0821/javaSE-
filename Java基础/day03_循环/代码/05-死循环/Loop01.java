/*
	键盘录入一个1-100之间的整数
*/
import java.util.Scanner;

public class Loop01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1-100之间的整数:");
		
		while(true){
			int num = sc.nextInt();
			
			if(num < 1 || num > 100){
				System.out.println("别闹,好好玩!请输入一个1-100之间的整数:");
			}else{
				break;			// 死循环的出口!
			}
		}
		
		System.out.println("嘿嘿嘿,你最帅!");
		
		
	}
}