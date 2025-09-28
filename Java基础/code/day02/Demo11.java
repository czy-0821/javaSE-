import java.util.Scanner;

public class Demo11{
	
	/*
		三元运算符
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数：");
		int c = sc.nextInt();
		
		int tempMax = a > b ? a : b;
		int max = tempMax > c ? tempMax : c;
		
		System.out.println("max:" + max);
	}
	
}