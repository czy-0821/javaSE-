public class Demo02{
	
	/*
		类型转换：强制类型转换
			特点： 左小右大，不可以直接赋值!如果硬是要赋，则需要强转格式!
	*/
	public static void main(String[] args){
		
		double a = 3.14;
		int b = (int)a;
		System.out.println(a);
		System.out.println(b);
		
		//基于强制类型转换优化下面程序
		float c = 10;
		long d = (long)c;
		System.out.println(c);
		System.out.println(d);
		
		
		// 注意1： byte、short和char类型数据参与运算均会自动转换为int类型
		byte b1 = 10;
		byte b2 = 20;
		// 第三行代码会报错，b1和b2会自动转换为int类型，计算结果为int，int赋值给byte需要强制类型转换。
		byte b3 = (byte)(b1 + b2);     
		System.out.println(b3);
		
		System.out.println("--------------");
		
		byte num1 = 10;
		short num2 = 30;
		short num3 = (short)(num1 + num2);
		
		System.out.println("--------------");
		
		// 注意2： java中存在常量优化机制，如果 = 右边都是常量参与运算，那么这个计算会在编译(javac)时完成!
		byte b4 = 3 + 4;
		System.out.println(b4);
	}
	
}