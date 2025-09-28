import java.util.Scanner;

/*

某商场购物可以打折，具体规则如下：
 普通顾客购不满100元不打折，满100元打9折；
 会员购物不满200元打8折，满200元打7.5折；
 不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），
输出应付金额（小数类型）。
*/
public class Test01 {
	
	public static void main(String[] args){
		// 1. 使用Scanner录入顾客的类别（0表示普通顾客，1表示会员）
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顾客类别:");
		int type = sc.nextInt();
		
		//2. 判断用户的类别,走对应的结算逻辑
		if(type == 0){
			//普通顾客购不满100元不打折，满100元打9折
			//3. 键盘录入购物的折前金额（整数即可）
			System.out.println("请输入您的折前金额（整数即可）");
			int zqMoney = sc.nextInt();
			
			//4. 判断折前金额,计算并输出对应的应付金额
			if(zqMoney < 100){
				System.out.println("您的应付金额:" + (zqMoney * 1.0));
			}else{
				System.out.println("您的应付金额:" + (zqMoney * 0.9));
			}
			
		}else if(type ==1){
			//会员购物不满200元打8折，满200元打7.5折；
			//3. 键盘录入购物的折前金额（整数即可）
			System.out.println("请输入您的折前金额（整数即可）");
			int zqMoney = sc.nextInt();
			
			//4. 判断折前金额,计算并输出对应的应付金额
			if(zqMoney < 200){
				System.out.println("您的应付金额:" + (zqMoney * 0.8));
			}else{
				System.out.println("您的应付金额:" + (zqMoney * 0.75));
			}
			
		}else{
			System.out.println("输入有误!请检查后重试!");
		}
	}
}