import java.util.Scanner;
/*
	ѭ��������䣺
		break: ��������ѭ��
		continue: ��������ѭ���������´�ѭ��
*/
public class Demo09{
	public static void main(String[] args){
		// ����1�� ���ݴ�1~10�� ����6¥��Ҫ��������Ϊû�˰�6¥������¥�㶼�����£���Ҫ������
		for(int i = 1; i <= 10; i++){
			if(i == 6){
				continue;	
			}
			System.out.println(i + "�㵽��....");
		}
		
		System.out.println("-----------------------");
		
		// ����2�� ���ݴ�1~10�� ����3¥���ֹ���,�����޷�������...
		for(int i = 1; i <= 10; i++){
			if(i == 3){
				break;	
			}
			System.out.println(i + "�㵽��....");
		}
	}
}