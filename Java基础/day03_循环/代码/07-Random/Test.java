import java.util.Scanner;
import java.util.Random;

public class Test {
	/*
		���󣺳����Զ�����һ��1-100֮������֣�ʹ�ó���ʵ�ֲ³���������Ƕ��٣�
			���´��ʱ����ݲ�ͬ���������Ӧ����ʾ
			����µ����ֱ���ʵ���ִ���ʾ��µ����ݴ���
			����µ����ֱ���ʵ����С����ʾ��µ�����С��
			����µ���������ʵ������ȣ���ʾ��ϲ�������
		
		1. ׼��Random��Scanner����, �ֱ����ڲ���������ͼ���¼��
		2. ʹ��Random����һ��1-100֮�����, ��ΪҪ�µ���
		3. ����¼���û��µĵ�����
		4. ʹ��¼�������(�û��µ�����)�������(Ҫ�µ�����)���бȽ�, ��������ʾ
		
		5. ����������Ҫ��ν���, ���޷�Ԥ���û����뼸�ο��Բ²���ȷ, ʹ��while(true)��ѭ������
		6. �¶�֮��, break����.

	*/
	public static void main(String[] args){
		// 1. ׼��Random��Scanner����, �ֱ����ڲ���������ͼ���¼��
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 2. ʹ��Random����һ��1-100֮�����, ��ΪҪ�µ���
		int randomNum = r.nextInt(100) + 1;
		
		// 5. ����������Ҫ��ν���, ���޷�Ԥ���û����뼸�ο��Բ²���ȷ, ʹ��while(true)��ѭ������
		while(true){
			// 3. ����¼���û��µĵ�����
			System.out.println("���������µ�����:");
			int num = sc.nextInt();
			// 4. ʹ��¼�������(�û��µ�����)�������(Ҫ�µ�����)���бȽ�, ��������ʾ
			if(num > randomNum){
				System.out.println("�´���");
			}else if(num < randomNum){
				System.out.println("��С��");
			}else{
				// 6. �¶�֮��, break����.
				System.out.println("��ϲ,������");
				break;
			}
		}
		
		System.out.println("��л����ʹ��");
	}
}