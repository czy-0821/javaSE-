import java.util.Scanner;

public class TestSwitch {
	/*
		���󣺼���¼������������ʾ����ļ��ʻ��
	
		��һ���ܲ�  
		�ܶ�����Ӿ  
		����������  
		���ģ����е���
		���壺ȭ��  
		��������ɽ  
		���գ��úó�һ�� 

		������
			1. ����¼���������ݣ�ʹ�ñ�������
			2. ������жϣ�����switch���ʵ��
			3. �ڲ�ͬ��case�У������Ӧ�ļ��ʼƻ�
	*/
	public static void main(String[] args){
		// 1. ����¼���������ݣ�ʹ�ñ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������");
		int week = sc.nextInt();
		// 2. ������жϣ�����switch���ʵ��
		switch(week){
			// 3. �ڲ�ͬ��case�У������Ӧ�ļ��ʼƻ�
			case 1:
				System.out.println("�ܲ�");
				break;
			case 2:
				System.out.println("��Ӿ");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("���е���");
				break;
			case 5:
				System.out.println("ȭ��");
				break;
			case 6:
				System.out.println("��ɽ");
				break;
			case 7:
				System.out.println("�úó�һ��");
				break;
			default:
				System.out.println("������������");
				break;
		}
	}
}