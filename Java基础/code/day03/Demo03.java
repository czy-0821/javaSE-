import java.util.Scanner;
/*
	forѭ��
*/
public class Demo03{
	public static void main(String[] args){
		//���� ѭ����ӡ5��Helloworld
		for(int i = 1; i <= 5; i++){
			//ѭ�������
			System.out.println("HelloWorld");
		}
		
		System.out.println("-----------------");
		
		// ��� 1~ 5
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		// ��� 5~ 1
		for(int i = 5; i >= 1; i--){
			System.out.println(i);
		}
	}
}