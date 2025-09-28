
import java.util.Scanner;

public class Demo1Scanner {
	
	/*
		步骤1: 导包, 需要写在class的上面
				import java.util.Scanner;
				
		步骤2: 创建对象
				Scanner sc = new Scanner(System.in);
				只有sc可以改变, 其他属于固定格式
				
		步骤3: 使用变量接受数据
				int i = sc.nextInt();
				 只有i变量可以改变, 其他属于固定格式
	*/
	public static void main(String[] args) {
		// 步骤2: 创建对象
		Scanner sc = new Scanner(System.in);
		
		// 在接收键盘录入的数据之前,给用户一个良好的提示信息
		System.out.println("请输入助教老师的年龄:");
		
		// 步骤3: 使用sc接受整数
		//int age = sc.nextInt();
		// 步骤3: 使用sc接受整数
		double age = sc.nextDouble();
		
		System.out.println(age);
	}
}

