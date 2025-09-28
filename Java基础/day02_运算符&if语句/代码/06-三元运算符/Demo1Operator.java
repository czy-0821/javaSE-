import java.util.Scanner;

public class Demo1Operator {
	/*
		三元运算符:
		
			格式: 关系表达式 ? 表达式1 : 表达式2;
			
		执行流程：
				首先计算关系表达式的值
				如果值为true，取表达式1的值
				如果值为false，取表达式2的值

					
		需求: 求两个变量的最大值
		
	*/
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		/*
			注意事项:
				1.  ?号前面只要能产生boolean类型的结果就可以了
				2.  三元表达式最终结果用什么类型接收由?号后面的值和:号后面的值的类型决定
					如果类型不一致,要使用大类型接收
				3.  三元表达式不能独立存在,我们必须使用其结果,要么赋值给变量使用,要么打印输出使用
		*/
		int max = a > b ? a : b;
		System.out.println( max);
		
		
		/*
			练习:
				使用程序实现求任意数是否是偶数,实现如下效果:
					请输入一个整数:
					35   
					35是奇数
					
					请输入一个整数:
					36
					36是偶数
		*/
		
		//1. 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int num = sc.nextInt();
		
		//2. 对录入的数进行奇偶数判断
		System.out.println(num % 2 == 0 ? num + "是偶数" : num + "是奇数");
		
		//使用if语句实现
		if(num % 2 == 0){
			System.out.println(num + "是偶数");
		}else{
			System.out.println(num + "是奇数");
		}
		
		if(num % 2 == 1){
			System.out.println(num + "是奇数");
		}
		
		
		
		
	}
}