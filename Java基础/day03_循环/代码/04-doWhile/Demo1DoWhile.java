public class Demo1DoWhile {
	/*
		������ʽ��
			��ʼ�����;
			do {
				ѭ�������;
				�����������;
			}while(�����ж����);
			
		ִ�����̣�
			1.ִ�г�ʼ�����
			2.ִ��ѭ�������
			3.ִ�������������
			4. ִ�������ж���䣬��������true����false
				�����false��ѭ������
				�����true������ִ��
			5. �ص��ڼ���

		�ص�:
			do..whileѭ��, ����ѭ�������Ƿ�����, �����ٻ�ִ��һ��ѭ����.
			
			ԭ��: do..whileѭ���Ǵ��ϵ�������ִ��.
			
	*/
	public static void main(String[] args){
		// ����: �ڿ���̨��ӡ10�κ������Ա
		int i = 11;
		do {
			System.out.println("�������Ա");
			i++;
		}while(i <= 10);
		
		System.out.println(i);
	}
}