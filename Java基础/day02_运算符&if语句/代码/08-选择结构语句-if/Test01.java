import java.util.Scanner;

/*

ĳ�̳�������Դ��ۣ�����������£�
 ��ͨ�˿͹�����100Ԫ�����ۣ���100Ԫ��9�ۣ�
 ��Ա���ﲻ��200Ԫ��8�ۣ���200Ԫ��7.5�ۣ�
 ��ͬ���۹����ۼӼ��㡣
����ݴ��Żݼƻ����й�����㣬����¼��˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա���͹������ǰ���������ɣ���
���Ӧ����С�����ͣ���
*/
public class Test01 {
	
	public static void main(String[] args){
		// 1. ʹ��Scanner¼��˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա��
		Scanner sc = new Scanner(System.in);
		System.out.println("������˿����:");
		int type = sc.nextInt();
		
		//2. �ж��û������,�߶�Ӧ�Ľ����߼�
		if(type == 0){
			//��ͨ�˿͹�����100Ԫ�����ۣ���100Ԫ��9��
			//3. ����¼�빺�����ǰ���������ɣ�
			System.out.println("������������ǰ���������ɣ�");
			int zqMoney = sc.nextInt();
			
			//4. �ж���ǰ���,���㲢�����Ӧ��Ӧ�����
			if(zqMoney < 100){
				System.out.println("����Ӧ�����:" + (zqMoney * 1.0));
			}else{
				System.out.println("����Ӧ�����:" + (zqMoney * 0.9));
			}
			
		}else if(type ==1){
			//��Ա���ﲻ��200Ԫ��8�ۣ���200Ԫ��7.5�ۣ�
			//3. ����¼�빺�����ǰ���������ɣ�
			System.out.println("������������ǰ���������ɣ�");
			int zqMoney = sc.nextInt();
			
			//4. �ж���ǰ���,���㲢�����Ӧ��Ӧ�����
			if(zqMoney < 200){
				System.out.println("����Ӧ�����:" + (zqMoney * 0.8));
			}else{
				System.out.println("����Ӧ�����:" + (zqMoney * 0.75));
			}
			
		}else{
			System.out.println("��������!���������!");
		}
	}
}