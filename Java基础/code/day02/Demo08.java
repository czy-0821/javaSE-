public class Demo08{
	
	/*
		��ϵ�����  -- �Ƚ������
	*/
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
		System.out.println(a > b);		// false
		System.out.println(a >= b);		// false
		System.out.println(a < b);		// true
		System.out.println(a <= b);		// true
		
		// ��ϵ��������ղ����Ľ������boolean����,�������Ҫ�������������ݣ�Ӧ�ö���boolean���ͱ������ա�
		boolean res = a == b;
		System.out.println(res);
	}
	
}