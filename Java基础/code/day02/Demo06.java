public class Demo06{
	
	/*
		�����Լ������
			����ʹ�ã���ǰ�ں�һ��������ν��
			
			�������ʹ�ã�
				++��ǰ�� �ȼӺ���
				++�ں� ���ú��
	*/
	public static void main(String[] args){
		//����ʹ��
		int a = 10;
		a++;
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//�������ʹ��
		int x = 10;
		int y = ++x ;          
		System.out.println(x);
		System.out.println(y);
		
		// ʵս��������
		int num1 = 15;
		int num2 = num1++ + ++num1 + num1-- - --num1 - num1++;	// 	 15 + 17 + 17 - 15 - 15;
		System.out.println(num1);		// 16
		System.out.println(num2);		// 19
		
	}
	
}