import java.util.Scanner;
/*
	whileѭ����ϰ
*/
public class Demo07{
	public static void main(String[] args){
		// ���� ʹ��whileѭ���� 1~100 ֮���ż����
		//1. �ȶ���һ����ͱ���sum
		int sum = 0;
		int k = 1;
		while(k <= 100){
			if(k % 2 == 0){
				sum += k;
			}
			
			k++;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("-----------------");
		// ����2�� ���������
		// 1. ����һ��������
		int count = 0;
		
		// 2. ��ʼѭ��
		double paper = 0.1;
		
		while(paper <= 8844430){
			// ����
			paper *= 2;
			
			// ������ + 1
			count++;
		}
		
		// ��ӡcount
		System.out.println("һ��ֽ�۵���" + count +"�κ�ȻᳬԽ���!");
		
	}
}