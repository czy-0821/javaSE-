public class Demo03{
	
	/*
		算术运算符
	*/
	public static void main(String[] args){
		int a = 5;
		double b = 2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);			// 注意：整数相除，结果为整数，如果希望得到小数，则需要小数参与运算
		System.out.println(a % b);			// % 取的是两相除后得到的余数部分
		
		
		double num1 = 0.1;
		double num2 = 0.2;
		System.out.println(num1 + num2);		//基本类型的运算偏精度的，如果要进行精确运算，后续需要使用Bigdecimal
	}
	
}