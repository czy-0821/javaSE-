import java.util.Scanner;
public class HomeWork2{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("购物车清单:"+'\n'+
		"1. 宁夏 宁夏黑枸杞(价格: 30, 数量: 2)"+'\n'+
		"2. 罗汉果茶(价格: 20, 数量: 1) "+'\n'+
		"--------------------------------------------");
		
		System.out.println("请输入您的选择:"+'\n'+
		"1. 结算所有 "+'\n'+
		"2. 结算单个");
		
		int opt = sc.nextInt();
		
		
		double sum=0;
		if(opt ==1){
			sum = 30*2+20;
		}else{
			System.out.println("请输入您要结算的商品  1. 宁夏黑枸杞   2. 罗汉果茶");
			int goods = sc.nextInt();
			if(goods ==1)sum = 30*2;
			else sum = 20;
		}
		
		System.out.println("结算成功, 您已支付"+sum+"元");
		
	}
	
}