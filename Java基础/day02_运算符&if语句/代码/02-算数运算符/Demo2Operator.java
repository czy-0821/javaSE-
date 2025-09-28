import java.util.Scanner;

public class Demo2Operator {
	/*
		字符串的 + 操作
		
			当 + 操作中出现字符串时，这个 + 是[字符串连接符]，而不是算术运算。
			代码的执行顺序:
					从上往下,从左往右,有括号先执行括号里的
	*/
	public static void main(String[] args) {
		// 字符串可以使用 +号, 跟[任意数据类型]拼接
		System.out.println("itheima" + 666);		//"itheima666"
		System.out.println("itheima" + true);		//"itheimatrue"
		
		System.out.println(1 + 99 + "年黑马");		//100 + "年黑马"  --> "100年黑马"
		System.out.println("5+5="+5+5);				// "5+5=55"
		System.out.println("5+5="+(5+5));			// 5+5=10
		
		/*	课堂练习:
			设计程序完成以下效果:
				请输入第一个整数:
				10
				请输入第二个整数:
				20
				10 + 20 = 30
		*/
		//2. 创建对象
		Scanner sc = new Scanner(System.in);
		//2.1 给出提示信息
		System.out.println("请输入第一个整数:");
		//3. 接收键盘录入的数据
		int num1 = sc.nextInt();		//10	
		
		//2.1 给出提示信息
		System.out.println("请输入第二个整数:");
		//3. 接收键盘录入的数据
		int num2 = sc.nextInt();		//20
		
		//4. 输出结果: 使用字符串的拼接完成
		System.out.println(num1 + "+"+ num2 +"="+ (num1 + num2));		//"10+20=30"
	}
}