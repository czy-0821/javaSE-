/*
某商场购物可以打折，具体规则如下：

普通顾客购不满100元不打折，满100元打9折；
会员购物不满200元打8折，满200元打7.5折；

不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），
输出应付金额（小数类型）。

*/
import java.util.Scanner;

public class Homework09{
	public static void main(String[] args){
		//1. 键盘录入顾客的类别（0表示普通顾客，1表示会员）
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入顾客的类别（0表示普通顾客，1表示会员）:");
		int type = sc.nextInt();
		
		//2. 判断当前用户的类别
		if(type != 0 && type != 1){
			System.out.println("输入有误!");
		}else{
			//2.1 输入的类别正确的情况下,才提示用户录入折前金额
			System.out.println("请输入折前金额（整数即可）:");
			int zqMoney = sc.nextInt();
			
			if(type == 0){
				//普通顾客
				//3. 根据折前金额,判断应付金额
				if(zqMoney < 100){
					System.out.println("应付金额"+(double)zqMoney);
				}else{
					//满100元打9折
					System.out.println("应付金额"+(zqMoney * 0.9));
				}
				
			}else{
				//会员顾客
				//3. 根据折前金额,判断应付金额
				if(zqMoney < 200){
					//不满200元打8折
					System.out.println("应付金额"+(zqMoney * 0.8));
				}else{
					//满200元打7.5折
					System.out.println("应付金额"+(zqMoney * 0.75));
				}
			}
			
		}
	}
}