/*
	����¼��һ��1-100֮�������
*/
import java.util.Scanner;

public class Loop01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��1-100֮�������:");
		
		while(true){
			int num = sc.nextInt();
			
			if(num < 1 || num > 100){
				System.out.println("����,�ú���!������һ��1-100֮�������:");
			}else{
				break;			// ��ѭ���ĳ���!
			}
		}
		
		System.out.println("�ٺٺ�,����˧!");
		
		
	}
}