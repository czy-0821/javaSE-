import java.util.Scanner;
public class HomeWork7{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		lo:while(true){
			System.out.println("������ɼ�(����101��������):");
			int num = sc.nextInt();
			if(num<80&&num>=0)System.out.println("������, ���������ֶ���һ�����ĵ���~");
			else if(num<90)System.out.println("���ν��һ��");
			else if(num<95)System.out.println("���ֳ�һ��");
			else if(num<=100)System.out.println("���г�һ��");
			else break lo;
		}
		
	}
	
}