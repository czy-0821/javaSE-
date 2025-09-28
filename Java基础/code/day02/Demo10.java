public class Demo10{
	
	/*
		短路逻辑运算符 
			&&： 短路与
				 短路效果： 左侧为false，右侧不执行!
				 
			||：短路或
				 短路效果： 左侧为true，右侧不执行!
	*/
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		
		boolean res = x++ > 4 && y++ > 3;
		System.out.println(res);	// false
		System.out.println(x);		// 4
		System.out.println(y);		// 4
		
		
		int a = 10;
		int b = 15;
		boolean res1 = a++ > 5 || b-- < 20;
		System.out.println(res1);	// true
		System.out.println(a);		// 11
		System.out.println(b);		// 15
	}
	
}