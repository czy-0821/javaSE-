public class Demo1Conversion {
	/*
		隐式转换: 将数据类型中, 取值范围小的数据, 给取值范围大的类型赋值, 可以直接赋值
		    自动类型转换:  左大右小,自动转,我们啥也不用干
	*/
	public static void main(String[] args) {
		int a = 10;			// int 4个字节
		
		/*
			jvm会自动将a的值克隆一份出来,然后赋值给double类型的变量b
			这时候底层会做语法的校验, 发现等号左边b的类型是double
			这时候需要先将a克隆出来的值提升为10.0,然后再放进b中
		*/
		double b = a;		// double 8个字节
		System.out.println(b); //10.0
		
		//细节1： 如果将两个不同类型的值(变量/常量)进行运算时,会先将小类型提升为大类型
		//只有大家类型一致时,才正式进行运算
		double c = 3.14;
		double d = a + c;
		System.out.println(d);
		
		System.out.println(10);
		
		
		//细节2:  byte,short,char 这三种类型参与运算时,会第一时间提升为int
		byte b1 = 5;   
		byte b2 = 6;
		
		/*
			b1,b2都是byte,现在给他两做加法运算,这时候他们的值会被克隆出来提升为int,
			  变成两个int相加,结果为int
		*/
		int b3 = b1 + b2;
		System.out.println(b3);
		
		
		short s1 = 100;
		/*
			1. s1是short, short参与运算,第一时间提升为int
			2. s1提升为int后,发现要和5.21做加法运算, 需要再次对s1进行自动类型提升,提升为double: 100.0
			3. 100.0 + 5.21,得到105.21,将105.21赋值给s2,s2的类型就需要写成double
		*/
		double s2 = s1 + 5.21;
		System.out.println(s2);
	}
}