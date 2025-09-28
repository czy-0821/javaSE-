//变量的作用范围: 一个变量只在包含它的大括号内有效
public class Demo5 {
	public static void main(String[] args){
		int a = 5;			//定义一个变量，变量名叫a，初始值为5
	
		
		//局部代码块儿
		{
			//1. 在重复相同的作用范围内，变量名唯一，不能重复定义
			a = 10;						// 将变量a的值修改为10
			System.out.println(a);		// 输出变量a的值
		}	
		
		
		System.out.println(a);			// 输出变量a的值	
		
		int b = 20;
		System.out.println(b);
	}
}