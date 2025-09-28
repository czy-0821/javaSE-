public class Demo08{
	
	/*
		关系运算符  -- 比较运算符
	*/
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
		System.out.println(a > b);		// false
		System.out.println(a >= b);		// false
		System.out.println(a < b);		// true
		System.out.println(a <= b);		// true
		
		// 关系运算符最终产生的结果都是boolean类型,如果我们要接收这个结果数据，应该定义boolean类型变量接收。
		boolean res = a == b;
		System.out.println(res);
	}
	
}