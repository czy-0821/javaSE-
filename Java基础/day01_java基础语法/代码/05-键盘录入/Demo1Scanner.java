
import java.util.Scanner;

public class Demo1Scanner {
	
	/*
		����1: ����, ��Ҫд��class������
				import java.util.Scanner;
				
		����2: ��������
				Scanner sc = new Scanner(System.in);
				ֻ��sc���Ըı�, �������ڹ̶���ʽ
				
		����3: ʹ�ñ�����������
				int i = sc.nextInt();
				 ֻ��i�������Ըı�, �������ڹ̶���ʽ
	*/
	public static void main(String[] args) {
		// ����2: ��������
		Scanner sc = new Scanner(System.in);
		
		// �ڽ��ռ���¼�������֮ǰ,���û�һ�����õ���ʾ��Ϣ
		System.out.println("������������ʦ������:");
		
		// ����3: ʹ��sc��������
		//int age = sc.nextInt();
		// ����3: ʹ��sc��������
		double age = sc.nextDouble();
		
		System.out.println(age);
	}
}

