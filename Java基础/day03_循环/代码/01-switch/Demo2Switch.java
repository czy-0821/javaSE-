import java.util.Scanner;

public class Demo2Switch {
	/*
		����: ����¼������������������ա���Ϣ��
		(1-5)�����գ�(6-7)��Ϣ��
		
		
		case��͸����β�����?
		
			���switch�����,caseʡ����break���, �ͻῪʼcase��͸.
		
		����
			����ʼcase��͸��������case�Ͳ������ƥ��Ч�����ڲ�����䶼��ִ��
			ֱ������break�����߽�����switch���ִ����ϣ��Ż������

	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������������:");
		int week = sc.nextInt();
		
		switch(week){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("������");
				break;
			case 6:
			case 7:
				System.out.println("��Ϣ��");
				break;
			default:
				System.out.println("������������");
				break;
		}
	}	
}