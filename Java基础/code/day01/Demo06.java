// ����¼��Scanner

// 1. ����
import java.util.Scanner;

public class Demo06{
	public static void main(String[] args){
		// 2. ��������
		Scanner sc = new Scanner(System.in);
		
		// 3. ��������
		System.out.println("���������������");
		String name = sc.next();
		
		System.out.println("������������䣺");
		int ageNumber = sc.nextInt();
		
		System.out.println(name +"��ã������꣺" + ageNumber + "�꣡");
		
	}
}