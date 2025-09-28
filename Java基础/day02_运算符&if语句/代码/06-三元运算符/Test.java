public class Test {
	/*
		1. 定义三个变量用于保存和尚的身高
		2. 用三元运算符 , 比较前两个变量，获取较大值。
		3. 用三元运算符 , 让较大值和第三个变量比较，获取最大值。
		4. 输出结果

	*/
	public static void main(String[] args) {
		// 1. 定义三个变量用于保存和尚的身高
		int a = 150;
		int b = 210;
		int c = 165;
		
		// 2. 用三元运算符 , 比较前两个变量，获取较大值。
		int tempMax = a > b ? a : b;
		
		// 3. 用三元运算符 , 让较大值和第三个变量比较，获取最大值。
		int max = tempMax > c ? tempMax : c;
		
		// 4. 用三元运算符 ,求出最小值
		int tempMin = a < b ? a : b;
		int min = tempMin < c ? tempMin : c;
		
		// 5. 求出中间值
		int mid = (a + b + c) - max - min;
		
		// 6. 输出结果
		System.out.println("三个和尚中身高最大值为：" + max);
		System.out.println("三个和尚中身高中间值为：" + mid);
		System.out.println("三个和尚中身高最小值为：" + min);

		/*
			作业：
				将上述代码进行改造，要求输出如下效果:
					三个和尚中身高最大值为：210
					三个和尚中身高中间值为：165					中间值 = (三人的和) - 最大的-最小的.
					三个和尚中身高最小值为：150
		*/
		
	}
}