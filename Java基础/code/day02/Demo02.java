public class Demo02{
	
	/*
		����ת����ǿ������ת��
			�ص㣺 ��С�Ҵ󣬲�����ֱ�Ӹ�ֵ!���Ӳ��Ҫ��������Ҫǿת��ʽ!
	*/
	public static void main(String[] args){
		
		double a = 3.14;
		int b = (int)a;
		System.out.println(a);
		System.out.println(b);
		
		//����ǿ������ת���Ż��������
		float c = 10;
		long d = (long)c;
		System.out.println(c);
		System.out.println(d);
		
		
		// ע��1�� byte��short��char�������ݲ�����������Զ�ת��Ϊint����
		byte b1 = 10;
		byte b2 = 20;
		// �����д���ᱨ��b1��b2���Զ�ת��Ϊint���ͣ�������Ϊint��int��ֵ��byte��Ҫǿ������ת����
		byte b3 = (byte)(b1 + b2);     
		System.out.println(b3);
		
		System.out.println("--------------");
		
		byte num1 = 10;
		short num2 = 30;
		short num3 = (short)(num1 + num2);
		
		System.out.println("--------------");
		
		// ע��2�� java�д��ڳ����Ż����ƣ���� = �ұ߶��ǳ����������㣬��ô���������ڱ���(javac)ʱ���!
		byte b4 = 3 + 4;
		System.out.println(b4);
	}
	
}