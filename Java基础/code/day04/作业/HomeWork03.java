
import java.util.Scanner;
import java.util.Random;
public class HomeWork03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("���������齱����:");
		int number = sc.nextInt();
		String[] arr = new String[number];
		String[] list = {"��˹��˹5Ԫ����ȯ","iPhone13 pro Max�ֻ���","Huawei P50 �ֻ�Ĥ",
		"Air Jordan 1 ����ЬԪ������Ь��","������ƽ��ɳ����һ����"};
		
		System.out.println("������������齱��Ա����:");
		for(int i=0;i<arr.length;i++){
			System.out.println("��"+(i+1)+"������:");
			arr[i] = sc.next();
			
		}
		
		int n = r.nextInt(number)+1;
		int m = r.nextInt(5)+1;
		
		System.out.println("��ϲ:"+arr[n]+"�鵽�˴�"+list[m]+"!!!");
		
	}
}