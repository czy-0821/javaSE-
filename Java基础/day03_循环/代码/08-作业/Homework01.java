import java.util.Scanner;
/*
1. 
����ţ�304��



ģ����������ܣ��Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ��������

Ҫ��
	����¼����������������ǰ������������μ���������ݣ�����������ΪҪ���е�����
	(1:��ʾ�ӷ�����,2:��ʾ��������,3:��ʾ�˷�����,4:��ʾ��������)������Ч������:

	�������һ��������
	10
	������ڶ���������
	20
	��������Ҫ���е�����(1:��ʾ�ӷ�,2:��ʾ����,3:��ʾ�˷�,4:��ʾ����)
	3
	10 * 20 = 200
*/
public class Homework01{
	public static void main(String[] args){
		//1. ����¼����������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ���������");
		int num2 = sc.nextInt();
		System.out.println("��������Ҫ���е�����(1:��ʾ�ӷ�,2:��ʾ����,3:��ʾ�˷�,4:��ʾ����)");
		int option = sc.nextInt();
		
		//2. ����option��ֵƥ�䲻ͬ�Ĳ���
		switch(option){
			case 1:
				System.out.println(num1 + " + " + num2 +" = "+(num1 + num2));
				break;
			default:
				System.out.println("�Ƿ�����!");
				break;
		}
		
	}
	
}