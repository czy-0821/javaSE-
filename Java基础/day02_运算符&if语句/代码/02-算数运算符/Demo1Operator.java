public class Demo1Operator {
	/*
		运算符: 
		
			对[常量]或[变量]进行操作的符号
	
		算数运算符 
		
			+ - * : 跟小学数学的运算方式一样
			
			/ : 整数相除,结果只能得到整数,如果想要得到带有小数的结果,必须加入小数(浮点类型)的运算
			
			%(取模) : 取余数
	*/
	public static void main(String[] args){
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		
		System.out.println("-----------------------");
		
		/*
			/ : 整数相除,结果只能得到整数,如果想要得到带有小数的结果,必须加入小数(浮点类型)的运算
		*/
		System.out.println(10 / 2);		// 5
		System.out.println(10 / 3);		// 3
		System.out.println(10 / 3.0);		// 3.3333333333333335
		System.out.println(10.0 / 3);		// 3.3333333333333335
		
		System.out.println("-----------------------");
		
		
		// %(取模) : 取余数
		System.out.println(5 % 2);	   //1
		System.out.println(4 % 2);     //0
		System.out.println(3 % 2);     //1
		System.out.println(2 % 2);     //0
		System.out.println(1 % 2);     //1
		
		
		
		
		
		
		
		
		
		
		char c1 = 'a';
		int c2 = c1 + 1;		// 就是取的字符'a'对应的ACII码值97参与运算的
		System.out.println(c2);
		System.out.println("=============");
		
		char ch1 = '传';
		char ch2 = '智';
		char ch3 = '播';
		char ch4 = '客';
		
		System.out.println((int)ch1);    //20256
		System.out.println((int)ch2);    //26234
		System.out.println((int)ch3);    //25773
		System.out.println((int)ch4);    //23458
		
		/*
			'a'  --> 97
			'A'  --> 65
			'0'  --> 48
		*/
		
		
		
		
	}
}