public class Demo1Variable {
	/*
		�����������ͣ�
			
			������
					byte		1���ֽ�
					short		2���ֽ�
					int			4���ֽ�
					long		8���ֽ�
					
			С����
					float		4���ֽ�
					double		8���ֽ�
					
			�ַ���
					char		2���ֽ�
					
			������
					boolean		1���ֽ�
	*/
	public static void main(String[] args) {
		// ��ʽ���������� ������ = ����ֵ;
		// �������ͱ���
		int a = 10;
		System.out.println(a);		//�������a����¼��ֵ: 10
		a = 30;						//������a��ֵ�޸�Ϊ30
		System.out.println(a);
		
		// С�����ͱ���
		double b = 12.3;
		System.out.println(b);
		
		// �ַ����ͱ���
		char c = 'a';
		System.out.println(c);
		
		// �������ͱ���
		boolean d = true;
		System.out.println(d);
	}
}