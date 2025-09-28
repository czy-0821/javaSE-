public class Demo5For {
	/*
		需求：在控制台输出所有的 “水仙花数”
		
				水仙花数是一个三位数
				水仙花数的个位、十位、百位的数字立方和等于原数
	
		分析:
			1. 通过循环获取所有的三位数100-999
			2. 将每一个三位数拆分为个位, 十位, 百位
			3. 加入if判断条件, 计算是否是水仙花数, 是的话输出打印.
		思考: 如何求出一共有多少个水仙花数呢?    -- 计数器思想
	*/
	public static void main(String[] args) {
		
		// 定义一个计数器变量,初始值为0
		int count = 0;
		
		// 1. 通过循环获取所有的三位数100-999
		for(int i = 100; i < 1000; i++){
			// 2. 将每一个三位数拆分为个位, 十位, 百位
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			// int bai = i / 100;
			// 3. 加入if判断条件, 计算是否是水仙花数, 是的话输出打印.
			if((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
				System.out.println(i);
				//计数器+1
				count++;
			}
		}
		
		//输出计数器变量即可
		System.out.println("水仙花个数为:"+count);
	}
}