public class Demo4Operator {
	/*
		�������:
		
			++��ǰ: �ȶԸñ���������(++)�����Լ�(--)��Ȼ�����ñ������������
					�ȼӺ���
		
			++�ں�:	�Ƚ��ñ���ԭ����ֵ��ȡ�����������������ٽ�������(++)���Լ�(--)��
					���ú��
	*/
	public static void main(String[] args){
		// ++��ǰ: �ȶԸñ���������(++)�����Լ�(--)��Ȼ�����ñ������������
		int a = 10;
		int b = ++a;
		
		System.out.println(a);		// 11
		System.out.println(b);		// 11
		
		
		// ++�ں�:	�Ƚ��ñ���ԭ����ֵ��ȡ�����������������ٽ�������(++)���Լ�(--)��
		int aa = 10;
				//bb = 10
		int bb = aa++;	// aa = 11
		
		System.out.println(aa);	// 11
		System.out.println(bb); // 10
		
		int num = 123;
		System.out.println(num++);	// 123
		System.out.println(num);	// 124	
		
	
		//��ҵ
		int i = 10;
		//  j = 10 + 12   - 12  + 10  + 10 +  12;
		int j = i++ + ++i - i-- + --i + i++ + ++i;
		
	
		System.out.println(i);		//12
		System.out.println(j);		//42
		
		int x = 5;
		//int y = 4 + 5 + 5 + 6;
		int y = --x + ++x + x++ +x--;
		System.out.println(x);
		System.out.println(y);
		
		
		
		short s1 = 10;
		//s1 = (short)(s1 + 20);
		s1 += 20;
		System.out.println(s1);
		
		
	}
}