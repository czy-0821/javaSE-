import java.util.Scanner;

public class Demo1Operator {
	/*
		��Ԫ�����:
		
			��ʽ: ��ϵ���ʽ ? ���ʽ1 : ���ʽ2;
			
		ִ�����̣�
				���ȼ����ϵ���ʽ��ֵ
				���ֵΪtrue��ȡ���ʽ1��ֵ
				���ֵΪfalse��ȡ���ʽ2��ֵ

					
		����: ���������������ֵ
		
	*/
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		/*
			ע������:
				1.  ?��ǰ��ֻҪ�ܲ���boolean���͵Ľ���Ϳ�����
				2.  ��Ԫ���ʽ���ս����ʲô���ͽ�����?�ź����ֵ��:�ź����ֵ�����;���
					������Ͳ�һ��,Ҫʹ�ô����ͽ���
				3.  ��Ԫ���ʽ���ܶ�������,���Ǳ���ʹ������,Ҫô��ֵ������ʹ��,Ҫô��ӡ���ʹ��
		*/
		int max = a > b ? a : b;
		System.out.println( max);
		
		
		/*
			��ϰ:
				ʹ�ó���ʵ�����������Ƿ���ż��,ʵ������Ч��:
					������һ������:
					35   
					35������
					
					������һ������:
					36
					36��ż��
		*/
		
		//1. ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		
		//2. ��¼�����������ż���ж�
		System.out.println(num % 2 == 0 ? num + "��ż��" : num + "������");
		
		//ʹ��if���ʵ��
		if(num % 2 == 0){
			System.out.println(num + "��ż��");
		}else{
			System.out.println(num + "������");
		}
		
		if(num % 2 == 1){
			System.out.println(num + "������");
		}
		
		
		
		
	}
}