import java.util.Scanner;

/*
	switch ע�����
		1. case��͸�� ���case��䣬ʡ��break���ͻᷢ�����´�͸����
					  ������case�����������߼���ͬ�����Ƽ�ʹ��case��͸���Ӷ���ߴ��븴����!
		2. switchС�����е�ֵ����ֻ֧�֣�
					   byte,short,int,char, jdk1.5��ʼ֧��ö�٣� jdk1.7��ʼ֧���ַ���String
	    3. case �����ֵ�����ظ�!
*/
public class Demo02{
	public static void main(String[] args){
		//1. ¼��������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������ڼ���");
		int week = sc.nextInt();
		
		//2. ����weekֵ�����м��ʼƻ���ƥ��
		switch(week){
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
			case 5:
			case 6:
			case 7:
				System.out.println("���е���");
				break;
			default:
				System.out.println("����������!");
				break;
		}
	
	}
	
}