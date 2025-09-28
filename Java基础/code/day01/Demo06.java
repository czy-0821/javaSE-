// 键盘录入Scanner

// 1. 导包
import java.util.Scanner;

public class Demo06{
	public static void main(String[] args){
		// 2. 创建对象
		Scanner sc = new Scanner(System.in);
		
		// 3. 接收数据
		System.out.println("请输入你的姓名：");
		String name = sc.next();
		
		System.out.println("请输入你的年龄：");
		int ageNumber = sc.nextInt();
		
		System.out.println(name +"你好，您今年：" + ageNumber + "岁！");
		
	}
}