/*
ĳ�̳�������Դ��ۣ�����������£�

��ͨ�˿͹�����100Ԫ�����ۣ���100Ԫ��9�ۣ�
��Ա���ﲻ��200Ԫ��8�ۣ���200Ԫ��7.5�ۣ�

��ͬ���۹����ۼӼ��㡣
����ݴ��Żݼƻ����й�����㣬����¼��˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա���͹������ǰ���������ɣ���
���Ӧ����С�����ͣ���

*/
import java.util.Scanner;

public class Homework09{
	public static void main(String[] args){
		//1. ����¼��˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա��
		Scanner sc = new Scanner(System.in);
		System.out.println("������˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա��:");
		int type = sc.nextInt();
		
		//2. �жϵ�ǰ�û������
		if(type != 0 && type != 1){
			System.out.println("��������!");
		}else{
			//2.1 ����������ȷ�������,����ʾ�û�¼����ǰ���
			System.out.println("��������ǰ���������ɣ�:");
			int zqMoney = sc.nextInt();
			
			if(type == 0){
				//��ͨ�˿�
				//3. ������ǰ���,�ж�Ӧ�����
				if(zqMoney < 100){
					System.out.println("Ӧ�����"+(double)zqMoney);
				}else{
					//��100Ԫ��9��
					System.out.println("Ӧ�����"+(zqMoney * 0.9));
				}
				
			}else{
				//��Ա�˿�
				//3. ������ǰ���,�ж�Ӧ�����
				if(zqMoney < 200){
					//����200Ԫ��8��
					System.out.println("Ӧ�����"+(zqMoney * 0.8));
				}else{
					//��200Ԫ��7.5��
					System.out.println("Ӧ�����"+(zqMoney * 0.75));
				}
			}
			
		}
	}
}