import java.util.Scanner;

public class Demo1If {
	/*
		��ʽ��
			if (��ϵ���ʽ) {
				�����;	
			}
			
		ִ�����̣�
		
			���ȼ����ϵ���ʽ��ֵ
			�����ϵ���ʽ��ֵΪtrue��ִ�������
			�����ϵ���ʽ��ֵΪfalse�Ͳ�ִ�������
			����ִ�к�����������

		ע������:
		
			1. ���if��������Ƶ������, ��һ�����, ��������ʡ�Բ�д
				���ǲ�����!
				
			2. if����С������, ��Ҫд�ֺ�
				
	*/
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		// ����������18��, �Ϳ���������
		int age = 27;
		
		if(age >= 18 && age <= 75){
			System.out.println("����������");
		}
			
		System.out.println("����");
		
		
		
		
		
		
		
		//˼��: �ж�һ�����Ƿ���ż��,ʹ��if�������ʵ��?
		/*
			ʹ�ó���ʵ�����������Ƿ���ż��,ʵ������Ч��:
				������һ������:
				35
				35������
				
				������һ������:
				36
				36��ż��
		*/
		
		//1. ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		
		
		
		
		if(num % 2 == 0){
			System.out.println(num+"��ż��");
		}else{
			System.out.println(num+"������");
		}
		
	}
}