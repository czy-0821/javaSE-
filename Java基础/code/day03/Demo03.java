import java.util.Scanner;
/*
	for循环
*/
public class Demo03{
	public static void main(String[] args){
		//需求： 循环打印5次Helloworld
		for(int i = 1; i <= 5; i++){
			//循环体语句
			System.out.println("HelloWorld");
		}
		
		System.out.println("-----------------");
		
		// 输出 1~ 5
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		// 输出 5~ 1
		for(int i = 5; i >= 1; i--){
			System.out.println(i);
		}
	}
}