public class Demo1Constant {
	/*
		常量：在程序的执行过程中，其值不会发生改变的量（数据）
		
		常量的分类：
		
			字符串常量：	被双引号所包裹的内容
			
			整数常量：		所有整数
			
			小数常量：		所有小数
			
			字符常量：		被单引号包裹的内容，里面只能存放单个字符
			
			布尔常量：		只有两个值，true(真)，false(假)
								布尔常量单独打印没有意义，为了后面要学习的运算符，打基础
			
			空常量：		null, 数组部分详细讲解
								注意：null空常量不能直接打印
	*/
	public static void main(String[] args) {
		//字符串常量: 双引号引起来的就是字符串
		System.out.println("你好，黑马程序员");
		//字符常量: 单引号引起来的是字符
		//注意: 字符常量的''之间有且仅能必须有一个字符
		System.out.println('我');
		
		// 整数常量: 不带小数点的数字
		System.out.println(124);
		
		// 小数常量: 带小数点的数字
		System.out.println(12.3);
		
		//布尔常量: 表示真和假,只有两个值，true表示真,false表示假
		System.out.println(true);
		System.out.println(false);
		System.out.println(5 > 10);
		
		//空常量
		//注意：空常量不能直接打印！
		//System.out.println(null);
	}
}







