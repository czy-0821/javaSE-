/*
	����:
		����¼��һ���·�, ���������Ӧ�·ݵļ���,ʵ������Ч��:
		�������·�:
		1
		1���Ƕ���.
		�������·�:
		2
		2���Ƕ���.
		�������·�:
		12
		12���Ƕ���.
		
		�������·�:
		3
		3���Ǵ���.
		�������·�:
		13
		13���Ǵ���.
*/
import java.util.Scanner;

public class TestCase{
	public static void main(String[] args){
		//1. ����¼��һ���·�
		System.out.println("�������·ݡ�1-12��:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//2. ����switch  caseƥ���·ݶ�Ӧ�ļ���
		switch(month){  // byte,short,int , char, ö��, �ַ���
			case 1:
			case 2:
			case 12:
				System.out.println(month+"���Ƕ���");
				break;
			default:
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
		}
		
	}
}