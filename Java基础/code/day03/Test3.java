import java.util.Scanner;
/*
	ѭ����ϰ3�� ATMȡ��
*/
public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ȡ���");
		while(true){
			int money = sc.nextInt();
			
			if(money < 100 || money > 10000 || money % 100 != 0){
				System.out.println("����������������룺");
			}else{
				System.out.println("��ȡ�������ֽ�" + money);
				break;
			}
		}
		
	}
}