//1. ����
import java.util.Random;
/*
	Random�����
*/
public class Demo10{
	public static void main(String[] args){
		//2. ��������
		Random r = new Random();
		
		//3. ���������
		int num = r.nextInt(10) + 0;		// [0,10)
		
		System.out.println(num);
		
		//�������ָ����Χ���������
		// ���� ����һ��[22,55]֮��������
		/*
			С��������� = ��Χ���ֵ - ��Χ��Сֵ + 1;
			С������Ҫ�ӵ��� = ��Χ��Сֵ;
		*/
		int num1 = r.nextInt(34) + 22;		// [22, 55]
		System.out.println(num1);
		
	}
}