import java.util.Scanner;

/*
	���󣺼���¼���·ݣ�ƥ���Ӧ�ļ��ڲ���ӡ��Ҫ��ʹ��case��͸��Ч�����£�
	�������·ݣ�
	12
	12���Ƕ���
	
	�������·ݣ�
	3
	3���Ǵ���
	
	�������·ݣ�
	4
	4���Ǵ���
	
	switch caseֻ����������޵ĵ�ֵƥ�䣡
*/
public class Test1{
	public static void main(String[] args){
		//1. ¼��������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		
		// 2. switch ƥ��
		switch(month){
			case 12:
			case 1:
			case 2:
				System.out.println(month+"���Ƕ���");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month+"���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"�����＾");
				break;
			default:
				System.out.println("��������");
				break;
		}
	
	}
	
}