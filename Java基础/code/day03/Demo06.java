import java.util.Scanner;
/*
	while循环
*/
public class Demo06{
	public static void main(String[] args){
		//需求： 循环打印5次Helloworld
		int i = 1;
		for(; i <= 5; ){
			//循环体语句
			System.out.println("HelloWorld");
			i++;
		}
		
		System.out.println(i);
		
		System.out.println("-----------------");
		
		// 使用while循环实现
		int j = 1;
		while(j <= 5){
			System.out.println("HelloWorld");
			j++;
		}
		System.out.println(j);
		
		System.out.println("-----------------");
		
		// 使用do while循环实现, 特点： 先执行，后判断
		int k = 1;
		do{
			System.out.println("HelloWorld");
			k++;
		}while(k <= 5);
		
		
	}
}