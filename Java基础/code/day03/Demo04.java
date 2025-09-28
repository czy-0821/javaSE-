import java.util.Scanner;
/*
	循环常见操作：1. 累加和
*/
public class Demo04{
	public static void main(String[] args){
		//需求： 计算1~100 之间的和
		
		//1. 定义一个求和变量，用来记录最终的求和结果
		int sum = 0;
		
		//2. 循环累加
		for(int i = 1; i <= 100; i++){
			/*
				第一次循环： sum = 0 + 1;       sum = 1;
				第二次循环： sum = 1 + 2;       sum = 3;
				第三次循环： sum = 3 + 3;       sum = 6;
			*/
			if(i % 2 == 1){
				sum += i;   // sum = sum + i;	
			}
			
		}
		
		//3. 打印sum
		System.out.println("sum: " + sum);
		
	}
}