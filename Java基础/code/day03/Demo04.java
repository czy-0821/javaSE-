import java.util.Scanner;
/*
	ѭ������������1. �ۼӺ�
*/
public class Demo04{
	public static void main(String[] args){
		//���� ����1~100 ֮��ĺ�
		
		//1. ����һ����ͱ�����������¼���յ���ͽ��
		int sum = 0;
		
		//2. ѭ���ۼ�
		for(int i = 1; i <= 100; i++){
			/*
				��һ��ѭ���� sum = 0 + 1;       sum = 1;
				�ڶ���ѭ���� sum = 1 + 2;       sum = 3;
				������ѭ���� sum = 3 + 3;       sum = 6;
			*/
			if(i % 2 == 1){
				sum += i;   // sum = sum + i;	
			}
			
		}
		
		//3. ��ӡsum
		System.out.println("sum: " + sum);
		
	}
}