import java.util.Scanner;
/*
	whileѭ��
*/
public class Demo06{
	public static void main(String[] args){
		//���� ѭ����ӡ5��Helloworld
		int i = 1;
		for(; i <= 5; ){
			//ѭ�������
			System.out.println("HelloWorld");
			i++;
		}
		
		System.out.println(i);
		
		System.out.println("-----------------");
		
		// ʹ��whileѭ��ʵ��
		int j = 1;
		while(j <= 5){
			System.out.println("HelloWorld");
			j++;
		}
		System.out.println(j);
		
		System.out.println("-----------------");
		
		// ʹ��do whileѭ��ʵ��, �ص㣺 ��ִ�У����ж�
		int k = 1;
		do{
			System.out.println("HelloWorld");
			k++;
		}while(k <= 5);
		
		
	}
}