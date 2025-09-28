public class WhileTest {
	
	/*
		使用while循环实现求1 -- 100 之间的数据和
	*/
	public static void main(String[] args){
		
		//1. 定义累加和变量,初始值为0
		int sum = 0;
		
		//2. 循环1--100 , 将每一个数累加到sum上
		int i = 1;									// 初始化语句
		while(i <= 100){							// 条件判断语句
			sum += i;								// 循环体语句
			i++;									// 步进表达式
		}
		
		System.out.println("1--100的数据和为: "+sum);
		
	}
	
}