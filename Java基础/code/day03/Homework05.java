/*
	����¼��һ������, �����1~������֮��, ���е�������, ���������ӡ������̨��. ����: ¼��:
	10, ���ӡ: 1~10֮���������Ϊ 25 ¼��: -10, ���ӡ: ��¼���������Ч, ������¼��. ע��: ��
	���û�¼���������, ��һֱ¼��. ֱ���û�¼����ȷ������, ��ӡ������, �������
*/
import java.util.Scanner;

public class Homework05{
	public static void main(String[] args){
		// 1. �õ��������������֣�num
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�����1");
		int num;
		while(true){
			num = sc.nextInt();
			if(num < 1){
				System.out.println("��¼���������Ч, ������¼��");
			}else{
				break;
			}
		}
		
		// 2. ����1~num֮��, ���е�������
		int sum = 0;
		for(int i = 1; i <= num ; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}
		System.out.println("1~" + num + "֮���������Ϊ��" + sum);
		
		
	}
}