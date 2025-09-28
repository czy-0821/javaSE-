import java.util.Scanner;
/*
	循环练习3： ATM取款
*/
public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的取款金额：");
		while(true){
			int money = sc.nextInt();
			
			if(money < 100 || money > 10000 || money % 100 != 0){
				System.out.println("输入错误，请重新输入：");
			}else{
				System.out.println("请取走您的现金：" + money);
				break;
			}
		}
		
	}
}