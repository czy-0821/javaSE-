import java.util.Scanner;

/*
	(1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼�� 
	(2)�ǹ��ʵ��������£� 
		���� �����Ƿ� 
			[10-15) +5000 // [ �ǰ�������˼ ) �ǲ���������˼ [10-15) ���� 10�굽15�� ,����10,������15 
			[5-10) +2500 
			[3~5) +1000 
			[1~3) +500 
			[0~1) +200 
	(3)����û�����Ĺ���Ϊ10����������Ϊ3000����ô�������к��ӡ��ʽ����:
		"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
*/
public class Homework08{
	public static void main(String[] args){
		
		//1. �õ��û�����Ĺ���ͻ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("�����빤�䣺");
		int workAge = sc.nextInt();
		System.out.println("������������ʣ�");
		int baseSalary = sc.nextInt();
		
		//Ӧ��н����
		int bonus = 0;
		
		//2. �жϹ��䣬�޸���н
		if(workAge >= 10 && workAge < 15){
			bonus = 5000;
		}else if(workAge >= 5 && workAge < 10){
			bonus = 2500;
		}else if(workAge >= 3 && workAge < 5){
			bonus = 1000;
		}else if(workAge >= 1 && workAge < 3){
			bonus = 500;
		}else if(workAge >= 0 && workAge < 1){
			bonus = 200;
		}else{
			System.out.println("���Ĺ��䲻������нҪ��!");
		}
		
		//3. ��ӡ���ս��
		System.out.println("��Ŀǰ������"+workAge+"�꣬��������Ϊ "+baseSalary+"Ԫ, Ӧ�ǹ��� "+bonus+"Ԫ,�Ǻ��� "+(baseSalary + bonus)+"Ԫ");
	
	}
	
}