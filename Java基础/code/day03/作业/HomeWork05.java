
import java.util.Scanner;
public class HomeWork05{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("请输入一个正整数:");
			int num = sc.nextInt();
			if(num<1){
				System.out.println("您录入的数字无效, 请重新录入.");
				continue;
			}
			int sum=0;
			for(int i=0;i<=num;i++){
				if(i%2!=0)sum+=i;
			}
			System.out.println("1-"+num+"之间的奇数和为"+sum);
			break;
		}
		
	}
}