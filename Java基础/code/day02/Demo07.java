public class Demo07{
	
	/*
		赋值运算符
	*/
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		a += b;			// a = a + b;
		
		System.out.println(a);		// 30
		System.out.println(b);
		
		
		// 注意：扩展赋值运算符底层隐含了强制类型转换
		short s1 = 10;
		s1 += 15;				// 相当于： s1 = (short)(s1 + 15);
		System.out.println(s1);
	}
	
}