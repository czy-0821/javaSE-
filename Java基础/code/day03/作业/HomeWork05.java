
import java.util.Scanner;
public class HomeWork05{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("������һ��������:");
			int num = sc.nextInt();
			if(num<1){
				System.out.println("��¼���������Ч, ������¼��.");
				continue;
			}
			int sum=0;
			for(int i=0;i<=num;i++){
				if(i%2!=0)sum+=i;
			}
			System.out.println("1-"+num+"֮���������Ϊ"+sum);
			break;
		}
		
	}
}