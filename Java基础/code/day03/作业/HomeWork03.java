

import java.util.Scanner;
public class HomeWork03{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ȡ�ߵĽ��(����100�����10000��������100�ı���)��");
		while(true){
			
			
			
			int money = sc.nextInt();
			
			if(money<100||money>10000||money%100!=0){
				System.out.println("�����������������:");
				continue;
			}
			
			System.out.println("��ȡ�������ֽ�:"+money);
			break;
		}
		
	}
}