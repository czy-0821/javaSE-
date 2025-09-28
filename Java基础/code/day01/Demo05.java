// 变量的注意事项
public class Demo05{
	public static void main(String[] args){
		// 1. 在同一作用范围内，变量名不能重复!
		{
			int a = 10;
			System.out.println(a);
		}
		
		int a = 20;
		System.out.println(a);
		
		// 2. 变量在使用之前一定要先初始化赋值！
		int b;
		b = 30;
		System.out.println(b);
		
		// 3. float类型变量在接收值时，值后面要加上后缀F,后缀F一定要加
		float c = 3.14F;
		System.out.println(c);
		
		// 4. long类型变量在接收值时，值后面要加上后缀L,当数值超过21亿时，必须要加L
		long d = 10000000000L;
		System.out.println(d);
		
	}
}