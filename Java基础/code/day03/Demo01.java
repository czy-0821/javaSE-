import java.util.Scanner;

/*
	switch case
*/
public class Demo01{
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
				System.out.println("���е���");
				break;
			case 5:
				System.out.println("���е���");
				break;
			case 6:
				System.out.println("���е���");
				break;
			case 7:
				System.out.println("���е���");
				break;
			default:
				System.out.println("����������!");
				break;
		}
	
	}
	
}