public class Demo2Conversion {
	/*
		ǿ��ת��: ��һ����ʾ���ݷ�Χ�����ֵ���߱�����ֵ����һ����ʾ���ݷ�ΧС�ı���
					��С�Ҵ�,ǿ��ת,��Ҫ�ֶ�����ǿת��ʽ
	
		������: ��ĸ�С��, ����ֱ�Ӹ�, ��Ҫǿת
		
		��ʽ��Ŀ���������� ������ = (Ŀ����������)ֵ���߱���;
	*/
	public static void main(String[] args) {
		int a = 10;				// int 4���ֽ�
		byte b = (byte)a;		// byte 1���ֽ�		����: �����ݵ�����: ��intת����byte���ܻ�����ʧ����
		System.out.println(b);
		
		
		double num1 = 12.9;
		int num2 = (int)num1;
		System.out.println(num2);
		
		//������ϰ
		byte b1 = 5;
		byte b2 = (byte)(b1 + a);		//������ô������ܺ�ʹ???
		
		byte b3 = (byte)128;	
		System.out.println(b3);  //b3����Ƕ���? -128
	}
}