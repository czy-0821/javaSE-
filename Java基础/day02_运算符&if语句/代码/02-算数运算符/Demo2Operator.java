import java.util.Scanner;

public class Demo2Operator {
	/*
		�ַ����� + ����
		
			�� + �����г����ַ���ʱ����� + ��[�ַ������ӷ�]���������������㡣
			�����ִ��˳��:
					��������,��������,��������ִ���������
	*/
	public static void main(String[] args) {
		// �ַ�������ʹ�� +��, ��[������������]ƴ��
		System.out.println("itheima" + 666);		//"itheima666"
		System.out.println("itheima" + true);		//"itheimatrue"
		
		System.out.println(1 + 99 + "�����");		//100 + "�����"  --> "100�����"
		System.out.println("5+5="+5+5);				// "5+5=55"
		System.out.println("5+5="+(5+5));			// 5+5=10
		
		/*	������ϰ:
			��Ƴ����������Ч��:
				�������һ������:
				10
				������ڶ�������:
				20
				10 + 20 = 30
		*/
		//2. ��������
		Scanner sc = new Scanner(System.in);
		//2.1 ������ʾ��Ϣ
		System.out.println("�������һ������:");
		//3. ���ռ���¼�������
		int num1 = sc.nextInt();		//10	
		
		//2.1 ������ʾ��Ϣ
		System.out.println("������ڶ�������:");
		//3. ���ռ���¼�������
		int num2 = sc.nextInt();		//20
		
		//4. ������: ʹ���ַ�����ƴ�����
		System.out.println(num1 + "+"+ num2 +"="+ (num1 + num2));		//"10+20=30"
	}
}