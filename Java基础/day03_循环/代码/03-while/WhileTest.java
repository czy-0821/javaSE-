public class WhileTest {
	
	/*
		ʹ��whileѭ��ʵ����1 -- 100 ֮������ݺ�
	*/
	public static void main(String[] args){
		
		//1. �����ۼӺͱ���,��ʼֵΪ0
		int sum = 0;
		
		//2. ѭ��1--100 , ��ÿһ�����ۼӵ�sum��
		int i = 1;									// ��ʼ�����
		while(i <= 100){							// �����ж����
			sum += i;								// ѭ�������
			i++;									// �������ʽ
		}
		
		System.out.println("1--100�����ݺ�Ϊ: "+sum);
		
	}
	
}