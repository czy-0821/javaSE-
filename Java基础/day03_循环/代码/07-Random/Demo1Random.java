import java.util.Random;

public class Demo1Random {
	/*
		Random : ���������
		1. ����	: import java.util.Random;
				    �����Ķ�������������ඨ�������

		2. �������� : Random r = new Random();
					���������ʽ���棬r �Ǳ����������Ա䣬�����Ķ��������

		3. ��ȡ����� : int number = r.nextInt(10);	//��ȡ���ݵķ�Χ��[0,10) ����0,������10   : ��ͷ����β
					���������ʽ���棬number�Ǳ����������Ա䣬����10���Ա䡣�����Ķ��������
		����: ���������1-10֮���
	*/
	public static void main(String[] args){
		// 2. ��������
		Random r = new Random();
		
		for(int i = 1; i <= 10; i++){
			// 3. ��ȡ�����
			int num = r.nextInt(10) + 1;		// [0,9] + 1 --> [1,10]
			System.out.println(num);
		}
		
		// ����: ����һ�� [20,50]��Χ�ڵ������
		int res = r.nextInt(31) + 20;			//[0,30] + 20 -->[20,50]
		//[33,66]
		r.nextInt(34) + 33;					//[0,33] + 33 -->[33,66]
		
		// ����: С�������ֵ =  (��Χ���ֵ - ��Χ��Сֵ) +1  ,   Ҫ�ӵ�ֵ =  ��Χ��Сֵ
		
		int num1 = r.nextInt(31) + 20;		// [0,30] + 20 --> [20, 50]    
		System.out.println("---------------------");
		// ����: ����5�� [35,67] ��Χ�ڵ������
		for(int i=1;i<=5;i++){
			int num2 = r.nextInt(33) + 35;
			System.out.println(num2);
		}
		
	}
}