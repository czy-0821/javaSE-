import java.util.Scanner;
public class HomeWork8{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����빤��:");
		int age = sc.nextInt();
		
		System.out.println("�������������:");
		int money1 = sc.nextInt();
		int newMoney=0;
		int add=0;
		
		if(age<15&&age>=10){newMoney = money1+5000;add=5000;}
		else if(age>=5){newMoney = money1+2500;add=2500;}
		else if(age>=3){newMoney = money1+1000;add=1000;}
		else if(age>=1){newMoney = money1+500;add=500;}
		else if(age>=0){newMoney = money1+200;add=200;}
		
		System.out.println("��Ŀǰ������"+age+"�꣬��������Ϊ "+money1+"Ԫ, Ӧ�ǹ���"+add+"Ԫ,�Ǻ��� "+newMoney+"Ԫ");
	}
	
}