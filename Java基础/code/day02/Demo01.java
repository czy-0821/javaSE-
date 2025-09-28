public class Demo01{
	
	/*
		类型转换：隐士转换（自动类型转换）
			特点： 左大右小，可以直接赋值!
	*/
	public static void main(String[] args){
		
		int a = 10;
		double b = a;
		
		System.out.println(a);		// 10
		System.out.println(b);		// 10.0
		
		
		//分析下列代码是否有问题，如果有，请说明原因，并解决。
		float c = 10;
		double d = c;
		System.out.println(c);
		System.out.println(d);
	}
}