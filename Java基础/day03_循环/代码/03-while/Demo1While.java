public class Demo1While {
	/*
		������ʽ��
		
			��ʼ�����;
			while(�����ж����) {
				ѭ�������;
				�����������;
			}
	
		ִ�����̣�
			1. ִ�г�ʼ�����
			2. ִ�������ж���䣬��������true����false
				�����false��ѭ������
				�����true������ִ��
			3. ִ��ѭ�������
			4. ִ�������������
			5. �ص��ڼ���
		
		����: �ڿ���̨��ӡ1-100֮�����е���
		����: �ڿ���̨��ӡ520�� I LOVE YOU
	*/
	public static void main(String[] args) {
		/*
			for(int i = 1; i <= 100; i++){
				System.out.println(i);
			}
		*/
		int i = 1;										// 1. ��ʼ�����
		
		while(i <= 520){								// 2. �����ж����
			System.out.println("I LOVE YOU");			// 3. ѭ������� 
			i--;										// 4. �������ʽ
		}
		
		System.out.println(i);
	}
}