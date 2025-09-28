import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		int hgqPrice = 30;
		int hgqCount = 2;
		
		int lhgPrice = 20;
		int lhgCount = 1;
		
		//1. 展示购物车清单
		System.out.println("购物车清单：");
		System.out.println("1. 宁夏黑枸杞(价格："+hgqPrice+"，数量"+hgqCount+")");
		System.out.println("2. 罗汉果茶(价格："+lhgPrice+"，数量"+lhgCount+")");
		System.out.println("-------------------------------------");
		
		//2. 拿到用户输入的选择
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的选择：");
		System.out.println("1. 结算所有");
		System.out.println("2. 结算单个");
		int choice = sc.nextInt();
		
		if(choice == 1){
			//结算所有：将购物车中所有商品都结算掉
			int money = hgqPrice * hgqCount + lhgPrice * lhgCount;
			System.out.println("结算成功，您已支付："+ money + "元");
		}else if(choice == 2){
			//结算单个
			System.out.println("请输入您要结算的商品：1. 宁夏黑枸杞    2. 罗汉果茶");
			int choice1 = sc.nextInt();	
			if(choice1 == 1){
				System.out.println("结算成功，您已支付："+ (hgqPrice * hgqCount) + "元");	
			}else if(choice1 == 2){
				System.out.println("结算成功，您已支付："+ (lhgPrice * lhgCount) + "元");	
			}else{
				System.out.println("输入有误！");
			}
		}else{
			System.out.println("输入有误！");
		}
	
	}
	
}