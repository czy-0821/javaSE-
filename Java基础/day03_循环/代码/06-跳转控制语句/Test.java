import java.util.Scanner;

public class Test {
	/*
		���󣺳������к��û��ɶ�β�ѯ���ڶ�Ӧ�ļ��ʼƻ���ֱ������0���������
		
		����:
			
			1. ����ȷ�û���������, ʹ����ѭ������ҵ���߼�
			2. ƥ�䵽0��ʱ��ʹ��break����ѭ����ѭ��

	*/
	public static void main (String[] args){
		
		abc:while(true){
			System.out.println("��������Ҫ�鿴��������:");
			System.out.println("(����������鿴,������0�˳�����)");
			
			// 1. ����¼���������ݣ�ʹ�ñ�������
			Scanner sc = new Scanner(System.in);
			int week = sc.nextInt();
			// 2. ������жϣ�����switch���ʵ��
			switch(week){
				// 3. �ڲ�ͬ��case�У������Ӧ�ļ��ʼƻ�
				case 0:
					System.out.println("��л����ʹ��");
					break abc;
				case 1:
					System.out.println("�ܲ�");
					break;		// �ͽ�ԭ��
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
}