import java.util.Scanner;

public class Test1{
	
	/*
		����1�� ��ֵ���
			���һ������ʵ������Ч����	
				������һ����λ����
				123
				123�ĸ�λ�ǣ�3
				123��ʮλ�ǣ�2
				123�İ�λ�ǣ�1
				
			��������λ�㷨���κ�һ������10ȡ�࣬����������λ����
				int ge = num  % 10; 
				int shi = num / 10 % 10;
	*/
	public static void main(String[] args){
		// 1��ʹ��Scanner����¼��һ����λ��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int num = sc.nextInt();
		// 2����λ�ļ��㣺��ֵ % 10
		int ge = num % 10;		
		// 3��ʮλ�ļ��㣺��ֵ / 10 % 10
		int shi = num / 10 % 10;	
		// 4����λ�ļ��㣺��ֵ / 100
		int bai = num / 100;
		// 5������λ, ʮλ, ��λƴ������ȷ���ַ���, ��ӡ����
		System.out.println("����"+num+"��λΪ:" + ge);
		System.out.println("����"+num+"ʮλΪ:" + shi);
		System.out.println("����"+num+"��λΪ:" + bai);
		
	}
	
}