import java.util.Scanner;

public class Test1{
	
	/*
		案例1： 数值拆分
			设计一个程序，实现如下效果：	
				请输入一个三位数：
				123
				123的个位是：3
				123的十位是：2
				123的百位是：1
				
			分析：降位算法：任何一个数对10取余，结果都是其个位数。
				int ge = num  % 10; 
				int shi = num / 10 % 10;
	*/
	public static void main(String[] args){
		// 1：使用Scanner键盘录入一个三位数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int num = sc.nextInt();
		// 2：个位的计算：数值 % 10
		int ge = num % 10;		
		// 3：十位的计算：数值 / 10 % 10
		int shi = num / 10 % 10;	
		// 4：百位的计算：数值 / 100
		int bai = num / 100;
		// 5：将个位, 十位, 百位拼接上正确的字符串, 打印即可
		System.out.println("整数"+num+"个位为:" + ge);
		System.out.println("整数"+num+"十位为:" + shi);
		System.out.println("整数"+num+"百位为:" + bai);
		
	}
	
}