public class Loop {
	/*
		for��while������
		
			����������������Ƶ���������
				��Ϊ����forѭ�����﷨�ṹ�У���forѭ�������󣬾Ͳ����ٴα����ʵ���
				
			����������������Ƶ���������
				����whileѭ����˵���������﷨�ṹ�У���whileѭ�������󣬸ñ��������Լ���ʹ��
		
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			// forѭ���ڲ�[����]�ı���, ��ѭ��������, �ͻ���ڴ�����ʧ
			System.out.println(i);
		}
		// System.out.println(i);	//  ����: �Ҳ�������i
		
		System.out.println("--------------");
	
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		// whileѭ��
		
		int a = 1;
		while(a <= 5){
			System.out.println(a);
			a++;
		}
		System.out.println(a + "...");
		
	}
}