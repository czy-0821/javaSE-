// 变量的各种定义写法
public class Demo04{
	public static void main(String[] args){
		
		// 1. 定义变量的同时并完成初始化赋值
		int num1 = 10;
		System.out.println(num1);
		
		//2. 先定义，后赋值
		int num2;
		num2 = 20;
		System.out.println(num2);
		
		//3. 一条语句定义同种数据类型的多个变量
		double num3 = 3.14,num4;
		num4 = 5.21;
		System.out.println(num3);
		System.out.println(num4);
	}
}