public class Demo1Operator {
	/*
		�����: 
		
			��[����]��[����]���в����ķ���
	
		��������� 
		
			+ - * : ��Сѧ��ѧ�����㷽ʽһ��
			
			/ : �������,���ֻ�ܵõ�����,�����Ҫ�õ�����С���Ľ��,�������С��(��������)������
			
			%(ȡģ) : ȡ����
	*/
	public static void main(String[] args){
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		
		System.out.println("-----------------------");
		
		/*
			/ : �������,���ֻ�ܵõ�����,�����Ҫ�õ�����С���Ľ��,�������С��(��������)������
		*/
		System.out.println(10 / 2);		// 5
		System.out.println(10 / 3);		// 3
		System.out.println(10 / 3.0);		// 3.3333333333333335
		System.out.println(10.0 / 3);		// 3.3333333333333335
		
		System.out.println("-----------------------");
		
		
		// %(ȡģ) : ȡ����
		System.out.println(5 % 2);	   //1
		System.out.println(4 % 2);     //0
		System.out.println(3 % 2);     //1
		System.out.println(2 % 2);     //0
		System.out.println(1 % 2);     //1
		
		
		
		
		
		
		
		
		
		
		char c1 = 'a';
		int c2 = c1 + 1;		// ����ȡ���ַ�'a'��Ӧ��ACII��ֵ97���������
		System.out.println(c2);
		System.out.println("=============");
		
		char ch1 = '��';
		char ch2 = '��';
		char ch3 = '��';
		char ch4 = '��';
		
		System.out.println((int)ch1);    //20256
		System.out.println((int)ch2);    //26234
		System.out.println((int)ch3);    //25773
		System.out.println((int)ch4);    //23458
		
		/*
			'a'  --> 97
			'A'  --> 65
			'0'  --> 48
		*/
		
		
		
		
	}
}