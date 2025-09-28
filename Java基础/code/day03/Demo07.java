import java.util.Scanner;
/*
	while循环练习
*/
public class Demo07{
	public static void main(String[] args){
		// 需求： 使用while循环求 1~100 之间的偶数和
		//1. 先定义一个求和变量sum
		int sum = 0;
		int k = 1;
		while(k <= 100){
			if(k % 2 == 0){
				sum += k;
			}
			
			k++;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("-----------------");
		// 需求2： 珠穆朗玛峰
		// 1. 定义一个计数器
		int count = 0;
		
		// 2. 开始循环
		double paper = 0.1;
		
		while(paper <= 8844430){
			// 对折
			paper *= 2;
			
			// 计数器 + 1
			count++;
		}
		
		// 打印count
		System.out.println("一张纸折叠：" + count +"次厚度会超越珠峰!");
		
	}
}