public class Demo1Conversion {
	/*
		��ʽת��: ������������, ȡֵ��ΧС������, ��ȡֵ��Χ������͸�ֵ, ����ֱ�Ӹ�ֵ
		    �Զ�����ת��:  �����С,�Զ�ת,����ɶҲ���ø�
	*/
	public static void main(String[] args) {
		int a = 10;			// int 4���ֽ�
		
		/*
			jvm���Զ���a��ֵ��¡һ�ݳ���,Ȼ��ֵ��double���͵ı���b
			��ʱ��ײ�����﷨��У��, ���ֵȺ����b��������double
			��ʱ����Ҫ�Ƚ�a��¡������ֵ����Ϊ10.0,Ȼ���ٷŽ�b��
		*/
		double b = a;		// double 8���ֽ�
		System.out.println(b); //10.0
		
		//ϸ��1�� �����������ͬ���͵�ֵ(����/����)��������ʱ,���Ƚ�С��������Ϊ������
		//ֻ�д������һ��ʱ,����ʽ��������
		double c = 3.14;
		double d = a + c;
		System.out.println(d);
		
		System.out.println(10);
		
		
		//ϸ��2:  byte,short,char ���������Ͳ�������ʱ,���һʱ������Ϊint
		byte b1 = 5;   
		byte b2 = 6;
		
		/*
			b1,b2����byte,���ڸ��������ӷ�����,��ʱ�����ǵ�ֵ�ᱻ��¡��������Ϊint,
			  �������int���,���Ϊint
		*/
		int b3 = b1 + b2;
		System.out.println(b3);
		
		
		short s1 = 100;
		/*
			1. s1��short, short��������,��һʱ������Ϊint
			2. s1����Ϊint��,����Ҫ��5.21���ӷ�����, ��Ҫ�ٴζ�s1�����Զ���������,����Ϊdouble: 100.0
			3. 100.0 + 5.21,�õ�105.21,��105.21��ֵ��s2,s2�����;���Ҫд��double
		*/
		double s2 = s1 + 5.21;
		System.out.println(s2);
	}
}