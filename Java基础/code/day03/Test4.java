import java.util.Scanner;
import java.util.Random;
/*
	�ۺ���ϰ4�� ������С��Ϸ
	���һ�����򣬳������ڲ�����һ��[1,100]���������ʵ������Ч����
	��������Ҫ�µ�����
	50
	50 �´���
	25
	25 ��С��
	40
	40 �´���
	35 
	��ϲ�㣬������
*/
public class Test4{
	public static void main(String[] args){
		//1. ����һ��[1,100]�����
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1;
		
		//2. ����¼���û��µ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�µ�����");
		while(true){
			int guessNumber = sc.nextInt();
			
			//3. ���ֱȽ�
			if(guessNumber > randomNumber){
				System.out.println(guessNumber + " �´���");
			}else if(guessNumber < randomNumber){
				System.out.println(guessNumber + " ��С��");
			}else{
				System.out.println("��ϲ�㣬�����ˣ�");
				break;
			}
		}
	}
}